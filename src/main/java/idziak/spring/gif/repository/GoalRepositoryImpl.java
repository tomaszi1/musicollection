package idziak.spring.gif.repository;

import idziak.spring.gif.model.Goal;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class GoalRepositoryImpl implements GoalRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Goal save(Goal goal) {
        em.persist(goal);
        return goal;
    }
}
