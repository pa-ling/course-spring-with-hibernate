package de.oette.course.B05;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestDemoController {

    private String temp = "";

    @GetMapping
    public String get() {
        return this.temp;
    }

    @PostMapping
    @PutMapping
    public String set(@RequestParam String newText)
    {
        this.temp += newText;
        return this.temp;
    }

    @DeleteMapping
    public String delete()
    {
        this.temp = "";
        return this.temp;
    }
}
