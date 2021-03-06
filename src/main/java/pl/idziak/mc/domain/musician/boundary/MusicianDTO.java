package pl.idziak.mc.domain.musician.boundary;

import lombok.*;

import java.util.Date;

@Getter
@Builder
public class MusicianDTO {
    private String name;
    private Date joined;
}
