package br.com.capgemini;


import java.util.Scanner;

public class MainQuestao1 {

	public static void main(String[] args) {

		//instância da classe Scanner
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("n = ");
		int n = scan.nextInt(); 
		
		Questao1 q1 = new Questao1(); //Instacia q1 a classe Questão1 que fara a logica
		
		String resultado = q1.getEscadas(n).toString();
		System.out.println(resultado);
	}

}
