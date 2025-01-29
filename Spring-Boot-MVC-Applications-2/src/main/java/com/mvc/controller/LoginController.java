package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.login.Login;

@Controller
public class LoginController {
		@RequestMapping("/")
		public String myForm(Model model)
		{
			Login login=new Login();
			model.addAttribute("user", login);
			return "login";
		}
		
		@RequestMapping("/register")
		public String myFormData(@ModelAttribute Login login,Model model)
		{
			if(login.getName().equals("raviprasad")&&login.getPassword().equals("ravi@123"))
			{
				String msg="Login Success Fully";
				model.addAttribute("MSG",msg);
			}
			else
			{
				String msg="Please Enter The Valid User Name And Password";
				model.addAttribute("MSG",msg);
			}
			
			return "result";
		}

}
