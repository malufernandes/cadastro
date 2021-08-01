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
			
			pessoa Pessoa = lerInformacoesDaPessoa(scanner);
			
			repositorio.salvar(Pessoa);

			desejaContinuar = questionarContinuacao(scanner);

		} while (desejaContinuar);

		for (var Pessoa : repositorio.buscarTodos()) {
			System.out.println(Pessoa);
		}

	}
	
	public static pessoa lerInformacoesDaPessoa(Scanner scanner) {
		
		System.out.println("Digite um nome: ");
		String nome = scanner.nextLine();

		System.out.println("Digite a idade: ");
		Integer idade = scanner.nextInt();
		
		limparScanner(scanner);
		
		return new pessoa(nome, idade);
		
	}

	public static void limparScanner(Scanner scanner) {
		scanner.nextLine();
	}

	public static boolean questionarContinuacao(Scanner scanner) {
		System.out.println("Deseja continuar? (s) ou (n)");
		var resposta = scanner.nextLine();
		return resposta.equals("s");

	}

}
