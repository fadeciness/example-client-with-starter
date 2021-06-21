package ru.fadeciness.user.info.client.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class ExampleClientImpl implements ExampleClient {

    @Autowired
    @Qualifier("exampleRestTemplate")
    private RestTemplate restTemplate;

    @Override
    public String mainPage() {
//        final Object object = restTemplate.getForObject("/wiki/Заглавная_страница", Object.class);
        final Object object = restTemplate.getForObject("/", String.class);
        return Objects.isNull(object) ? "EMPTY" : object.toString();
    }
}
