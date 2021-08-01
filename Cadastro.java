package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import repositório.ImplementacaoMemoria;
import repositório.RepositorioPessoa;

public class Cadastro {

	private static final String pessoa = null;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		RepositorioPessoa repositorio = new ImplementacaoMemoria();

		boolean desejaContinuar = false;

		do {
			System.out.println("Digite um nome: ");
			String nome = scanner.nextLine();

			System.out.println("Digite a idade: ");
			Integer idade = scanner.nextInt();

			var Pessoa = new pessoa(nome, idade);
			repositorio.salvar(Pessoa);

			System.out.println();
			scanner.nextLine();

			System.out.println("Deseja continuar? (s) ou (n)");
			String resposta = scanner.nextLine();

			if (resposta.equals("s")) {

				desejaContinuar = true;

			} else {
				desejaContinuar = false;
			}

		} while (desejaContinuar);
		
		for (var Pessoa : repositorio.buscarTodos()) {
			System.out.println(Pessoa);
		}

	}

}
