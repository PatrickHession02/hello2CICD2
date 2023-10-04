
package ie.atu.hello2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/greet/{name}") //maps the user entered name to the output
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/details")
    public String details(
            @RequestParam String name,
            @RequestParam int age) {
        String message = "Name: " + name + ", Age: " + age; //constructs string
        return message; //returns output
    }
}

