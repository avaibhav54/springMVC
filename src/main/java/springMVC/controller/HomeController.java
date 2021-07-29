package springMVC.controller;import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
public String home(Model model)
{
		//we can pass anything in value like list mao set etc
		//using model 
		model.addAttribute("name","vaibhav agarwal");	
	return "index";
}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","vaibhav");
		List<String>lis=new ArrayList<String>();
		lis.add("rocahn");
		lis.add("munni");
		lis.add("harshi");
		mav.addObject("friend",lis);
			mav.setViewName("help");
		return mav;
	}
}
