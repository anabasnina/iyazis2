package com.bsuir.iyazis.languagerecognizer.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@Data
public class ApplicationConfiguration {

    private Integer nGramSize;
    private Integer maxNGramSize;
}
