package com.paf.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paf.ecom.domain.PaymentDTO;

public interface PaymentRepo extends JpaRepository<PaymentDTO,Integer>{

	
}
