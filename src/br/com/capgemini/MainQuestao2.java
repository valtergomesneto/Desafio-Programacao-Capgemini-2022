package br.com.capgemini;

import java.util.Scanner;

public class MainQuestao2 {

	public static void main(String[] args) {
		
		//instancia objeto scan a classe Scanner
		Scanner scan = new Scanner(System.in); 
		//faz a leitura da senha e grava na variavel senha
		String senha = scan.nextLine();

		//instancia a classe questão2 ao objeto q2
		Questao2 q2 = new Questao2();

		//chamada do metodo que fara a logica na classe questão2
		String resultado = String.valueOf(q2.checkPass(senha));
		System.out.println(resultado);
	}
}
