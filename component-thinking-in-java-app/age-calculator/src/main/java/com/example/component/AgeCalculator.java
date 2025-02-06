package com.example.component;


import java.util.Calendar;

public class AgeCalculator implements CalculatorIfce {
    @Override
    public int calculateAge(Calendar dateOfBirth) {
        int birthYear = dateOfBirth.get(Calendar.YEAR);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }
}
