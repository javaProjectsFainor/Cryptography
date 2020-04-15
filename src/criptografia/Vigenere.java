package criptografia;

public class Vigenere {
	
	private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	private char[][] table = new char[26][26];
	private int count = 0;
	private int index = 0;
	
	/**
	 * Função que gera a tabela de vigenere
	 */
	public void insertTable() {
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				index = count + j;
				if(index == 26) {
					index = 0;
				} else if(index > 26) {
					index = -(26 - index);
				}
				table[i][j] = letters[index];
			}
			count++;
		}
	}
	
	/**
	 * Função para encripitar palavra de acordo com a cifra de viginere
	 * @param word
	 * @param chave
	 */
	public void encripty(String word, String chave) {
		this.insertTable();
		int line;
		int column;
		for(int i = 0; i < word.length(); i++) {
			line = indexOf(word.charAt(i));
			if(i < chave.length()) {
				column = indexOf(chave.charAt(i));
			} else if(i == chave.length()) {
				column = 0;
			} else {
				column = indexOf(chave.charAt(-(chave.length() - i)));
			}
			
			System.out.print(this.table[line][column]);
		}
	}
	
	/**
	 * Retornando index de determinada letra no array de letras
	 * @param c
	 * @return
	 */
	private int indexOf(char c) {
		for(int i = 0; i < letters.length; i++) {
			if(c == letters[i]) {
				return i;
			}
		}
		
		return 100;
	}
}
