package idziak.spring.gif.controlller;

import idziak.spring.gif.model.Goal;
import idziak.spring.gif.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private GoalService goalService;
	
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal() {
        Goal goal1 = new Goal();
        goal1.setMinutes(20);
        goalService.save(goal1);
        return "done";
    }
	
}
