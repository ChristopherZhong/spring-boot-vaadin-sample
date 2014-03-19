package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@PropertySource(value = { "file:${SPRING_CONFIG_LOCATION}" })
public class HelloController {

    @Value(value = "test.message")
    private String value;
    @Autowired
    private Environment environment;

    @RequestMapping("/")
    String home() {
        return "Hello World! (value = " + value + ", env = " + environment.getRequiredProperty("test.message") + ")";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
