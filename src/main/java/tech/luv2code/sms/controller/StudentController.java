package tech.luv2code.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tech.luv2code.sms.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService theStudentService)
	{
		super();
		this.studentService = theStudentService;
	}
	
	//handler method to handle list students request and return model and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}	
}
