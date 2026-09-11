package com.danny.levievs.myspringwebkeynotes;

import com.danny.levievs.myspringwebkeynotes.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class MySpringWebKeynotesApplication {

    static void main(String[] args) {
        SpringApplication.run(MySpringWebKeynotesApplication.class, args);
    }

}
