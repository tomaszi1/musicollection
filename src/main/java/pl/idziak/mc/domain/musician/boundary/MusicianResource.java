package pl.idziak.mc.domain.musician.boundary;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;
import pl.idziak.mc.domain.musician.entity.Musician;
import pl.idziak.mc.dto.IdentificationDTO;
import pl.idziak.mc.domain.musician.control.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@RestController
@RequestMapping("musician")
public class MusicianResource {

    @Autowired
    private MusicianService musicianService;

    @RequestMapping(method = RequestMethod.POST)
    public IdentificationDTO create(@RequestBody MusicianCreateDTO dto) {
        Musician entity = musicianService.save(toEntity(dto));
        return IdentificationDTO.builder()
                .id(entity.getId())
                .build();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public MusicianDTO get(@PathVariable("id") long id) {
        return toDto(musicianService.get(id));
    }

    private MusicianDTO toDto(Musician entity) {
        return MusicianDTO.builder()
                .name(entity.getName())
                .joined(entity.getJoined())
                .build();
    }

    private static Musician toEntity(MusicianCreateDTO dto) {
        return new Musician()
                .setName(dto.getName())
                .setJoined(Date.from(ZonedDateTime.now().toInstant()));
    }

}
