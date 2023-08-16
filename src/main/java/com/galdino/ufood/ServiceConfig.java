package com.galdino.ufood;

import com.galdino.ufood.service.ActivationClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
//    @Bean
//    public ActivationClientService activationClientService(Notifier notifier) {
//        return new ActivationClientService(notifier);
//    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ActivationClientService activationClientService() {
        return new ActivationClientService();
    }

}
