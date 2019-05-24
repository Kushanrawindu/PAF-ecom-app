package com.paf.ecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.ecom.services.PaymentServices;
import com.paf.ecom.domain.PaymentDTO;

import java.util.*;

@RestController
@RequestMapping("/payment")
public class Payment {
	
	@Autowired
	private PaymentServices paymentServices;
	
	@GetMapping("/all")
	public List<PaymentDTO> allPayments() {
		return paymentServices.findAllPayments();
	}
	
	@PostMapping("/add")
	public String addPayment(@RequestBody PaymentDTO Paymentdata) {
		return paymentServices.savePayment(Paymentdata);
	}
	
	@PutMapping("/update")
	public String updatePayment(@RequestBody PaymentDTO newPaymentData) {
		return paymentServices.updatePayment(newPaymentData);
	}
	
	@GetMapping("/find/{id}")
	public Optional<PaymentDTO> getPaymentById(@PathVariable Integer id) {
		return paymentServices.findById(id);
	}
	
	@GetMapping("/delete/{id}")
	public void removePaymentById(@PathVariable Integer id) {
		paymentServices.removeById(id);
	}
}
