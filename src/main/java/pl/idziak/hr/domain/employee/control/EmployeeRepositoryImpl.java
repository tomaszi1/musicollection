package pl.idziak.hr.domain.employee.control;

import pl.idziak.hr.domain.employee.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Employee save(Employee employee) {
        em.persist(employee);
        return employee;
    }
}
