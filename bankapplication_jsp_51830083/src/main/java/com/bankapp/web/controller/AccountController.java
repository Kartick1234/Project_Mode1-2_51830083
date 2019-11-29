package com.bankapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.bankapp.model.services.AccountService;
import com.bankapp.model.services.UserService;


@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;

	@Autowired
	private UserService userService;

	@GetMapping(path = "hel")
	public String hello(ModelMap map) {
		map.addAttribute("name", "gupta");
		return "hello";
	}

	@GetMapping(path = "/admin")
	public String hello1() {
		return "admin";
	}

	@GetMapping(path = "/mgr")
	public String hello2() {
		return "mgr";
	}

	@GetMapping(path = "/clerk")
	public String hello3() {
		return "clerk";
	}
}
