package com.flowetc.springstuff.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since May 25, 2017
 */
@Controller
public class WelcomePageController {
    @GetMapping("/")
    public String welcomePage() {
        return "index.xhtml";
    }
}
