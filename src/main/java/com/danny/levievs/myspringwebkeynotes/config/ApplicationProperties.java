package com.danny.levievs.myspringwebkeynotes.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Getter
@Setter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private final Customers customers;


    @Getter
    @Setter
    public static class Customers{
        private String baseUrl;
    }


}
