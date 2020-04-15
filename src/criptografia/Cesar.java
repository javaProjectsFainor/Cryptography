/**
 * Aluno: Melques Santos Paiva
 * Faculdade Independente do Nordeste - Fainor
 * Redes de Computadores II
 */

package criptografia;

public class Cesar {
	
	private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	/**
	 * Fun��o que realizar quebra de palavra criptografada a partir
	 * do algoritimo de cesar. Essa fun��o � utilizada caso saiba quantos
	 * passos est�o sendo utilizados para criptografar a palavra
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
	 * Fun��o que realizar quebra de palavra criptografada a partir
	 * do algoritimo de cesar. Utiliza-se da l�gica de for�a bruta
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
	 * Fun��o quer realiza a criptografia de uma palavra a partir
	 * do algoritimo de cesar
	 * 
	 * @author Melques Santos Paiva
	 * @param steps
	 * @param word
	 * @return Palavra criptografada
	 */
	public String encripty(int steps, String word) {
		// removendo espa�os e caracters especias
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
		word = word.replace("�", "c");
		word = word.replace("�", "a");
		word = word.replace("�", "a");
		word = word.replace("A", "a");
		word = word.replace("�", "a");
		word = word.replace("�", "a");
		word = word.replace("�", "a");
		word = word.replace("�", "a");

		word = word.replace("�", "e");
		word = word.replace("E", "e");
		word = word.replace("�", "e");
		
		word = word.replace("�", "i");
		word = word.replace("I", "i");
		word = word.replace("�", "i");
		
		word = word.replace("�", "o");
		word = word.replace("O", "o");
		word = word.replace("�", "o");
		word = word.replace("�", "o");		
		word = word.replace("�", "o");
		
		word = word.replace("�", "u");
		word = word.replace("U", "u");
		word = word.replace("�", "u");
		
		return word;
	}
}
