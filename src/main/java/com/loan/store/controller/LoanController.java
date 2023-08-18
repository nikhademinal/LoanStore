package com.loan.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.store.entity.LoanEntity;
import com.loan.store.exception.InvalidLoanException;
import com.loan.store.serviceImpl.LoanServiceImpl;

@RestController
public class LoanController {
	
	@Autowired
    LoanServiceImpl loanServiceImpl;
    
	@PostMapping("/trade")
    public ResponseEntity<String> saveLoan(@RequestBody LoanEntity loan)
    {
    	if(loanServiceImpl.validateDueDate(loan))
    	{
    		loanServiceImpl.persist(loan);
    	}
    	else
    	{
    		throw new InvalidLoanException(loan.getLoanId()+" Loan is not valid");
    	}
    	
    	return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/loan")
    public List<LoanEntity> findAllLoan(){
        return loanServiceImpl.findAll();
    }

}
