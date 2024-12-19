package com.example.cadastro.controller;

import com.example.cadastro.domain.Account;
import com.example.cadastro.dto.AccountRegisterDTO;
import com.example.cadastro.repository.AccountRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("user")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<com.example.cadastro.domain.Account> registerUser(@RequestBody @Valid AccountRegisterDTO accountRegisterDTO, UriComponentsBuilder uriBuilder) {
        var user = accountRepository.findByEmail(accountRegisterDTO.email());
        if (user != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        user = new Account(accountRegisterDTO);
        accountRepository.save(user);

        var uri = uriBuilder.path("user/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<com.example.cadastro.domain.Account> getUser(@PathVariable Long id) {
        var user = accountRepository.getReferenceById(id);

        return ResponseEntity.ok(user);
    }

}
