package atividade java;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Insira três valores:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        if (b > a && b > c){
            if(c>a){
                System.out.println(b + ", " + c + ", " + a);
            }
            else {
                System.out.println(b + ", " + a + ", " + c);
            }
        }
        else if (c>a && c>b) {
            if (a>b) {
            	System.out.println(c + ", " + a + ", " + b);
            }
            else {
            	System.out.println(c + ", " + b + ", " + a);
            }

        }
        else {
        	System.out.println(a + ", " + b + "," + c);
        }
        sc.close();
	}

}