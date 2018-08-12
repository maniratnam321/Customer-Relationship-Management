package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String showHomePage() {
        return "HomePage";
    }

    @RequestMapping(value = "/register")
    public String showRegister() {
        return "Register";
    }

    @RequestMapping(value = "/getItemInfo")
    public String showItemInfo() { return "DummyTestPage"; }
}
