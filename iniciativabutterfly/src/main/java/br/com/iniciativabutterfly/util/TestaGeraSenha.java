package br.com.iniciativabutterfly.util;

public class TestaGeraSenha {
	
	public static void main(String[] args) {
		String geraSenha = new GeraSenha().geraSenhaAlfanumerica();
		
		System.out.println(geraSenha);
	}

}
