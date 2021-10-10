package de.oette.course;

import de.oette.course.F04.MySimpleConfiguration;
import de.oette.course.F04.SimpleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@SuppressWarnings("SpellCheckingInspection")
@EnableAutoConfiguration
@MySimpleConfiguration
public class SpringAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndHibernateApplication.class, args);
	}

}
