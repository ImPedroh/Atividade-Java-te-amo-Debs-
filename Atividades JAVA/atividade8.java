package atividade java;

import java.util.Scanner;

public class atividade8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codPeca1;
		int codPeca2;
		
		double valorPeca1;
		double valorPeca2;
		
		int quantPeca1;
		int quantPeca2;

		double apiInput= 0;
		double apiResult = apiInput/100;
		
		System.out.println("Digite o código da peça 1: ");
		codPeca1 = sc.nextInt();
		System.out.println("Digite o valor únitário da peça 1: ");
		valorPeca1 = sc.nextDouble();
		System.out.println("Informe a quantidade de peças: ");
		quantPeca1 = sc.nextInt();
		
		
		sc.close();
	}

}