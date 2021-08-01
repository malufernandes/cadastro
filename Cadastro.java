package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

	private static final String pessoa = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
//		String [] nomes = new String[5]; 
		List<pessoa> pessoas = new ArrayList<pessoa>();
		List<String> nomes = new ArrayList<String>();
		List<Integer> idades = new ArrayList<Integer>();

		boolean desejaContinuar = false;

		do {
			System.out.println("Digite um nome: ");
			String nome = scanner.nextLine();

			System.out.println("Digite a idade: ");
			Integer idade = scanner.nextInt();

			var Pessoa = new pessoa(nome, idade);
			pessoas.add(Pessoa);

			scanner.nextLine();

			System.out.println("Deseja continuar? (s) ou (n)");
			String resposta = scanner.nextLine();

			if (resposta.equals("s")) {

				desejaContinuar = true;

			} else {
				desejaContinuar = false;
			}

		} while (desejaContinuar);

		for (var Pessoa : pessoas) {
			System.out.println(Pessoa);
		}

	}

}
