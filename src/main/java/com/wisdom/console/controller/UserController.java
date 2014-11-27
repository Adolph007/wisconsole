package com.wisdom.console.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@RequestMapping(value = "/console/adduser", method = RequestMethod.GET)
    public ModelAndView adduser() {
        logger.debug("admin");
        ModelAndView mv = new ModelAndView("adduser");
        mv.addObject("page_title", "管理平台");
        return mv;
    }
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView("/register");
        mv.addObject("page_title", "用户注册");
        return mv;
    }
	
	@RequestMapping(value = "/sigin", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("/sigin");
        mv.addObject("page_title", "用户注册");
        return mv;
    }
}
