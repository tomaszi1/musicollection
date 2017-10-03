package pl.idziak.mc.domain.musician.control;

import pl.idziak.mc.domain.musician.entity.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MusicianServiceImpl implements MusicianService {

    @Autowired
    private MusicianRepository musicianRepository;

    @Override
    @Transactional
    public Musician save(Musician musician) {
        return musicianRepository.save(musician);
    }

    @Override
    public Musician get(long id) {
        return musicianRepository.get(id);
    }
}
