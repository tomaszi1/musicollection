package pl.idziak.mc.domain.contract.entity;

import lombok.Getter;
import lombok.Setter;
import pl.idziak.mc.domain.album.entity.Musician;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
public class Album {

    @Id
    @GeneratedValue
    private Integer id;

//    @ManyToOne
//    private Musician musician;

    @NotNull
    private Date published;

    @NotNull
    private Date added;

}
