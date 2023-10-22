package ie.atu.labweek3y4cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/registerUser/{name}/{email}")
    public String registerUser(
            @PathVariable String name,
            @PathVariable String email
    ) {
        return "User registered: Name - " + name + ", Email - " + email;
    }
}
