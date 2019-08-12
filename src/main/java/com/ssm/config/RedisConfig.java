package com.ssm.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

//   创建JedisPoolConfig对象,完成配置池链接.@ConfigurationProperties:会将前缀相同的内容创建一个实体。
    @Bean
    @ConfigurationProperties(prefix="spring.redis.pool")
    public JedisPoolConfig jedisPoolConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(10);      /*最大空闲数*/
        config.setMinIdle(5);        /*最小空闲数*/
        config.setMaxTotal(20);         /*最大连接数*/
        return config;
    }

//    创建JedisConnectionFactory，配置Redis链接信息
    @Bean
    @ConfigurationProperties(prefix="spring.redis")
    public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig config){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setPoolConfig(config);      /*关联连接池的配置对象*/
        factory.setHostName("192.168.70.128");  /*配置链接Redis的信息*/
        factory.setPort(6379);   /*redis端口*/
        return factory;
    }

//     创建RedisTemplate:用于执行Redis操作的方法
    @Bean
    public RedisTemplate<String,Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory){
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory);   /*关联*/
        template.setKeySerializer(new StringRedisSerializer());  /*为key设置序列化器*/
        template.setValueSerializer(new StringRedisSerializer());  //为value设置序列化器
        return template;
    }


}
