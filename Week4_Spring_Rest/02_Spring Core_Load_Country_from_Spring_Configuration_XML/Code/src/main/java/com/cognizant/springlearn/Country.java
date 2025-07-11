package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        LOGGER.debug("\n CONSTRUCTOR ");
        LOGGER.debug("DEBUG: Country constructor invoked.");
    }

    public String getCode() {
        LOGGER.debug("\n getCode() ");
        LOGGER.debug("DEBUG: getCode() method called.");

        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("\n setCode() ");
        LOGGER.debug("DEBUG: setCode() method called with value: {}", code);

        this.code = code;
    }

    public String getName() {
        LOGGER.debug("\n getName() ");
        LOGGER.debug("DEBUG: getName() method called.");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("\n setName() ");
        LOGGER.debug("DEBUG: setName() method called with value: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country { " +
               "code = '" + code + "', " +
               "name = '" + name + "' " +
               '}';
    }
}
