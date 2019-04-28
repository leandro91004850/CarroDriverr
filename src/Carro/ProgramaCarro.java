package Carro;

import java.util.Scanner;

public class ProgramaCarro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int entra;
		Carro car01 = new Carro(5,0,1); // EXIGE QUE INSERIMOS UM OU 3 VALORES NÚMERICOS NA ATRIBUIÇÃO EX: Carro(5,0,1)
		
		
		do {
		car01.abastecer();
		car01.Chaves();
		car01.PortasFechadas();
		car01.aumentaVelocidade();
		car01.kmPercorridos();
		car01.funcionarCarro();
		
		System.out.print("Deseja entra no sistema: [1-sim/0-nao]");
		 entra = teclado.nextInt();
		
		}while(entra == 1);
		
		System.out.println("Programa finalizando....");
		
	}

}



