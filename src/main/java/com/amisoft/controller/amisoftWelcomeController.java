package com.amisoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amitdatta on 10/06/17.
 */

@RestController
@RefreshScope
@EnableResourceServer
public class amisoftWelcomeController {

    @Value(value = "${amisoft.service.welcome}")
    private String message;

    @RequestMapping(value = "/welcome", method= RequestMethod.GET)
    public ResponseEntity<String> welcomeMessage(){

        ResponseEntity<String> responseStatus = null;
        return responseStatus = ResponseEntity.status(HttpStatus.OK).body
                ("Welcome message :" + message);
    }
}
