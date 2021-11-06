package com.haydikodlayalim.accountservice.api;

import com.haydikodlayalim.accountservice.entity.Account;
import com.haydikodlayalim.accountservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
/**
 * localhost:8080/account
 * GET PUT POST DELETE
 */
public class AccountApi {

    private final AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    @PostMapping()
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping
    public ResponseEntity<Account> update(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.update(account));
    }

    @DeleteMapping
    public void delete(String id) {
        accountService.delete(id);
    }

}
