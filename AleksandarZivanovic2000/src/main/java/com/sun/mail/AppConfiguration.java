package com.sun.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
public class AppConfiguration {

    @Bean
    public Kvadrat kvadrat() {
        return new Kvadrat(4);
    }

    @Bean
    public Krug krug() {
        return new Krug(3);
    }

    @Bean
    public JednakostranicniTrougao trougao() {
        return new JednakostranicniTrougao(5);
    }

    @Bean
    public Interceptor interceptor(){
        return new Interceptor();
    }
    @Bean
    public OblikServis oblikServis() {
        return new OblikServis();
    }
}


