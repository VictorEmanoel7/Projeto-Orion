package com.example.cadastro.controller;

import com.example.cadastro.domain.Account;
import com.example.cadastro.dto.AccountRegisterDTO;
import com.example.cadastro.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> registerUser(@RequestBody @Valid AccountRegisterDTO accountRegisterDTO, UriComponentsBuilder uriBuilder) {
        var result = accountService.registerUser(accountRegisterDTO, uriBuilder);
        if (result == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.created(result.getUri()).body(result.getAccount());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getUser(@PathVariable Long id) {
        var user = accountService.getUser(id);
        return ResponseEntity.ok(user);
    }
}
