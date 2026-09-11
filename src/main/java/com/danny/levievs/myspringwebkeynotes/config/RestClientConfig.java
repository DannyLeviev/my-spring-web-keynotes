package com.danny.levievs.myspringwebkeynotes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;


@Configuration
public class RestClientConfig {

    @Bean
    RestClient customersWebClient(ApplicationProperties applicationProperties){
        return RestClient.builder()
                .baseUrl(applicationProperties.getCustomers().getBaseUrl())
                .build();
    }
}
