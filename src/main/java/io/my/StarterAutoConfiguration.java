package io.my;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * should add auto configuration class in META-INF/spring.factories
 */
@Configuration
//@EnableConfigurationProperties(StarterProperties.class)
@ComponentScan
public class StarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(StarterProperties.class)
    @ConfigurationProperties(prefix = "starter")
    public StarterProperties starterProperties() {
        return new StarterProperties();
    }
}

