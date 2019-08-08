package com.ssm;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@ServletComponentScan         //在springboot启动时会扫描webservlet,并将该类实例化
//@MapperScan("com.ssm")   //用户扫描mybatis的mapper接口
@MapperScan(basePackages="com.ssm.mapper")
@EnableCaching
public class Application {

    public static void main(String[] args) {
//        ConfigurableApplicationContext app = SpringApplication.run(Application.class, args);
        SpringApplication.run(Application.class, args);
//        System.out.println(app.getEnvironment().getProperty("name"));


    }


//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/xxx/xxx/mapping/*Mapper.xml"));
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.xxx.xxx.mapping");
//        return sqlSessionFactoryBean.getObject();
//    }

}
