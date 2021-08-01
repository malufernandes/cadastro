package principal;

import java.util.List;

public class pessoa {

	private String nome;
	private Integer idades;
	
	public pessoa(String nome, Integer idades) {
		this.nome = nome ;
		this.idades = idades;
	}
	
	//getter
	public String getNome() {
		return nome;
	}
	
	public Integer getIdades() {
		return idades;
	}

	@Override
	public String toString() {
		return "nome: " + nome +" idade: "+idades;
	}
}
