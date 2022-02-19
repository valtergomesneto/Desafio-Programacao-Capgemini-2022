package br.com.capgemini;

import java.util.Arrays;
import java.util.HashMap;

public class Questao3 {

	public int getAnagramas(String anagrama) {

		//variável que vai guardar a quantidade de anagramas encontrados na String
		int contAnagramas = 0;
		
		//variável que armazena o tamanho da String que foi passada para o método
		int lengthAnagrama = anagrama.length();
		
		//instância do hashmap responsável por armazenar as substrings geradas a partir das iterações abaixo
		HashMap<String, Integer> mapAnagramas = new HashMap<>();

		//for que faz a iteração das substring e armazena dentro do hashmap
		for (int i = 0; i < lengthAnagrama; i++) {
			for (int j = i; j < lengthAnagrama; j++) {
				
				//o array de char é instanciado a cada iteração do segundo for
				//atribuimos a substring ao array de char utilizando como índice inicial
				//o valor de i do primeiro for e o segundo índice recebe o valor de j da
				//segunda iteração acrescido de +1 e por fim é convertido para um array de char
				char[] curr = anagrama.substring(i, j + 1).toCharArray();
				
				//método que ordena o char recebido a partir da substring
				Arrays.sort(curr);
				
				//após ordenar o array de char, o valor é atribuído novamente para uma String 
				String val = new String(curr);

				//essa condição verifica se a String "val" está contida no hashmap que foi instanciado
				//no início do método
				if (mapAnagramas.containsKey(val)) {
					//sendo verdadeira a condição, é feito um put do valor e o count atual é acrescido de +1
					mapAnagramas.put(val, mapAnagramas.get(val) + 1);
				} else {
					//caso contrário o valor é apenas adicionado com o count de 1
					mapAnagramas.put(val, 1);
				}
			}
		}

		//esse foreach é responsável por popular a variável que será retornada pelo método
		for (String key : mapAnagramas.keySet()) {
			
			//essa variável armazena a quantidade de ocorrências relacionadas a key do foreach
			int n = mapAnagramas.get(key);
			//Seguindo a regra matemática abaixo, as correspondências são atribuídas ao contador que será retornado
			contAnagramas += (n * (n - 1)) / 2;
		}

		return contAnagramas;
	}

}
