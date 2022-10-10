package edu.sust.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    /**
     * index action.
     * @return
     */
    @GetMapping("/")
    String index() {
        return "Hello, World!";
    }
}