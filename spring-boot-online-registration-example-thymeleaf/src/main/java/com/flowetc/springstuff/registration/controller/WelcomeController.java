package com.flowetc.springstuff.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since May 26, 2017
 */
@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String welcomePage(Map<String, Object> model) {
        model.put("welcomeMessage", "Welcome to the Online Registration System");

        return "index";
    }
}
