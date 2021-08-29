package de.oette.course.A05;

import org.springframework.stereotype.Component;

@Component
public class MyCalculator implements Calculator{

    public MyCalculator() {
        System.out.println("MyCalculator loaded!");
    }

    @Override
    public int sum(int value1, int value2) {
        return value1 + value2;
    }
}
