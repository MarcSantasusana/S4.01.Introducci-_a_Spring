package cat.itacademy.barcelonactiva.SantasusanaBerch.Marc.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("HelloWorld")
    public String helloWorld(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String name)
    {

        return "Hi, " + name + ". You are executing a Maven project.";


    }

    @GetMapping(value = {"HelloWorld2", "HelloWorld2/{nom}"})
    public String helloWorld2(@PathVariable(name = "nom", required = false) String name)
    {

        return "Hi, " + name + ". You are executing a Maven project.";

    }

}
