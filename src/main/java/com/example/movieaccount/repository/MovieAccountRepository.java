package com.example.movieaccount.repository;

import com.example.movieaccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieAccountRepository extends JpaRepository<Account, Long> {
}
