package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class reController {
	@RequestMapping("/one")
public String one()
{
	return "redirect:/home";
}
}
