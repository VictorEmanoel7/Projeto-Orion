package com.example.cadastro.repository;

import com.example.cadastro.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    public Account findByEmail(String email);
}
