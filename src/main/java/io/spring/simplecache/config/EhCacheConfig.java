package io.spring.simplecache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

//Created class for Eh

@Configuration
@EnableCaching

public class EhCacheConfig {

   @Bean
    public CacheManager cacheManager(){
       return new EhCacheCacheManager();
   }


   //need to create factory bean
   @Bean
    public EhCacheManagerFactoryBean factoryBean(){
       EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
       bean.setConfigLocation(new ClassPathResource("ehcache.xml"));
       bean.setShared(true);
       return bean;
   }
}
