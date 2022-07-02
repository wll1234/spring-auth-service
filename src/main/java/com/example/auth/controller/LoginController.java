package com.example.auth.controller;

import com.example.auth.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("login")
public class LoginController {

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @PostMapping
    public ResponseEntity<User.Response> login(@RequestBody User.Request user) {
        logger.info(user.toString());

        User.Response response = new User.Response();
        response.setInfo(new User.Info(1L, user.getEmail()));
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
