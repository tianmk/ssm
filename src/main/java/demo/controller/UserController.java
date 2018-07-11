package demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.entity.User;
import demo.service.UserService;
import demo.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users=userService.getAllUser();
		List<UserVo> data=new ArrayList<>();
		for(User bean:users) {
			data.add(UserVo.bean2vo(bean));
		}
		model.addAttribute("data", data);
		return "user/list";
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public String editUi(String id,Model model) {
		User bean=this.userService.getUser(id);
		model.addAttribute("data", bean);
		return "user/edit";
	}

	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String edit(@ModelAttribute("data") User user,Model model) {
		User bean=this.userService.getUser(user.getId());
		user.setPassword(bean.getPassword());
		user.setRegdate(bean.getRegdate());
		boolean r=this.userService.updateUser(user);
		if(!r) {
		model.addAttribute("data", user);
			return "user/edit";
		}
		return "redirect:list";
	}
	@RequestMapping(value="/delete")
	public String edit(String id,Model model) {
		boolean r=this.userService.delUser(id);
		return "redirect:list";
	}
}
