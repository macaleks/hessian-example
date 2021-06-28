package com.machale.client.hs.config;

import com.machale.client.hs.client.UserInfoClient;
import com.machale.client.hs.service.HsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class Config {

    @Bean
    public UserInfoClient userInfoClient(HessianProxyFactoryBean factory) {
        return new UserInfoClient(factory);
    }

    @Bean
    public HessianProxyFactoryBean userInfoService(@Value("${remote-service.url}") String url) {
        return hessianProxyFactoryBean(url);
    }

    private HessianProxyFactoryBean hessianProxyFactoryBean(String url) {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl(url);
        factory.setConnectTimeout(5000);
        factory.setReadTimeout(3000);
        factory.setServiceInterface(HsService.class);
        return factory;
    }
}
