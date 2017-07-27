package com.out.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.service.UserService;
import com.spring.mvc.model.UserDTO;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger= LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		logger.info("user index init");
		List<UserDTO> u=userService.getUser();
		logger.info("user name"+u.get(0).getName());

		model.put("data", u);
		return "/user/index";
	}
}
