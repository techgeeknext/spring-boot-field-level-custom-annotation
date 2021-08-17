package com.techgeeknext.controller;

import com.techgeeknext.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class UserController {

    @PostMapping("/add/user")
    public ResponseEntity<String> validateObject(@RequestBody @Valid User user) {
        return new ResponseEntity<>("Valid User!", HttpStatus.OK);
    }
}
