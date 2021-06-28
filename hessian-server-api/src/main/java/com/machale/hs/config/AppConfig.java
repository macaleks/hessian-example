package com.machale.hs.config;


import com.machale.client.hs.service.HsService;
import com.machale.hs.service.HsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

@Configuration
public class AppConfig {

    @Bean
    HsService hsService() {
        return new HsServiceImpl();
    }

    @Bean(name="/userInfo")
    HessianServiceExporter hessianServiceExporter(HsService hsService) {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(hsService);
        exporter.setServiceInterface(HsService.class);
        return exporter;
    }
}
