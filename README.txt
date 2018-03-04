1) Create maven project;
2) Add following content to pom.xml:
    <properties>
        <spring.version>5.0.0.RELEASE</spring.version>
        <javax.servlet>3.1.0</javax.servlet>
        <jstl>1.2</jstl>
    </properties>
    <dependencies>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>${javax.servlet}</version>
        </dependency>
        <dependency>
            <groupId>jstl</groupId>
            <artifactId>jstl</artifactId>
            <version>${jstl}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${spring.version}</version>
        </dependency>
    </dependencies>
3) Create classes WebConfig extends WebMvcConfigurerAdapter and ApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer
4) Create index.jsp file into WEB-INF/view;
5) Configure addResourceHandlers(..) method and @Bean InternalResourceViewResolver
6) Create class Controller;
7) Run application with Tomcat;