package com.flowetc.springstuff.primefacesspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since August 08, 2016
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home.jsf");
    }

    @RequestMapping("/admin")
    public ModelAndView adminHome() {
        return new ModelAndView("admin/home.jsf");
    }
}
