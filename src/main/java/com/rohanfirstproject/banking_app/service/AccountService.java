package com.rohanfirstproject.banking_app.service;
import com.rohanfirstproject.banking_app.dto.AccountDto;
import com.rohanfirstproject.banking_app.entity.Account;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

}
