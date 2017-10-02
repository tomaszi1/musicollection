package pl.idziak.mc.domain.musician.control;

import pl.idziak.mc.domain.musician.entity.Musician;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MusicianRepositoryImpl implements MusicianRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Musician save(Musician musician) {
        em.persist(musician);
        return musician;
    }
}
