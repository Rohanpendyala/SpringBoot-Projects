package com.rohanfirstproject.banking_app.repository;

import com.rohanfirstproject.banking_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository< Account , Long> {
}

