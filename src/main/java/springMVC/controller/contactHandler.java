package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.user;
import springMVC.service.userService;

@Controller
public class contactHandler {
	@Autowired
private userService userservice;

	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	//using @RequestParam
	
//	@RequestMapping("processForm")
//	public String contact(@RequestParam("name")String name,@RequestParam("mail")String mail,@RequestParam("password")String password,Model model)
//	{
//		model.addAttribute("name",name);
//		model.addAttribute("mail",mail);
//		model.addAttribute("password",password);
//		
//		
//		return "showDetail";
//	}
	
	
//using @modelattribute
	@RequestMapping("processForm")
	public String contact(@ModelAttribute user u,Model model)
	{
		System.out.println(u);
		this.userservice.createUser(u);
		return "showDetail";
	}
	
}
