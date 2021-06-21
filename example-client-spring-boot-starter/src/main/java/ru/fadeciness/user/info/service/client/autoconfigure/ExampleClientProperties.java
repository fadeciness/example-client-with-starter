package ru.fadeciness.user.info.service.client.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "example.client")
public class ExampleClientProperties {

    private String host;

}
