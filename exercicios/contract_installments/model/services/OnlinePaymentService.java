package interfaces.exercicios.contract_installments.model.services;

public interface OnlinePaymentService {

	Double paymentFee(Double amount);
	Double interest(Double amount, Integer months);
	
}
