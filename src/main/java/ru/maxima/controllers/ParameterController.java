package ru.maxima.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/test")
public class ParameterController {

    @GetMapping("/hello")
    public String getParameters(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");

        model.addAttribute("message", "Hello, " + name + " " + lastname + "! ");

        return "hello-user-model";
    }
    @GetMapping("/weather")
    public String getWeather(@RequestParam(value = "country", required = false) String country,
                             @RequestParam(value = "city", required = false) String city,
                             Model model) {
        model.addAttribute("weather", "Today weather in: " + country + " " + city);
        return "weather";
    }

}
