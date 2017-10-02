package pl.idziak.mc.domain.musician.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Getter
@Setter
public class Musician {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Date dateOfBirth;

//    @OneToMany(targetEntity = Album.class, mappedBy = "musician")
//    private List<Album> albums;

}
