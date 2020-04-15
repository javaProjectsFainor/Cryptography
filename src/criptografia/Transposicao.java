package criptografia;

public class Transposicao {
	
	/**
	 * Criptografando utilizando a cifra de transposição
	 * 
	 * @author Melques Santos Paiva
	 * @param word
	 * @param lines
	 */
	public void encripty(String word, float lines) {
		char caracter;
		int firstIndex = 0;
		int index = 0;
		char result[][] = new char[(int)lines][(int)Math.ceil(word.length()/lines)];
		
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < (int)Math.ceil(word.length()/lines); j++) {
				if(index < word.length()) {
					caracter = word.charAt(index);
					result[i][j] = caracter;
					index = index + (int)lines;	
				}
			}
			firstIndex++;
			index = firstIndex;
		}
		
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < (int)Math.ceil(word.length()/lines); j++) {
				if(result[i][j] != 0) {
					System.out.print(result[i][j]);
				}
			}
		}
	}
}
