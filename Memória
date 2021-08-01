package repositório;

import java.util.ArrayList;
import java.util.List;

import principal.pessoa;

public class ImplementacaoMemoria implements RepositorioPessoa {

	List<pessoa> pessoas = new ArrayList<pessoa>();

	@Override
	public void salvar(pessoa Pessoa) {
		pessoas.add(Pessoa);
	}

	@Override
	public pessoa buscar(Integer indice) {
		return pessoas.get(indice);
	}

	@Override
	public List<pessoa> buscarTodos() {
		return pessoas;
	}

}
