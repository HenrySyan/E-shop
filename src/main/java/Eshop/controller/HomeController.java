package Eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    String messsage ="just a new message";

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public  String booksList(ModelMap map){
        map.addAttribute("message",messsage);
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "redirect:/home";
    }

}
