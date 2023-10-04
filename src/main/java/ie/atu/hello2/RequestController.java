package ie.atu.hello2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello"; //Returns hello String
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }


}

