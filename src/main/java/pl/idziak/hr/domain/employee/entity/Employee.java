package pl.idziak.hr.domain.employee.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import pl.idziak.hr.domain.contract.entity.Contract;

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

    @NotNull
    private Date dateOfBirth;

    @Email
    private String email;

    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL)
    private List<Contract> contracts;

}
