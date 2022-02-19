package br.com.capgemini;
import java.util.Scanner;

public class MainQuestao3 {

	public static void main(String[] args) {

		//instancia objeto scr a classe Scanner
		Scanner scr = new Scanner(System.in);
		//instancia objeto anagrama a classe questao3
		Questao3 anagramas = new Questao3();
		String n = scr.next(); 
		//chama o metodo na classe anagrama que ira retornar a quantidade de substrings
		System.out.println(anagramas.getAnagramas(n)); 
		
	}

}