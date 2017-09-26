package pl.idziak.hr.domain.contract.entity;

import lombok.Getter;
import lombok.Setter;
import pl.idziak.hr.domain.employee.entity.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
public class Contract {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @NotNull
    private Employee employee;

    @NotNull
    private Date start;

    @NotNull
    private Date end;

}
