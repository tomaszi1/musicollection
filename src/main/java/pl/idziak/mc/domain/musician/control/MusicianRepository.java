package pl.idziak.mc.domain.musician.control;

import pl.idziak.mc.domain.musician.entity.Musician;

public interface MusicianRepository {
    Musician save(Musician musician);
}
