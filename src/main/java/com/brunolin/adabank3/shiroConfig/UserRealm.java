package com.brunolin.adabank3.shiroConfig;

import mapper.*;
import model.*;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;

/**
 * 为了方便观看，我将UserRealm类的实现写在这里了
 */
public class UserRealm extends AuthorizingRealm {

    @Resource
    private UserMapper userMapper;
    private RoleMapper roleMapper;
    private PermissionMapper permissionMapper;
    private UserRoleMapper userRoleMapper;
    private RolePermissionMapper rolePermissionMapper;

    // 9. 前面被authc拦截后，需要认证，SecurityBean会调用这里进行认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        if (username == null) {
            return null;
        }

        //9.1 查询数据库，获取用户信息
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        User user = userMapper.selectByExample(userExample).get(0);

        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
    }

    // 10. 前面被roles拦截后，需要授权才能登录，SecurityManager需要调用这里进行权限查询
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        User user = (User) principalCollection.getPrimaryPrincipal();

        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andIdEqualTo(user.getId());
        //10.1 获取当前用户的角色和权限信息
        //10.2 对应角色
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        for (UserRole userRole : userRoles) {
            Integer roleId = userRole.getRole_id();
            Role role = roleMapper.selectByPrimaryKey(roleId);
            info.addRole(role.getName());
            // 10.3 对应用户权限
            RolePermissionExample rolePermissionExample = new RolePermissionExample();
            rolePermissionExample.createCriteria().andRole_idEqualTo(role.getId());
            List<RolePermission> rolePermissions = rolePermissionMapper.selectByExample(rolePermissionExample);
            for (RolePermission rolePermission : rolePermissions) {
                Integer permissionId = rolePermission.getPermission_id();
                Permission permission = permissionMapper.selectByPrimaryKey(permissionId);
                info.addStringPermission(permission.getUsername());
            }
        }
        return info;
    }
}
