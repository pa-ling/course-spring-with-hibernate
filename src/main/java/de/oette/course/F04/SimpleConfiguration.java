package de.oette.course.F04;

import org.springframework.context.annotation.Bean;

public class SimpleConfiguration {

    @Bean
    public SimpleBean simpleBean() {
        System.out.println("Simple bean created");
        return new SimpleBean();
    }
}
