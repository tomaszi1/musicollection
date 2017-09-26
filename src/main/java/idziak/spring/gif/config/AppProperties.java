package idziak.spring.gif.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.file.Path;

@ConfigurationProperties(prefix = "com.justgifit")
public class AppProperties {

    private Path gifLocation;

    public Path getGifLocation() {
        return gifLocation;
    }

    public void setGifLocation(Path gifLocation) {
        this.gifLocation = gifLocation;
    }
}
