package pl.idziak.mc.domain.album.control;

import pl.idziak.mc.domain.album.entity.Musician;

public interface MusicianRepository {
    Musician save(Musician musician);
}
