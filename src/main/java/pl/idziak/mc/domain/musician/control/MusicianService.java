package pl.idziak.mc.domain.musician.control;

import pl.idziak.mc.domain.musician.entity.Musician;

public interface MusicianService {

    Musician save(Musician musician);

    Musician get(long id);
}
