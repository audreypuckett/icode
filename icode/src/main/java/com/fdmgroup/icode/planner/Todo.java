package com.fdmgroup.icode.planner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Todo {

	private long id;
	private String task;
//	private LocalDateTime dueDateTime;
//	private String topic;
	

	public Todo() {
		super();
	}
	
	public Todo(long id, String task) {
		super();
		this.id = id;
		this.task = task;
//		this.dueDateTime = dueDateTime;
//		this.topic = topic;
		//, LocalDateTime dueDateTime, String topic
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", task=" + task + "]";
	}

//	public LocalDateTime getDueDateTime() {
//		return dueDateTime;
//	}
//
//	public void setDueDateTime(LocalDateTime dueDateTime) {
//		this.dueDateTime = dueDateTime;
//	}
//
//	public String getTopic() {
//		return topic;
//	}
//
//	public void setTopic(String topic) {
//		this.topic = topic;
//	}
	

	
}
