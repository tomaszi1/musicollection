package pl.idziak.mc.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IdentificationDTO {
    private Long id;
    private String uri;
}
