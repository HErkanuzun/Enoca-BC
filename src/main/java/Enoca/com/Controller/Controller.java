package Enoca.com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controller {

    @GetMapping(value="/hello")
    public String helloWorld(){
        return "HELO FROM CONTROLLER";
    }
}
