package com.example.movieaccount.controller;

import com.example.movieaccount.model.Account;
import com.example.movieaccount.service.MovieAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user/account")
public class MovieAccountController {

    @Autowired
    private MovieAccountService service;

    @GetMapping("/{userId}")
    public Optional<Account> getAccount(@PathVariable("userId") Long userId) {
        return service.getAccount(userId);
    }
}
