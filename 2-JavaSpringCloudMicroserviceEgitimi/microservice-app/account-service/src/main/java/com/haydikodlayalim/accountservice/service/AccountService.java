package com.haydikodlayalim.accountservice.service;

import com.haydikodlayalim.accountservice.entity.Account;
import com.haydikodlayalim.accountservice.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account get(String id) {
        return accountRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Account not found"));
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public Account update(Account account) {
        Assert.isNull(account.getId(), "Id cannot be updated");
        return accountRepository.save(account);
    }

    public void delete(String id) {
        accountRepository.deleteById(id);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
