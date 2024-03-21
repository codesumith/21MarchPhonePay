package com.phonePay.Transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonePay.Transaction.Repository.PhonePayTransactionRepository;
import com.phonePay.Transaction.entity.TransactionDtls;

@Service
public class PhonePayTransacitonalService {

	@Autowired
	PhonePayTransactionRepository phonePayTransactionRepository; 
	
	public void saveTransactionalDetails(TransactionDtls transactionDtls) {
		phonePayTransactionRepository.save(transactionDtls);
	}
	
}
