package com.cognizant.springlearn.model;

public class Country {
    private String code;
    private String name;

    // Default constructor
    public Country() {
   
        
        System.out.println("Country(): Default constructor called");

    }

    // Parameterized constructor
    public Country(String code, String name) {
        
        System.out.println("\n Country(code, name): Parameterized constructor called");
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);

        this.code = code;
        this.name = name;
    }

    // Getters and Setters
    public String getCode() {

        System.out.println("Returning code: " + code);
       
        return code;
    }

    public void setCode(String code) {
       
        System.out.println("Setting code to: " + code);

        this.code = code;
    }

    public String getName() {

        System.out.println("Returning name: " + name);
  
        return name;
    }

    public void setName(String name) {
        System.out.println("\n------------------ setName() ------------------");
        System.out.println("Setting name to: " + name);
   
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country { code = '" + code + "', name = '" + name + "' }";
    }
}
