package pl.idziak.hr.domain.employee.control;

import pl.idziak.hr.domain.employee.entity.Employee;

public interface EmployeeRepository {
    Employee save(Employee employee);
}
