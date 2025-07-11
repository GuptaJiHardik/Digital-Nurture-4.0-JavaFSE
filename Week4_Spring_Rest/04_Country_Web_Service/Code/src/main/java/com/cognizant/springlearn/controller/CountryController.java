package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountry() {

    
        System.out.println(" /country endpoint invoked");
        System.out.println(" Loading ApplicationContext from applicationContext.xml...");
        
        // Load the Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(" ApplicationContext loaded successfully");
        System.out.println(" Fetching 'japan' bean from context...");

        // Get the Japan bean
        Country country = (Country) context.getBean("japan");

        System.out.println(" Bean fetched: " + country);
       

        return country;
    }
}
