package io.my;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * should add auto configuration class in META-INF/spring.factories
 */
@Configuration
@EnableConfigurationProperties(StarterProperties.class)
public class StarterAutoConfiguration {

    @Bean
    public StarterBean options(){
        return new StarterBean();
    }
}

