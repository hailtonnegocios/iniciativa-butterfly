package br.com.iniciativabutterfly.util;

import java.util.Random;

public class GeraSenha {

	public String geraSenhaAlfanumerica() {

		final String LETRAS = "abcdefghijklmnopqrstuvxyz";
		final String NUMEROS = "0123456789";
		final Random RANDOM = new Random();
		String armazenaChaves = "";
		int index = -1;
		int index2 = -1;
		{
			for (int i = 0; i < 3; i++) {
				index = RANDOM.nextInt(LETRAS.length());
				index2 = RANDOM.nextInt(NUMEROS.length());
				armazenaChaves += LETRAS.substring(index, index + 1);
				armazenaChaves += NUMEROS.substring(index2, index2 + 1);
			}
			
		}
		return armazenaChaves;
	}
}