package com.loan.store;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.loan.store.controller.LoanController;
import com.loan.store.entity.LoanEntity;
import com.loan.store.exception.InvalidLoanException;
import com.loan.store.serviceImpl.LoanServiceImpl;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private LoanController loanController;
	
	@Autowired
	private LoanServiceImpl loanServiceImpl;
	
	@Autowired
	private LoanEntity loanEntity;
	

	public static LocalDate getLocalDate(int year,int month, int day){
		LocalDate localDate = LocalDate.of(year,month,day);
		return localDate;
	}

	

}
