package com.phonePay.Transaction.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TransactionDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerNo;
	private String customerName;
	private String customerUpiId;
	private String receiverUpiAddress;
	private double amountSending;
	private String transactionStatus;
	
	public TransactionDtls() {
		super();

	}

	public TransactionDtls(String customerName, String customerUpiId, String receiverUpiAddress, double amountSending,
			String transactionStatus) {
		super();
		this.customerName = customerName;
		this.customerUpiId = customerUpiId;
		this.receiverUpiAddress = receiverUpiAddress;
		this.amountSending = amountSending;
		this.transactionStatus = transactionStatus;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerUpiId() {
		return customerUpiId;
	}

	public void setCustomerUpiId(String customerUpiId) {
		this.customerUpiId = customerUpiId;
	}

	public String getReceiverUpiAddress() {
		return receiverUpiAddress;
	}

	public void setReceiverUpiAddress(String receiverUpiAddress) {
		this.receiverUpiAddress = receiverUpiAddress;
	}

	public double getAmountSending() {
		return amountSending;
	}

	public void setAmountSending(double amountSending) {
		this.amountSending = amountSending;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@Override
	public String toString() {
		return "TransactionDtls [customerName=" + customerName + ", customerUpiId=" + customerUpiId
				+ ", receiverUpiAddress=" + receiverUpiAddress + ", amountSending=" + amountSending
				+ ", transactionStatus=" + transactionStatus + "]";
	}

	
}
