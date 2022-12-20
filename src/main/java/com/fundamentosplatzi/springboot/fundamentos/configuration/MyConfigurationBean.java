package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public myBean beanOperacion(){

        return new MyBean2Implement();
    }

    @Bean
    public MyOperation myOperation(){

        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWhitDependencyImplement myOperationWhitDependency(MyOperation myOperation){

        return new MyBeanWhitDependencyImplement(myOperation);
    }

}
