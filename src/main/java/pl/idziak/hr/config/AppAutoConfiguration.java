package pl.idziak.hr.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({AppProperties.class})
@Slf4j
public class AppAutoConfiguration {


}
