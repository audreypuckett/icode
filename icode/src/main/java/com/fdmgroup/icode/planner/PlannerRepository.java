package com.fdmgroup.icode.planner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.fdmgroup.icode.demo.trails.TrailIdGenerator;

@Repository
public class PlannerRepository {
	
	private List<Todo> todos = new ArrayList<>();
	
	public PlannerRepository(@Qualifier("todos") List<Todo> todos) {
		super();
		this.todos = todos;
	}

	public Todo save(Todo todo) {
		todo.setId(TrailIdGenerator.getId());
		this.todos.add(todo);
		
		System.out.println(todos.toString());
		return todo;
	}

	public List<Todo> findAll() {
		return todos;
	}
	

}
