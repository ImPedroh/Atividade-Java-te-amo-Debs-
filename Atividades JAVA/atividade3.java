package atividade java;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double saldo;
        double cred;
        double result;

        System.out.print("Informe sua média de saldo: ");
        saldo= sc.nextDouble();

         if (saldo>500 && saldo<1000){
             cred = saldo * 0.30;
             result = saldo + cred;
            System.out.println("Seu saldo de R$ " + saldo + " lhe concede um credito de 30%");
            System.out.println("Saldo Atual: R$ " + result);
        }
        else if (saldo>1000 && saldo<3000){
            cred = saldo * 0.40;
            result = saldo + cred;
            System.out.println("Seu saldo de R$ " + saldo + " lhe concede um credito de 40%");
            System.out.println("Saldo Atual: R$ " + result);
        }
         else if (saldo>3000){
             cred = saldo * 0.50;
             result = saldo + cred;
             System.out.println("Seu saldo de R$ " + saldo + " lhe concede um credito de 50%");
             System.out.println("Saldo Atual: R$ " + result);
         }
         else {
             System.out.println("Você não tem o saldo suficiente para obter o crédito");
             System.out.println("Saldo Atual: R$ " + saldo);
         }
         
         sc.close();
	}

}