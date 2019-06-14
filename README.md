# Mycat2-example

展示mycat2各种使用方式

### 要求

1.不写前端,统一使用swagger作为界面,

界面地址是

```
http://localhost:8080/swagger-ui.html#/
```

2.代码越简单越好,不要引入私货

3.mycat的使用的测试schema是test,table是travelrecord

```sql
CREATE TABLE `travelrecord` ( `id` bigint(20) NOT NULL, `user_id` varchar(100) DEFAULT NULL,
`traveldate` date DEFAULT NULL, `fee` decimal(10,0) DEFAULT NULL, `days` int(11) DEFAULT NULL,
`blob` longblob DEFAULT NULL );
```

连接字符串统一:

```
jdbc:mysql://localhost:8066/test
```

端口:8066

用户名:root

密码:123456

4.mysql客户端版本是mysql-connector-java-8.0.16

5.请在本地搭建java开发环境并运行mycat2,便于掌握bug的信息

6.测试之前请确保在mysql上执行是正确的,然后再在mycat上测试

7.测试,注意信息安全,严禁使用真实的,机密的数据

------



### 待办

- [ ] 通过注解在DAO添加切面,在请求的SQL上添加切换schema的mycat注解,使sql发往不同的schama
- [ ] 引入hibernate框架
- [ ] 引入jooq框架

### 任务记录

------

