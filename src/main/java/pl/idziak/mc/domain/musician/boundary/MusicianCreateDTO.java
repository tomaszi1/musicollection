package pl.idziak.mc.domain.musician.boundary;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MusicianCreateDTO {
    private String name;
}
