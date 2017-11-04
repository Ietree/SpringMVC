#在web.xml文件中配置拦截为/的时候，解决静态资源无法访问的三种方法
1、当中央调度器中的url-pattern配置问/时，可以解决restful风格的访问路径，但是需要在web.xml中添加以下配置，表示访问时不拦截这些静态资源
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

2、解决web.xml中配置/拦截之后不能访问静态资源第二种方法，在springmvc.xml文件中添加
<mvc:default-servlet-handler/>
	
3、解决web.xml中配置/拦截之后不能访问静态资源的第三种方法，在springmvc.xml文件中添加
<mvc:resources location="/images/" mapping="/images/**"/>
<mvc:resources location="/js/" mapping="/js/**"/>
<mvc:resources location="/css/" mapping="/css/**"/>