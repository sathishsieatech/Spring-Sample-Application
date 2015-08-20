
package com.sampleapp.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;


@Controller

 @RequestMapping("/hello")
    
public class Hello {
    
   
    public ModelAndView display(){
        String str = "Welcome To Spring Web MVC";
       return new ModelAndView("hellopage", "str", str);
        
    }
    
    
}
