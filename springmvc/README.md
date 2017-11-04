# 为了解决restful风格的访问路径问题，在web.xml文件中的中央调度器的url-pattern需要配置为/，解决静态资源无法访问的三种方法
1、解决web.xml中配置/拦截之后不能访问静态资源第一种方法，需要在web.xml中添加以下配置，表示访问时不拦截这些静态资源
```
<servlet-mapping>
    <servlet-name>default</servlet-name>
    <url-pattern>*.jpg</url-pattern>
</servlet-mapping>
<servlet-mapping>
    <servlet-name>default</servlet-name>
    <url-pattern>*.png</url-pattern>
</servlet-mapping>
<servlet-mapping>
    <servlet-name>default</servlet-name>
    <url-pattern>*.css</url-pattern>
</servlet-mapping>
<servlet-mapping>
    <servlet-name>default</servlet-name>
    <url-pattern>*.js</url-pattern>
</servlet-mapping>
```

2、解决web.xml中配置/拦截之后不能访问静态资源第二种方法，在springmvc.xml文件中添加
```
<mvc:default-servlet-handler/>
```
	
3、解决web.xml中配置/拦截之后不能访问静态资源的第三种方法，在springmvc.xml文件中添加
```
<mvc:resources location="/images/" mapping="/images/**"/>
<mvc:resources location="/js/" mapping="/js/**"/>
<mvc:resources location="/css/" mapping="/css/**"/>
```

# 前、后台相对路径和绝对路径
## 1、前台路径
前台路径的参照路径是：当前web服务器的根，即http://127.0.0.1:8080
因为 绝对路径 = 参照路径 + 相对路径，所以当前超链接所提交的请求绝对路径是：
http://localhost:8080/welcome
<a href="/welcome.html">跳转到欢迎页面</a>

## 2、后台路径
后台路径的参照路径是：web应用的根路径。
当前web应用的根路径是：http://localhost:8080/springmvc
也就是说，现在要求的绝对路径是：参照路径 + 相对路径
http://localhost:8080/springmvc/welcome.html




