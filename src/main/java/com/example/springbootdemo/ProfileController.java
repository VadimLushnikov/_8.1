package com.example.springbootdemo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProfileController {
    private SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
