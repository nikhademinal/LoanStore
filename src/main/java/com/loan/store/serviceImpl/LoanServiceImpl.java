package com.loan.store.serviceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.store.entity.LoanEntity;
import com.loan.store.repository.LoanRepository;
import com.loan.store.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService{
	
	private static final Logger log = LoggerFactory.getLogger(LoanServiceImpl.class);
	
	@Autowired
	LoanRepository loanRepository;

	@Override
	public void save(LoanEntity loan) {
		loan.setPaymentDate(LocalDate.now());
		storeMap.put(loan.getLoanId(), loan);
		
	}

	@Override
	public List<LoanEntity> findAll() {
		return storeMap.values().stream().collect(Collectors.toList());
	}

	@Override
	public LoanEntity findLoan(String loanId) {
		return storeMap.get(loanId);
	}
    
    public boolean validateDueDate(LoanEntity loan){
        return loan.getDueDate().isBefore(LocalDate.now())  ? false:true;
    }

    public void  persist(LoanEntity loan){
        loan.setPaymentDate(LocalDate.now());
        loanRepository.save(loan);
    }

    public List<LoanEntity> findAllLoan(){
       return  loanRepository.findAll();
    }

    public void updateExpiryFlagOfLoan(){
        loanRepository.findAll().stream().forEach(t -> {
                if (!validateDueDate(t)) {
                    log.info("Trade which needs to updated {}", t);
                    loanRepository.save(t);
                }
            });
        }
    
   

}
