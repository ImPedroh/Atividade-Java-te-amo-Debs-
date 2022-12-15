import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prato;
		int sobremesa;
		int bebida;
		int cal=0;
		
		System.out.println("Colocque seu prato: ");
		System.out.printf("1- Vegetariano 180cal %n2- Peixe 280cal%n3- Frango 250cal%n4- Carne 350cal");
			prato = sc.nextInt();
			
			switch (prato) {
			case 1: cal += 180;
			break;
			case 2: cal += 280;
			break;
			case 3: cal += 250;
			break;
			case 4: cal += 350;
			break;
			}
			
		System.out.println("Coloque sua sobremesa: ");
		System.out.printf("1- Abacaxi 75cal %n2- Sorvete Diet 110cal%n3- Mousse Diet 170cal%n4- Mousse Chocolate 200cal");
			sobremesa = sc.nextInt();
			switch (sobremesa) {
			case 1: cal += 75;
			break;
			case 2: cal += 110;
			break;
			case 3: cal += 170;
			break;
			case 4: cal += 200;
			break;
			}
				
		System.out.println("Coloque sua bebida: ");
		System.out.printf("1- Ch� 20cal %n2- Suco de laranja 70cal%n3- Suco de mel�o 100cal%n4- Refri Diet 65cal");
			bebida = sc.nextInt();
			switch (bebida) {
			case 1: cal += 20;
			break;
			case 2: cal += 70;
			break;
			case 3: cal += 100;
			break;
			case 4: cal += 65;
			break;
			}
			
			System.out.println("Total de calorias na sua refeição: " + cal + " calorias");
			
			sc.close();
	}

}