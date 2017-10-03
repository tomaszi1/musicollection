package pl.idziak.mc.domain.musician.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Musician {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Date joined;

//    @OneToMany(targetEntity = Album.class, mappedBy = "musician")
//    private List<Album> albums;

}
