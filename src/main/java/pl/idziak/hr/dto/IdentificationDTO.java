package pl.idziak.hr.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IdentificationDTO {
    private Integer id;
    private String uri;
}
