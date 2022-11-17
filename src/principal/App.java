package principal;

import estoque.model.Armacao;
import estoque.model.Lente;
import pessoas.model.Cliente;
import pessoas.model.FactoryPessoa;
import pessoas.model.Funcionario;



public class App {
	
	public static void main(String[] args) {
		//teste de Pessoa
		/*
		Pessoa pessoa01 = new Pessoa("Viviani Martins dos Santos", 8, 11, 1987, 01132354121, "Vila do Chaves", 1225544, "Cliente");
		Pessoa pessoa02 = new Pessoa("Teste dois de cadastro", 19, 1, 1986, 01132354121, "Vila do Chaves", 1221214, "Funcionario");
		Cliente cliente = new Cliente("Teste de cliente", 19, 1, 1986, 01132354121, "Vila do Chaves", 1221214, true);
		Funcionario funcionario = new Funcionario("Teste de funcionario", 19, 1, 1986, 01132354121, "Vila do Chaves", 1221214, 
				29, 10, 2022, "1547866Senha", "loginSeralogin", false);
		
		System.out.println("Dados da Pessoa: " + pessoa01);
		System.out.println("Dados da 2ª Pessoa: " + pessoa02);
		System.out.println("Dados Cliente: " + cliente);
		System.out.println("Dados Funcionario: " + funcionario);
		 */
		
		FactoryPessoa fabricaDePessoas = new FactoryPessoa();
		Cliente pessoa01 = (Cliente)fabricaDePessoas.getPessoa("Viviani Martins dos Santos", 8, 11, 1987, 01132354121, "Vila do Chaves", 1225544, "Cliente", false);
		Funcionario pessoa02 = (Funcionario)fabricaDePessoas.getPessoa("Teste dois de cadastro", 19, 1, 1986, 01132354121, "Vila do Chaves", 1221214, 
				29, 10, 2022, "1547866Senha", "loginSeralogin", true);
		
		
		System.out.println("Dados da Pessoa: " + pessoa01);
		System.out.println("\nDados da 2ª Pessoa: " + pessoa02);
		

		
		//Testes do estoque		
		Lente lente01 = new Lente("Lab 123",0.20,0.21,21,"Teste",2,"Tratamento teste");
		Armacao armacao01 = new Armacao("Arredondado",0.20,0.21,30,"RayBan", 2, "Teste", "4321");
		
		System.out.println("\n\nDados da armcacao "+ armacao01);
		System.out.println("\nDados da lente"+lente01);

	}
		
}

