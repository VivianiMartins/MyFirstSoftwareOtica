package aplicacao;
//teste individual das classes:

import pessoas.Pessoa;
import estoque.Armacao;
import estoque.Lente;

public class App {
	
	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa("Viviani Martins dos Santos", 8, 11, 1987, 113235455, "Vila do Chaves", 1225544, "Cliente");
		
		Pessoa pessoa02 = new Pessoa("Teste dois de cadastro", 19, 1, 1986, 1132354121, "Vila do Chaves", 1221214, "Funcionario");
		
		Lente lente01 = new Lente("Lab 123",0.20,0.21,21,"Teste",2,"Tratamento teste");
		
		Armacao armacao01 = new Armacao("Arredondado",0.20,0.21,30,"RayBan", 2, "Teste", "4321");
		
		System.out.println("Dados da Pessoa: " + pessoa01);
		System.out.println("Dados da 2ª Pessoa: " + pessoa02);
		System.out.println("Dados da armcacao "+ armacao01);
		System.out.println("Dados da lente"+lente01);

	}
		
}
