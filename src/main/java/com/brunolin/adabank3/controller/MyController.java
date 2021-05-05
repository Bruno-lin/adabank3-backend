package com.brunolin.adabank3.controller;


import com.brunolin.adabank3.response.Response;
import mapper.CustomerMapper;
import model.Customer;
import model.CustomerExample;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


/**
 * @author bruno
 */
@RestController
@RequestMapping("/api")
public class MyController {
    private final CustomerMapper customerMapper;
    //用户
    private static final String[] USERS = new String[]{"13889401292", "13478783293", "admin@bank.cn"};
    private static final String[] PASSWORDS = new String[]{"123456", "helloworld", "adalab2020"};
    //是否登陆过
    private boolean user_has_login = false;

    public MyController(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @GetMapping("/status")
    public Response<String> status() {
        Customer customer = new Customer();
        customer.setUsername("foobar");
        customer.setBalance(999.00);
        customer.setBusiness("foobar");
        customerMapper.insert(customer);
        return Response.of("Successfully inserted a customer!");
    }

    //获取指定id客户
    @GetMapping("/customers/{id}")
    public Response<Customer> customers(@PathVariable Integer id) {
        Customer customer = customerMapper.selectByPrimaryKey(id);
        if (customer != null) {
            return new Response<>("OK", null, customer);
        } else
            return new Response<>("Error", "用户不存在", null);
    }

    //查询
    @GetMapping("/customers")
    public Response<List<Customer>> query(@RequestParam(value = "query", required = false) String query) {
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria cri = example.createCriteria();
        cri.andDeletedEqualTo(0);
        //查询所有顾客
        if (query.equals("{}")) {
            List<Customer> customers = customerMapper.selectByExample(example);
            return new Response<>("OK", null, customers);
        }
        //查询参数的类型及值
        String queryParam = query.substring(2, query.indexOf(":") - 1);
        String valueParam = query.substring(query.indexOf(":") + 2, query.indexOf("}") - 1);
        System.out.println(queryParam);
        System.out.println(valueParam);
        //查询卡号（精确搜索）
        if (queryParam.equals("cardNumber")) {
            cri.andCardNumberEqualTo(valueParam);
        }
        //查询最少余额
        if (queryParam.equals("minBalance")) {
            cri.andBalanceGreaterThanOrEqualTo(Double.parseDouble(valueParam));
        }

        //查询最大余额
        if (queryParam.equals("maxBalance")) {
            cri.andBalanceLessThanOrEqualTo(Double.parseDouble(valueParam));
        }

        //查询公司名
        if (queryParam.equals("companyName")) {
            cri.andCompanyNameLike('%' + valueParam + '%');
        }
        //查询公司地址
        if (queryParam.equals("companyAddress")) {
            cri.andCompanyAddressLike('%' + valueParam + '%');
        }
        //查询业务范围
        if (queryParam.equals("business")) {
            cri.andBusinessLike('%' + valueParam + '%');
        }
        //查询法人姓名（精确搜索）
        if (queryParam.equals("legalRepName")) {
            cri.andLegalRepAddrEqualTo(valueParam);
        }

        List<Customer> customers = customerMapper.selectByExample(example);
        return new Response<>("OK", null, customers);
    }

    //添加顾客
    @PostMapping("/customers")
    public Response<String> addCustomer(@RequestBody Customer customer) {
            customerMapper.insertSelective(customer);
            return Response.of("Successfully inserted a customer!");
    }

    //删除顾客
    @RequiresPermissions("delete")
    @DeleteMapping("/customers/{id}")
    public Response<String> deleteCustomer(@PathVariable("id") Integer id) {
        Customer customer = customerMapper.selectByPrimaryKey(id);
        customer.setDeleted(1);
        customerMapper.updateByPrimaryKeySelective(customer);
        return Response.of("Successfully deleted a customer!");
    }

    //更新顾客
    @RequiresPermissions("update")
    @PostMapping("/customers/{id}")
    public Response<String> updateCustomer(@RequestBody Customer customer) {
        customerMapper.updateByPrimaryKeySelective(customer);
        return Response.of("Successfully updated a customer!");
    }


    //测试
    @RequiresAuthentication
    @GetMapping("/me")
    public Response<String> me(HttpSession session) {
        Object username = session.getAttribute("username");
        if (username != null) {
            return Response.of("登陆成功!");
        } else
            return new Response<>("Error", "尚未登陆", null);
    }

    //登陆
    @PostMapping("/login")
    public Response<String> login(@RequestBody Map<String, String> data, HttpSession session) {
        String username = data.get("username");
        String password = data.get("password");

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();


        try {
            subject.login(token);
            session.setAttribute("username", username);
            return new Response<>("OK", null, username);
        } catch (AuthenticationException e) {
            return new Response<>("Error", "用户名密码错误", null);
        }
//        if (validCredentials(username, password)) {
//            user_has_login = true;
//            return me();
//        } else
//            return new Response<>("Error", "用户名密码错误", null);
    }

    //退出
    @RequiresAuthentication
    @PostMapping("/logout")
    public Response<String> logout(HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return Response.of("已退出");
    }

//    //密码是否匹配
//    private boolean validCredentials(String username, String password) {
//        return IntStream.range(0, USERS.length).anyMatch(i -> username.equals(USERS[i]) && password.equals(PASSWORDS[i]));
//    }
}


