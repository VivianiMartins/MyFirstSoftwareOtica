package aplicacao;
//teste individual das classes:

import pessoas.Pessoa;

public class App {
	
	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa("Viviani Martins dos Santos", 8, 11, 1987, 113235455, "Vila do Chaves", 1225544, "Cliente");
		
		Pessoa pessoa02 = new Pessoa("Teste dois de cadastro", 19, 1, 1986, 1132354121, "Vila do Chaves", 1221214, "Funcionario");
		
		System.out.println("Dados da Pessoa: " + pessoa01);
		System.out.println("Dados da 2ª Pessoa: " + pessoa02);

	}
		
}
