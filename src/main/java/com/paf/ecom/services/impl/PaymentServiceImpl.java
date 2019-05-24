package com.paf.ecom.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.paf.ecom.domain.PaymentDTO;
import com.paf.ecom.repositories.PaymentRepo;
import com.paf.ecom.services.PaymentServices;
import java.util.*;


@Service
public class PaymentServiceImpl implements PaymentServices {

	@Autowired
	private PaymentRepo paymentRepository;
	
	@Override
	public List<PaymentDTO> findAllPayments() {
		List<PaymentDTO> allpayments = paymentRepository.findAll();
		return allpayments;
	}

	@Override
	public String savePayment(PaymentDTO paymentdata) {
		// TODO Auto-generated method stub
		paymentRepository.save(paymentdata);
		return "Data saved";
	}

	@Override
	public String updatePayment(PaymentDTO newPaymentData) {
		String msg = null;
		if(newPaymentData.getPid()!=null) {
			paymentRepository.save(newPaymentData);
			msg = "Data Updated";
		}
		else {
			msg = "Error";
		}
		return msg;
	}

	@Override
	public Optional<PaymentDTO> findById(Integer id) {
		return paymentRepository.findById(id);
		
	}

	@Override
	public void removeById(Integer id) {
		// TODO Auto-generated method stub
		paymentRepository.deleteById(id);
	}

	
	
}
