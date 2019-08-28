package com.oocl.web.sampleWebApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String hello() {
        return "Hello World";
    }
    @RequestMapping("/url")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody HashMap<String,String> greeting2() {
     HashMap<String,String> map = new HashMap<String,String>();
     map.put("user", "name");
     return map;
    }
  
    @RequestMapping("/ids")
    public @ResponseBody Map<String, String> verifyJson(@RequestBody Map<String, String> map){
     map.put("id", "001");
     return map;
    }
    
    
}