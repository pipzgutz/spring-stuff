package com.flowetc.springstuff.psm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pgutierrez
 * @version 1.0
 * @since October 18, 2016
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index.jsf");
    }
}
