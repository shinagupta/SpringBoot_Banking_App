package com.example.bankingapp.controller;

import com.example.bankingapp.model.Account;
import com.example.bankingapp.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return bankService.getAllAccounts();
    }

    @PostMapping("/account")
    public Account createAccount(@RequestBody Account account) {
        return bankService.createAccount(account);
    }
}
