package br.com.capgemini;

import java.util.Scanner;

public class Questao1 {
	
	//criação do metodo para criar a escada com a formatação solicitada

	public StringBuilder getEscadas(int n) {
		StringBuilder estrela = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				estrela.append(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				estrela.append("*");
			}
			if (i != n - 1) {
				estrela.append("\n");
			}
		}
		return estrela;
	}
}