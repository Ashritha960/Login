package com.risk.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.risk.model.Login;
import com.risk.service.loginservice;




@Controller
public class EntryController {
	
	@Autowired
	loginservice loginserviceobj;
	
	@RequestMapping(value="/success")
	public String show(Model model)
	{
		/* List<Login> loginlist=loginserviceobj.getlogindetails(); */
	model.addAttribute("login", new Login());
	return "Login";

	}
	
	@RequestMapping(value="/nextpage",method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute ("login") Login login,BindingResult result)
	{
		
		if(result.hasErrors())
		{ 
			return "Login"; 
		}
		return "display";
	}
	
	/*
	 * @RequestMapping("/sample") private String sample(Model model) { List<Login>
	 * loginlist= loginserviceobj.getlogindetails(); model.addAttribute("list",
	 * loginlist); return "hello"; }
	 */
	
	/*
	 * @RequestMapping(value="/validate",method = RequestMethod.POST) public String
	 * processForm(@Valid @ModelAttribute Login login, BindingResult
	 * result,Map<String,Object> map) {
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * if (result.hasErrors()) { return "Login"; }
	 * 
	 * 
	 * 
	 * boolean userExists=loginserviceobj.checkLogin(login.getUsername(),
	 * login.getPassword());
	 * 
	 * // check user, using username // if it's there, Retrieve obj //
	 * if(userExists){ map.put("login", login); return "loginsuccess"; }else{
	 * result.rejectValue("username","invaliduser"); return "loginform"; }
	 * 
	 * }
	 */
	
	
	
}
