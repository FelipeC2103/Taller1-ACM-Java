
package edu.acm.punto1;

import edu.acm.punto1.config.BeanConfig;
import edu.acm.punto1.services.ExperimentService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;



@SpringBootApplication(scanBasePackages = "edu.acm.punto1")
public class BeanLabApplication implements CommandLineRunner {


    private final ObjectProvider<ExperimentService> componentServiceProvider;

    private ObjectProvider<BeanConfig> beanServiceProvider;

    public BeanLabApplication(
            @Qualifier("experimentComponent") ObjectProvider<ExperimentService> componentServiceProvider,
            @Qualifier("experimentBean") ObjectProvider<BeanConfig> beanServiceProvider) {
        this.componentServiceProvider = componentServiceProvider;
        this.beanServiceProvider = beanServiceProvider;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanLabApplication.class, args);
    }

    public void run(String ... args){
        System.out.println("Ejecutando componentService");
        ExperimentService componentService = componentServiceProvider.getObject();
        componentService.run();

        System.out.println("Ejecutando beanService");
        BeanConfig beanService = beanServiceProvider.getObject();
        beanService.run();


    }

}

