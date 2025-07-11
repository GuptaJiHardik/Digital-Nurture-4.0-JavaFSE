package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CountryController {

    private static final Map<String, Country> COUNTRY_MAP = new HashMap<>();

    static {
        COUNTRY_MAP.put("JP", new Country("JP", "Japan"));
        COUNTRY_MAP.put("IN", new Country("IN", "India"));
        COUNTRY_MAP.put("USA", new Country("USA", "United States of America"));
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws Exception {
        Country country = COUNTRY_MAP.get(code.toUpperCase());
        if (country == null) {
            throw new Exception("Country not found for code: " + code);
        }
        return country;
    }
}
