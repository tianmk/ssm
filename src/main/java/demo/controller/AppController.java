package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import demo.entity.User;
import demo.service.UserService;

@Controller
@SessionAttributes("loginuser")
public class AppController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginUi(Model model) {
		User user=new User();
		model.addAttribute("data", user);
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute("data") User user, Model model) {
		User bean=this.userService.getUserByUserName(user.getUsername());
		if(bean!=null && bean.getPassword().equals(user.getPassword())) {
			model.addAttribute("loginuser", bean);
			return "redirect:user/list";
		}
		return "login";
	}

	@RequestMapping(value="/logout")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:login";
	}
}
