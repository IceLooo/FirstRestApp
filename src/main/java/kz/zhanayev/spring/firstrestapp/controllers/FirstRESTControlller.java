package kz.zhanayev.spring.firstrestapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstRESTControlller {

//    @ResponseBody
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World";
    }


}
