package de.oette.course.A01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest(classes = {MainService.class, SubService.class})
class AutowiredAndInjectTest {

    @Inject
    private MainService mainService;

    @Test
    void testAnnotations() {
        mainService.logMessage();
	}

}
