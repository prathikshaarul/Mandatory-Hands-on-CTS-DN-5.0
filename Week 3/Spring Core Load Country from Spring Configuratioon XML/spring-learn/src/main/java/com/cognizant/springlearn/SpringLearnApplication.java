package com.cognizant.springlearn;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        displayCountries();

    }

    public static void displayCountries() {

    System.out.println("START");

    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    ArrayList<Country> countries =
            (ArrayList<Country>) context.getBean("countryList");

    for (Country country : countries) {
        System.out.println(country);
    }

    context.close();

    System.out.println("END");
}
}