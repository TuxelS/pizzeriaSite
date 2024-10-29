package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.services.UserService;

@Controller
@RequestMapping("/fabric")
public class MainPageController {
	
	private final UserService userService;
	
	public MainPageController(UserService userService)
	{
		this.userService=userService;
	}
	
	@GetMapping({"","/"})
	public String mainPage(Model model)
	{
		model.addAttribute("ListOfType",userService.allList());
		return "user/mainPage";
	}
	
	@GetMapping("/{category}")
	public String menuOfCategory(@PathVariable("category") String category, Model model)
	{
		model.addAttribute("ListOfDefiniteCategory",userService.insideCategory(category));
		return "user/menuOfCategory";
	}
}
