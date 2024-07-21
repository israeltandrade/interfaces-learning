package interfaces.exercicios.contract_installments.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercicios.contract_installments.model.entities.Contract;
import interfaces.exercicios.contract_installments.model.entities.Installment;
import interfaces.exercicios.contract_installments.model.services.ContractService;
import interfaces.exercicios.contract_installments.model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		
		System.out.print("Número: ");
		int contractNumber = sc.nextInt();
		sc.nextLine(); // Consome a quebra de linha pendente
		System.out.println();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);
		System.out.println();
		
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		System.out.println();
		
		Contract obj = new Contract(contractNumber, contractDate, contractValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int installmentsNumber = sc.nextInt();
		System.out.println();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, installmentsNumber);
				
		System.out.println("Parcelas:");
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
		
	}

}
