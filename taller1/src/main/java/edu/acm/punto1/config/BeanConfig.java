package edu.acm.punto1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeanConfig {

    @Bean("experimentBean")
    public BeanConfig experimentBean() {
        System.out.println("Bean creado manualmente");
        return new BeanConfig();
    }

    public void run(){
        System.out.println("experimentBean - run Ejecutado");
    }
}
