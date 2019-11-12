package comm.example.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.example.spring.mvc.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("employee", new Employee());
		return "employee-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid@ModelAttribute("employee") Employee theCustomer,
			BindingResult theResult)
	{
		if(theResult.hasErrors())
		{
			return "employee-form";
		}
		else
		{
			return "employee-confirmation";
		}
		
	}
	
}
