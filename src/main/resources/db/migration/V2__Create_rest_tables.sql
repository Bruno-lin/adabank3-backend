/*创建用户表*/
create table user
(
    id       int         not null auto_increment,
    username varchar(50) not null unique,
    password varchar(50) not null,
    primary key (id)
) engine = innodb;

/*创建角色表*/
create table role
(
    id          int         not null auto_increment,
    name        varchar(50) not null unique,
    description varchar(50) not null,
    primary key (id)
) engine = innodb;

/*创建角色权限对应表*/
create table permission
(
    id       int         not null auto_increment,
    username varchar(50) not null unique,
    password varchar(50) not null,
    primary key (id)
) engine = innodb;

/*创建用户角色对应表*/
create table user_role
(
    id      int         not null auto_increment,
    user_id int null ,
    role_id int null,
    primary key (id)
) engine = innodb;

/*外键绑定*/
alter table user_role
    add constraint binding_fk
        foreign key (user_id)
            references user (id);

/*外键绑定*/
alter table user_role
    add constraint binding_fk_1
        foreign key (role_id)
            references role (id);

/*创建角色权限对应表*/
create table role_permissions
(
    id            int         not null auto_increment,
    role_id       int null,
    permission_id int null,
    primary key (id)
) engine = innodb;

/*外键绑定*/
alter table role_permissions
    add constraint binding_fk_2
        foreign key (role_id)
            references role (id);

/*外键绑定*/
alter table role_permissions
    add constraint binding_fk_3
        foreign key (permission_id)
            references permission (id);

