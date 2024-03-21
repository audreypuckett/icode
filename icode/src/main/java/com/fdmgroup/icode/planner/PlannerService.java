package com.fdmgroup.icode.planner;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlannerService {
	
	private PlannerRepository plannerRepo;
	
	public PlannerService(PlannerRepository plannerRepo) {
		super();
		this.plannerRepo = plannerRepo;
	}

	public Todo createNewTodo(Todo todo) {
		return plannerRepo.save(todo);
	}
	
	public List<Todo> getAllTodos() {
		return plannerRepo.findAll();
	}

}
