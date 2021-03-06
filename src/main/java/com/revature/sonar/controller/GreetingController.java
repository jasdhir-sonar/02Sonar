package com.revature.sonar.controller;



import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController   // == @Controller + @ResponseBody
public class GreetingController {

    private static final String template = "Hello Again, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@RequestMapping
    @GetMapping("/greeting")
   //@ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
         return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
















/*@RestController // (Controller+ResponseBody)
public class GreetingController {

    private static final String template = "Hello Again, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")

    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}*/
