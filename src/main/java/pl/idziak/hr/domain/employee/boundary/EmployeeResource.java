package pl.idziak.hr.domain.employee.boundary;

import org.springframework.web.bind.annotation.RequestMapping;
import pl.idziak.hr.dto.IdentificationDTO;
import pl.idziak.hr.domain.employee.control.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;

    public IdentificationDTO create(){
        return null;
    }
	
}
