package idziak.spring.gif.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Goal {

    @Id
    @GeneratedValue
    private Long id;

    @Range(min = 1, max = 120)
    private Integer minutes;



}
