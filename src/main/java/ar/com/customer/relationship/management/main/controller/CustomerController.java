package ar.com.customer.relationship.management.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.customer.relationship.management.main.entity.CustomerEntity;
import ar.com.customer.relationship.management.main.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerServ;
	
	@RequestMapping("/list")
	public String showList(Model model)
	{
		model.addAttribute("customers", customerServ.findAll());
		return "employeeList";
	}
	
	@GetMapping("/update-form/{id}")
	public String showForm(@PathVariable("id") int id, Model model) {
		
		model.addAttribute("customer", customerServ.findById(id));
		
		return "updateForm";
	}
	
	@GetMapping("/add-form")
	public String addForm(Model model)
	{
		model.addAttribute("customer", new CustomerEntity());
		
		
		return "addForm";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable("id") int id)
	{
		customerServ.deleteById(id);
		return "redirect:/list";
	}
	
	
	@PostMapping("/update")
	public String updateCustomer(@ModelAttribute("customer") CustomerEntity customer)
	{
		customerServ.saveCustomer(customer);
		
		
		return "redirect:/list";
	}
	
}
