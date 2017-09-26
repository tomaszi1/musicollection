package idziak.spring.gif.health;

import idziak.spring.gif.config.AppProperties;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.nio.file.Files;

@Component
public class AppHealthIndicator implements HealthIndicator {

    @Inject
    private AppProperties properties;

    @Override
    public Health health() {
        if(!Files.isWritable(properties.getGifLocation())){
            return Health.down().build();
        }

        return  Health.up().build();
    }
}
