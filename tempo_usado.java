package aplicacao;

import java.util.Scanner;

public class tempo_usado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Tempo:");
		int entrada = sc.nextInt();
		int saida = sc.nextInt();
		
		int total = entrada+saida;
		
		System.out.printf("O jogo durou: "+total+" Hora(s)");
		
		sc.close();
	}

}
