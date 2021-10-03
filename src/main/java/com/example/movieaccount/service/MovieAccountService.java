package com.example.movieaccount.service;

import com.example.movieaccount.model.Account;
import com.example.movieaccount.repository.MovieAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieAccountService {

    @Autowired
    private MovieAccountRepository repository;

    public Optional<Account> getAccount(Long userId) {

        return repository.findById(userId);
    }
}
