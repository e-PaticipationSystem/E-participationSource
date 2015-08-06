/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newpackage;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class HelloController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "HELLO SPRING ";  
        return new ModelAndView("hello", "message", message);  
    }  
    
    @RequestMapping("/jhk")  
    public ModelAndView helloWorld2(Model model) { //Model model is a dummy model 
        String message = "HELLO SPRING ";  
        model.addAttribute("name","nkanyiso");//addAttribute overload(String s,object e);
        model.addAttribute("country","south africa");
        model.addAttribute("message",message);
        return new ModelAndView("emp"); //return only the view 
    }  
    
} 