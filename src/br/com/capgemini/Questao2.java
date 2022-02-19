package br.com.capgemini;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Questao2 {

	public int checkPass(String n) {

		Integer c = 6;

		final String requeridos = "^.*(?=.*[!@#$%^&*()-+]).*$";
		final String permitidosDown = "^.*([a-z]+).*$";
		final String permitidosUP = "^.*([A-Z]+).*$";
		final String digitos = "^.*([0-9]+).*$";

		if (n.length() >= 6) {

			// array de boolean para validação dos requisitos
			boolean[] validador = new boolean[n.length()];
			for (int i = 0; i < n.length(); i++) {
				validador[i] = false;
			}

			HashMap<String, Integer> mapLetras = new HashMap<>();

			// preenche o map com cada caracter
			for (int i = 0; i < n.length(); i++) {
				String letra = n.substring(i, i + 1);
				if (mapLetras.containsKey(letra)) {
					mapLetras.put(letra, mapLetras.get(letra) + 1);
				} else {
					mapLetras.put(letra, 1);
				}
			}

			for (String key : mapLetras.keySet()) {
				if (key.matches(permitidosUP)) {
					validador[mapLetras.get(key)] = true;
				}
				if (key.matches(permitidosDown)) {
					validador[mapLetras.get(key)] = true;
				}
				if (key.matches(digitos)) {
					validador[mapLetras.get(key)] = true;
				}
				if (key.matches(requeridos)) {
					validador[mapLetras.get(key)] = true;
				}

			}

			for (String key : mapLetras.keySet()) {
				if (validador[mapLetras.get(key)] == true) {
					c--;
				}

			}

			if (n.length() >= 6) {
				c--;
			}

			if (c <= 0) {

				return 0;
			} else {

				return c;
			}

		} else {

			int aux = n.length();

			while (aux > 0) {

				if (n.matches(permitidosUP) || n.matches(permitidosDown) || n.matches(digitos)
						|| n.matches(requeridos)) {
					c--;
				}
				aux--;
			}
			return c;
		}
	}

}
