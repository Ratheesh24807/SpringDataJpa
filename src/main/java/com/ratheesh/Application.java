package com.ratheesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ratheesh.Entity.Account;
import com.ratheesh.Entity.AccountPK;
import com.ratheesh.Repo.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
	
		AccountRepository  accrepo = context.getBean(AccountRepository.class);
		
		AccountPK acc = new AccountPK();
		
		acc.setAccId(101);
		acc.setAccType("SB");
		acc.setNumber(1234);

		Account account1 = new Account();
		account1.setBranch("Sulibele");
		account1.setHoldername("Ratheesh");
		account1.setAccountpk(acc);
		
		accrepo.save(account1);
		
		
		
		
		
	
	
	}

}
