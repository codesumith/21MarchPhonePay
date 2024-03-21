package com.phonePay.Transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phonePay.Transaction.entity.TransactionDtls;
import com.phonePay.Transaction.service.PhonePayTransacitonalService;

@RestController
public class PhonePayTransactionalController {

	@Autowired
	PhonePayTransacitonalService phonePayTransacitonalService;
	
	@PostMapping(path="/transaction/details")
	public String transactionDetails(@RequestBody TransactionDtls transactionDtl) {
		System.out.println("Transaction Details are :"+transactionDtl);
		phonePayTransacitonalService.saveTransactionalDetails(transactionDtl);
		return "Transaction "+transactionDtl.getTransactionStatus();
	}
	
	
}
