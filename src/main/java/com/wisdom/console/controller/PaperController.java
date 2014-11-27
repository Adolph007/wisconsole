package com.wisdom.console.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PaperController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/console/addpaper", method = RequestMethod.GET)
    public ModelAndView addpaper() {
        ModelAndView mv = new ModelAndView("addpaper");
        mv.addObject("page_title", "管理平台");
        return mv;
    }
	
	@RequestMapping(value = "/console/listpaper", method = RequestMethod.GET)
    public ModelAndView adduser() {
        ModelAndView mv = new ModelAndView("listpaper");
        mv.addObject("page_title", "管理平台");
        return mv;
    }
}
