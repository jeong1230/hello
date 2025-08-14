package kr.kosa.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public Map<String, Object> home() {
        return Map.of("message", "Hello World");
        //{"message" : "Hello World"}
    }
    

}
