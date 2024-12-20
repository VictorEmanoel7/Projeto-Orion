package com.example.cadastro.service;

import com.example.cadastro.domain.Account;
import com.example.cadastro.dto.AccountRegisterDTO;
import com.example.cadastro.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public RegisterResponse registerUser(AccountRegisterDTO accountRegisterDTO, UriComponentsBuilder uriBuilder) {
        var existingUser = accountRepository.findByEmail(accountRegisterDTO.email());
        if (existingUser != null) {
            return null; // Indica conflito
        }

        var newUser = new Account(accountRegisterDTO);
        accountRepository.save(newUser);

        var uri = uriBuilder.path("user/{id}").buildAndExpand(newUser.getId()).toUri();
        return new RegisterResponse(newUser, uri);
    }

    public Account getUser(Long id) {
        return accountRepository.getReferenceById(id);
    }

    public static class RegisterResponse {
        private final Account account;
        private final java.net.URI uri;

        public RegisterResponse(Account account, java.net.URI uri) {
            this.account = account;
            this.uri = uri;
        }

        public Account getAccount() {
            return account;
        }

        public java.net.URI getUri() {
            return uri;
        }
    }
}
