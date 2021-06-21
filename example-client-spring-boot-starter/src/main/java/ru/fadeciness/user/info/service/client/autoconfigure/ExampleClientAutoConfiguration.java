package ru.fadeciness.user.info.service.client.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//@ConditionalOnClass(RestTemplate.class)
@EnableConfigurationProperties(ExampleClientProperties.class)
public class ExampleClientAutoConfiguration {

    @Autowired
    private ExampleClientProperties properties;

    @Bean
//    @ConditionalOnBean
    public RestTemplate exampleRestTemplate() {
        return new RestTemplateBuilder()
                .rootUri(properties.getHost())
                .build();
    }

}
