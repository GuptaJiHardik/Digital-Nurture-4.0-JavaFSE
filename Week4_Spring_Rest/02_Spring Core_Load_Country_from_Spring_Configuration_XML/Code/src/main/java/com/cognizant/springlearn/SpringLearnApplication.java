package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("\n\nAPPLICATION STARTED \n");

        displayCountry();

        LOGGER.info("\n APPLICATION ENDED \n");
    }

    public static void displayCountry() {
        LOGGER.debug("\n-- Loading ApplicationContext from country.xml --");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country = (Country) context.getBean("country");

        LOGGER.debug("\n-- Fetched Country bean: {} --\n", country.toString());
    }
}
