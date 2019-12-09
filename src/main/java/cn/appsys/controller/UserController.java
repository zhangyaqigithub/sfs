package cn.appsys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.User;
import cn.appsys.service.user.UserService;


/** 用户控制器 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	/** 显示登陆页面的方法 */
	@RequestMapping(value="/devlogin.html",method=RequestMethod.GET)
	public String login(){
		return "devlogin";
	}
	
	/** 显示主页面的方法 */
	@RequestMapping(value="/sys/main.html",method=RequestMethod.GET)
	public String main(){
		return "developer/main";
	}
	
	/** 处理用户登陆方法 */
	@RequestMapping(value="/dologin.html",method=RequestMethod.POST)
	public String dologin(@RequestParam String devCode,
							@RequestParam String devPassword,
							HttpSession session){
		User user=userService.login(devCode,devPassword);
		if(user!=null){
			session.setAttribute("devUserSession", user);
			return "redirect:/sys/main.html";
		}else{
			return "devlogin";
		}
	}
	
	/** 注销页面 */
	@RequestMapping(value="dev/logout.html",method=RequestMethod.GET)
	public String loginout(HttpSession session){
		session.removeAttribute("devUserSession");
		return "redirect:../";
	}
	

	
}
