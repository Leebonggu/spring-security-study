package personal.fcsecurity1.controller;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.fcsecurity1.user.DefaultUser;

@RestController
public class HelloController {

    @GetMapping("/api/v1/hello")
    public String hello() {
        UserDetails user = new DefaultUser();

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getAuthorities());
        System.out.println(user.isAccountNonExpired());

        return "Hello, World!";
    }
}
