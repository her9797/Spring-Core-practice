package com.ohgiraffers.chap04.practice01.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {
    public static Long SINGLETON_COUNT = 1L;
    public static Long PROTOTYPE_COUNT = 1L;

    @Bean("singletonBean")
    @Scope("singleton")
    public SingletonBean generateSingletonBean() {

        return new SingletonBean(SINGLETON_COUNT++ + "번째 메세지");
    }
    @Bean("prototypeBean")
    @Scope("prototype")
    public PrototypeBean generatePrototypeBean() {

        return new PrototypeBean(PROTOTYPE_COUNT++ + "번째 메세지");
    }

    @Bean(name="initDestroyBean", initMethod = "init", destroyMethod = "destroy")
    public InitDestroyBean generateInitDestoryBean() {

        return new InitDestroyBean();
    }


}
