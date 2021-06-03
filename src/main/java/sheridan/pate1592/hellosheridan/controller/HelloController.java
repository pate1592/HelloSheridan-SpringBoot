package sheridan.pate1592.hellosheridan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello";
    }
}