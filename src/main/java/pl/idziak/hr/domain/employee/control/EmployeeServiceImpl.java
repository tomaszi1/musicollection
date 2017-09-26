package pl.idziak.hr.domain.employee.control;

import pl.idziak.hr.domain.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
