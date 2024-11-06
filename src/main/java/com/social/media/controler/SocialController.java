package com.social.media.controler;

import com.social.media.models.SocialUser;
import com.social.media.service.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SocialController {

    @Autowired
    private SocialService socialService;

    // This method retrieves all users, so it should use @GetMapping
    @GetMapping("/social/users")
    public ResponseEntity<List<SocialUser>> getUsers() {
        return new ResponseEntity<>(socialService.getAllUsers(), HttpStatus.OK);
    }

    // This method saves a new user, so it should use @PostMapping and expect a request body
    @PostMapping("/social/users")
    public ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser socialUser) {
        return new ResponseEntity<>(socialService.saveUsers(socialUser), HttpStatus.CREATED);
    }

}
