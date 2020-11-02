package com.uiautomationtest.util;

import com.github.javafaker.Faker;

import java.util.Locale;
/**
 * @author JaspreetAidhy
 *
 */
// This utility is created to generate test data for registration scenario
public class Util {
    private static Faker faker = new Faker(new Locale("en-US"));

    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateRandomFirstName() {
        return faker.name().firstName();
    }

    public static String generateRandomLastName() {
        return faker.name().lastName();
    }

    public static String generateRandomAddress() {
        return faker.address().buildingNumber();
    }

    public static String generateRandomCityName() {
        return faker.address().cityName();
    }

    public static String generateRandomPostCode() {
        return faker.address().zipCode().substring(0, 5);
    }

    public static String generateRandomMobileNo() {
        return faker.phoneNumber().cellPhone();
    }


}
