package idziak.spring.gif.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Configuration
@EnableConfigurationProperties({AppProperties.class})
@Slf4j
public class JustGifItAutoConfiguration {

    @Inject
    private AppProperties properties;

    @Bean
    @ConditionalOnProperty(prefix = "com.justgifit", name = "create-result-dir")
    public Boolean ensureGifDirPresent() throws IOException {
        Path path = properties.getGifLocation();
        if (!Files.exists(path)) {
            Files.createDirectory(path);
        }

        if (!Files.isDirectory(path)) {
            throw new IllegalStateException("Could not create gif directory");
        }
        log.info("Result gif dir checked");
        return true;
    }

}
