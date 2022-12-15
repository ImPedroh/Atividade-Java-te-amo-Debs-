import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salario = 0;
		
		
		System.out.println("Informe seu salário: ");
		salario = sc.nextDouble();
		
		double result = salario/1212.00;

		System.out.printf("Você recebe %.2f",result);
		System.out.print(" Salário(s) minímo(s)");
		
		sc.close();
	}

}