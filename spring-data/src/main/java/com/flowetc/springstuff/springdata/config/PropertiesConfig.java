package com.flowetc.springstuff.springdata.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since August 04, 2016
 */
@Configuration
@ComponentScan("com.flowetc.springstuff.springdata.reference")
@PropertySource("classpath:application.properties")
public class PropertiesConfig {
}
