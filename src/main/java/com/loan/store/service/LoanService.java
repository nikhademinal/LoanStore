package com.loan.store.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.loan.store.entity.LoanEntity;

public interface LoanService {
	
	public  static Map<String,LoanEntity> storeMap =new ConcurrentHashMap<>();


    public void save(LoanEntity loan);

    List<LoanEntity> findAll();

    LoanEntity findLoan(String loanId);

}
