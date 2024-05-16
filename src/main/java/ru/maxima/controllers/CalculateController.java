package ru.maxima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "num1", required = false) Double num1,
                            @RequestParam(value = "num2", required = false) Double num2,
                            @RequestParam(value = "operation", required = false) String operation,
                            Model model) {
        double result = 0;
        switch (operation) {
            case "add" -> result = num1 + num2;
            case "sub" -> result = num1 - num2;
            case "mull" -> result = num1 * num2;
            case "div" -> result = num1 / num2;
        }
        model.addAttribute("calculator", "Result: " + result);
        return "calculator";
    }
}
