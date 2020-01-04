package io.my;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * should add auto configuration class in META-INF/spring.factories
 */
@Configuration
@EnableConfigurationProperties(StarterProperties.class)
@ComponentScan
public class StarterAutoConfiguration { }

