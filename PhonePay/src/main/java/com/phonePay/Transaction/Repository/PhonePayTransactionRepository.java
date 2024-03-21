package com.phonePay.Transaction.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonePay.Transaction.entity.TransactionDtls;

public interface PhonePayTransactionRepository extends JpaRepository<TransactionDtls, Integer> {

}
