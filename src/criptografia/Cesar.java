/**
 * Aluno: Melques Santos Paiva
 * Faculdade Independente do Nordeste - Fainor
 * Redes de Computadores II
 */

package criptografia;

public class Cesar {
	
	private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	/**
	 * Função que realizar quebra de palavra criptografada a partir
	 * do algoritimo de cesar. Essa função é utilizada caso saiba quantos
	 * passos estão sendo utilizados para criptografar a palavra
	 * 
	 * @author Melques Santos Paiva
	 * @param word
	 * @param steps
	 */
	public void decripty(String word, int steps) {
		int index;
		char caracter;
		
		for(int i = 0; i < word.length(); i++) {
			caracter = word.charAt(i);
			index = this.indexOf(caracter);

			if(index + steps < letters.length) {
				System.out.print(letters[index + steps]);
			} else if(index + steps == letters.length) {
				System.out.print(letters[0]);
			} else {
				System.out.print(letters[-(letters.length - (index + steps))]);
			}
		}
	}
	
	/**
	 * Função que realizar quebra de palavra criptografada a partir
	 * do algoritimo de cesar. Utiliza-se da lógica de força bruta
	 * para realizar a quebrar da palavra
	 * 
	 * @author Melques Santos Paiva
	 * @param word
	 */
	public void decripty(String word) {
		int index;
		char caracter;

		for(int i = 0; i < letters.length; i++) {
			for(int j = 0; j < word.length(); j++) {
				caracter = word.charAt(j);
				index = this.indexOf(caracter);
				
				if(index + i < letters.length) {
					System.out.print(letters[index + i]);
				} else if(index + i == letters.length) {
					System.out.print(letters[0]);
				} else {
					System.out.print(letters[-(letters.length - (index + i))]);
				}
			}
			
			System.out.println("\n");	
		}
	}
	
	/**
	 * Função quer realiza a criptografia de uma palavra a partir
	 * do algoritimo de cesar
	 * 
	 * @author Melques Santos Paiva
	 * @param steps
	 * @param word
	 * @return Palavra criptografada
	 */
	public String encripty(int steps, String word) {
		// removendo espaços e caracters especias
		word = this.replaceCaracters(word);
		
		String encriptyWord = "";
		int index;
		char caracter;
		
		for(int i = 0; i < word.length(); i++) {
			caracter = word.charAt(i);
			index = this.indexOf(caracter);

			if(index + steps < letters.length) {
				encriptyWord = encriptyWord + letters[index + steps];
			} else if(index + steps == letters.length) {
				encriptyWord = encriptyWord + letters[0];
			} else {
				encriptyWord = encriptyWord + letters[-(letters.length - (index + steps))];
			}
		}
	
		return encriptyWord;
	}
	
	private int indexOf(char letter) {
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] == letter) {
				return i;
			}
		}
		
		return 1000;
	}
	
	private String replaceCaracters(String word) {
		word = word.replace(" ", "");
		word = word.replace("ç", "c");
		word = word.replace("á", "a");
		word = word.replace("à", "a");
		word = word.replace("A", "a");
		word = word.replace("À", "a");
		word = word.replace("Á", "a");
		word = word.replace("ã", "a");
		word = word.replace("Ã", "a");

		word = word.replace("é", "e");
		word = word.replace("E", "e");
		word = word.replace("É", "e");
		
		word = word.replace("í", "i");
		word = word.replace("I", "i");
		word = word.replace("Í", "i");
		
		word = word.replace("ó", "o");
		word = word.replace("O", "o");
		word = word.replace("Ó", "o");
		word = word.replace("Õ", "o");		
		word = word.replace("õ", "o");
		
		word = word.replace("ú", "u");
		word = word.replace("U", "u");
		word = word.replace("Ú", "u");
		
		return word;
	}
}
