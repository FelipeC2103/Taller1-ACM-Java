package edu.acm.punto1.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("experimentComponent")
@Lazy
public class ExperimentService {

    public ExperimentService() {
        System.out.println("Bean creado con Component");
    }

    public void run(){
        System.out.println("experimentService - run Ejecutado");
    }

}