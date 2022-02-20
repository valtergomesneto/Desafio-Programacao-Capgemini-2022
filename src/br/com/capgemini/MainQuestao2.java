package br.com.capgemini;

import java.util.Scanner;

public class MainQuestao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String senha = scan.nextLine();

		Questao2 q2 = new Questao2();

		System.out.println(q2.checkPass(senha));
	}
}