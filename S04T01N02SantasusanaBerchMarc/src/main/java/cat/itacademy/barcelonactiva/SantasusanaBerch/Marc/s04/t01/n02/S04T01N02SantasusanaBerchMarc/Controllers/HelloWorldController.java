package cat.itacademy.barcelonactiva.SantasusanaBerch.Marc.s04.t01.n02.S04T01N02SantasusanaBerchMarc.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("HelloWorld")
    public String helloWorld(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String name) {

        return "Hi, " + name + ". You are executing a Gradle project.";


    }

    @GetMapping(value = {"HelloWorld2", "HelloWorld2/{nom}"})
    public String helloWorld2(@PathVariable(name = "nom", required = false) String name) {

        return "Hi, " + name + ". You are executing a Gradle project.";

    }

}