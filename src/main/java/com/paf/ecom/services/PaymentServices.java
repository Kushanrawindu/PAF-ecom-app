package com.paf.ecom.services;

import com.paf.ecom.services.impl.*;
import com.paf.ecom.domain.PaymentDTO;
import java.util.*;

public interface PaymentServices {

	List<PaymentDTO> findAllPayments();

	String savePayment(PaymentDTO paymentdata);

	String updatePayment(PaymentDTO newPaymentData);

	Optional<PaymentDTO> findById(Integer id);

	void removeById(Integer id);
}
