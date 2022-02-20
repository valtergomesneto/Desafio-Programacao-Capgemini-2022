package br.com.capgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	public int checkPass(String senha) {

		int c = 0;

		Pattern requeridos = Pattern.compile("^.*(?=.*[!@#$%^&*()-+]).*$");
		Pattern permitidosDown = Pattern.compile("^.*([a-z]+).*$");
		Pattern permitidosUp = Pattern.compile("^.*([A-Z]+).*$");
		Pattern digitos = Pattern.compile("^.*([0-9]+).*$");

		Matcher requeridosMatcher = requeridos.matcher(senha);
		Matcher permitidosDownMatcher = permitidosDown.matcher(senha);
		Matcher permitidosUpMatcher = permitidosUp.matcher(senha);
		Matcher digitosMatcher = digitos.matcher(senha);

		if (!requeridosMatcher.find()) {
			c++;
		}

		if (!permitidosDownMatcher.find()) {
			c++;
		}

		if (!permitidosUpMatcher.find()) {
			c++;
		}

		if (!digitosMatcher.find()) {
			c++;
		}

		if ((c + senha.length()) < 6) {
			c = c + 6 - (c + senha.length());

		}

		return c;
	}
}