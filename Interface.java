//INTERFACE INICIAL

package repositório;

import java.util.List;

import principal.pessoa;

public interface RepositorioPessoa {

	public void salvar(pessoa Pessoa);
	
	public pessoa buscar(Integer indice);
	
	public List<pessoa> buscarTodos();

}
