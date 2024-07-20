package interfaces.exercicios.contract_installments.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		
		System.out.print("Número: ");
		int contractNumber = sc.nextInt();
		System.out.println();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDateTime contractDate = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		System.out.println();
		
		System.out.print("Entre com o número de parcelas: ");
		int installmentsNumber = sc.nextInt();
		System.out.println();
		
		System.out.println("Parcelas:");
		
		sc.close();
		
	}

}
