package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.user;

@Controller
public class contactHandler {

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
		model.addAttribute("u",u);
		return "showDetail";
	}
	
	
}
