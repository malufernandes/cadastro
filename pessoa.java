package principal;

import java.util.List;

public class pessoa {

	String nome;
	Integer idades;
	
	public pessoa(String nome, Integer idades) {
		this.nome = nome ;
		this.idades = idades;
	}
	@Override
	public String toString() {
		return "nome: " + nome +" idade: "+idades;
	}
}
