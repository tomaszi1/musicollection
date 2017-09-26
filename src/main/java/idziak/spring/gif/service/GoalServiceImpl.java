package idziak.spring.gif.service;

import idziak.spring.gif.model.Goal;
import idziak.spring.gif.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;

    @Override
    @Transactional
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }
}
