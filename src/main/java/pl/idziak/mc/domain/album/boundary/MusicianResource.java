package pl.idziak.mc.domain.album.boundary;

import org.springframework.web.bind.annotation.RequestMapping;
import pl.idziak.mc.dto.IdentificationDTO;
import pl.idziak.mc.domain.album.control.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("album")
public class MusicianResource {

	@Autowired
	private MusicianService musicianService;

    public IdentificationDTO create(){
        return null;
    }
	
}
