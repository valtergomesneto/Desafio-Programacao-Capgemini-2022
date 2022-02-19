package br.com.capgemini;

import java.util.Arrays;
import java.util.HashMap;

public class Questao3 {

	public int getAnagramas(String anagrama) {

		//vari�vel que vai guardar a quantidade de anagramas encontrados na String
		int contAnagramas = 0;
		
		//vari�vel que armazena o tamanho da String que foi passada para o m�todo
		int lengthAnagrama = anagrama.length();
		
		//inst�ncia do hashmap respons�vel por armazenar as substrings geradas a partir das itera��es abaixo
		HashMap<String, Integer> mapAnagramas = new HashMap<>();

		//for que faz a itera��o das substring e armazena dentro do hashmap
		for (int i = 0; i < lengthAnagrama; i++) {
			for (int j = i; j < lengthAnagrama; j++) {
				
				//o array de char � instanciado a cada itera��o do segundo for
				//atribuimos a substring ao array de char utilizando como �ndice inicial
				//o valor de i do primeiro for e o segundo �ndice recebe o valor de j da
				//segunda itera��o acrescido de +1 e por fim � convertido para um array de char
				char[] curr = anagrama.substring(i, j + 1).toCharArray();
				
				//m�todo que ordena o char recebido a partir da substring
				Arrays.sort(curr);
				
				//ap�s ordenar o array de char, o valor � atribu�do novamente para uma String 
				String val = new String(curr);

				//essa condi��o verifica se a String "val" est� contida no hashmap que foi instanciado
				//no in�cio do m�todo
				if (mapAnagramas.containsKey(val)) {
					//sendo verdadeira a condi��o, � feito um put do valor e o count atual � acrescido de +1
					mapAnagramas.put(val, mapAnagramas.get(val) + 1);
				} else {
					//caso contr�rio o valor � apenas adicionado com o count de 1
					mapAnagramas.put(val, 1);
				}
			}
		}

		//esse foreach � respons�vel por popular a vari�vel que ser� retornada pelo m�todo
		for (String key : mapAnagramas.keySet()) {
			
			//essa vari�vel armazena a quantidade de ocorr�ncias relacionadas a key do foreach
			int n = mapAnagramas.get(key);
			//Seguindo a regra matem�tica abaixo, as correspond�ncias s�o atribu�das ao contador que ser� retornado
			contAnagramas += (n * (n - 1)) / 2;
		}

		return contAnagramas;
	}

}
