package com.fdmgroup.icode.planner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.demo.trails.Trail;
import com.fdmgroup.icode.demo.trails.TrailService;


@Controller
@RequestMapping("/planner")
public class PlannerController {
	
	private PlannerService plannerService;

	public PlannerController(PlannerService plannerService) {
		super();
		this.plannerService = plannerService;
	}

	@GetMapping("/landing")
	public String goToLangingPage() {
		return "planner/landing";
	}
	
	@GetMapping("/home")
	public String goToHomePage() {
		return "planner/home";
	}
	
	@GetMapping("/create")
	public String goToCreatePage(Model model) {
		model.addAttribute("todo", new Todo());
		return "planner/create-todo";
	}
	
	@PostMapping("/process-create")
	public String processCreate(Todo todo) {
		plannerService.createNewTodo(todo);
		return "redirect:/planner/home";
	}
	
	@GetMapping("/view")
	public String goToViewPage(Model model) {
		//Todo todos = plannerService.findTrailById(trailId);
		model.addAttribute("todos", new Todo());
		//System.out.println()
		return "planner/list-todo";
	}

}

