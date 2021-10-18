package Switch;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		  System.out.println("Escolha um número entre 1 a 10:");
		  int num = entrada.nextInt();
		  switch (num) {
		     case 1:
		       System.out.println("Você escolheu 1, parabens!!!");
		       break;
		     case 2:
		       System.out.println("Você escolheu 2, parabens!!!");
		       break;
		     case 3:
		       System.out.println("Você escolheu 3, parabens!!!");
		       break;
		     case 4:
		       System.out.println("Você escolheu 4, parabens!!!");
		       break;
		     case 5:
			   System.out.println("Você escolheu 5, parabens!!!");
			   break;
		     case 6:
			   System.out.println("Você escolheu 6, parabens!!!");
			   break;
		     case 7:
			   System.out.println("Você escolheu 7, parabens!!!");
			   break;
		     case 8:
			   System.out.println("Você escolheu 8, parabens!!!");
			   break;
		     case 9:
			   System.out.println("Você escolheu 9, parabens!!!");
			   break;
		     case 10:
			   System.out.println("Você escolheu 10, parabens!!!");
			   break;
		     default:
		       System.out.println("Número inválido, que pena ;-----;");
		  }
	}
}
		