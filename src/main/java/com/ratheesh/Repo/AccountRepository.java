package com.ratheesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratheesh.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
