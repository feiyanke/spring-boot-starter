package io.my;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "starter")
public class StarterProperties {
    int property0 = 0;
    boolean property1 = true;
    String property2 = "2";
}
