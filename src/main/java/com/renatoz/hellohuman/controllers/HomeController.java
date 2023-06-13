package com.renatoz.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
    public String welcome(@RequestParam(value = "name", defaultValue = "human") String name,
                          @RequestParam(value = "last_name", required = false) String lastName,
                          @RequestParam(value = "times", defaultValue = "1") int times) {
        String greeting = "Welcome, " + name;
        
        if (lastName != null) {
            greeting += " " + lastName;
        }
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < times; i++) {
            output.append(greeting).append("<br>");
        }
        
        return output.toString();
    }
}
