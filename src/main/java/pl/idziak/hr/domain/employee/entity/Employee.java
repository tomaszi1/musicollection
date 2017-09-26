package pl.idziak.hr.domain.employee.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL)
    private List<Contract> contracts;

    @NotNull
    private Date dateOfBirth;

}
