package com.springpantallas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pantallaController {

	@RequestMapping("/index")
	public String pantalla() {
		return "index";
	}
	
	@GetMapping("/index")
	public String pantallaobtener() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String pantallalogin() {
		return "login";
	}
	
	@GetMapping("/login")
	public String pantallaloginobtener() {
		return "login";
	}
	
	@RequestMapping("/cart")
	public String pantallacart() {
		return "cart";
	}
	
	@GetMapping("/cart")
	public String pantallacartobtener() {
		return "cart";
	}
	
	@RequestMapping("/products")
	public String pantallapruducts() {
		return "products";
	}
	
	@GetMapping("/products")
	public String pantallapruductsobtener() {
		return "products";
	}
	
	@RequestMapping("/register")
	public String pantallaregister() {
		return "register";
	}
	
	@GetMapping("/register")
	public String pantallaregisterobtener() {
		return "register";
	}
	
	@RequestMapping("/restartpassword")
	public String pantallarestartpassword() {
		return "restartpassword";
	}
	
	@GetMapping("/restartpassword")
	public String pantallarestartpasswordobtener() {
		return "restartpassword";
	}
	
	@RequestMapping("/profile")
	public String pantallaprofile() {
		return "profile";
	}
	
	@GetMapping("/profile")
	public String pantallaprofileobtener() {
		return "profile";
	}
	
	@RequestMapping("/upProduct")
	public String pantallaupProduct() {
		return "upProduct";
	}
}
