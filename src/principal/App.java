package principal;

import estoque.model.Armacao;
import estoque.model.Lente;
import estoque.model.Produto;
import ordemDeServico.model.OrdemDeServico;
import ordemDeServico.model.Receita;
import pessoas.model.Cliente;
import pessoas.model.FactoryPessoa;
import pessoas.model.Funcionario;
import unidades.model.Unidade;
import serializacao.Deserializador;
import serializacao.Serializador;



public class App {
	
	public static void main(String[] args) {
		/*
		//teste de Pessoa		
		FactoryPessoa fabricaDePessoas = new FactoryPessoa();
		//pessoa01 - teste das excepitions
		/*Cliente pessoa01 = (Cliente)fabricaDePessoas.setPessoa(null, 8, 11, 1987, 01132354121, "Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil",1225544, "Cliente", false);
		System.out.println("Dados da Pessoa: " + pessoa01);
		*/
		/*
		Funcionario pessoa02 = (Funcionario)fabricaDePessoas.setPessoa("Teste dois de cadastro", 19, 1, 1986, 01132354121,"Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil", 1221214, 29, 10, 2022, "1547866Senha", "loginSeralogin", true);
		Cliente cliente = (Cliente)fabricaDePessoas.setPessoa("João da Silva", 8, 11, 1987, 01132354121, "Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil",1225544, "Cliente", false);
		
		
		System.out.println("\nDados da 2ª Pessoa: " + pessoa02);
		
		*/
		
		//teste do BD com metodos da pessoa
		FactoryPessoa fabricaDePessoas = new FactoryPessoa();

		Cliente clienteBD = (Cliente)fabricaDePessoas.setPessoa("Joana da Silva", 8, 11, 1987, 05632354121, "Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil",1225544, "Cliente", false);
		clienteBD.cadastrarPessoa();

		/*
		//Testes do estoque		
		Lente lente01 = new Lente("Lab 123",0.20,0.21,21,"Teste",2,"Tratamento teste");
		Armacao armacao01 = new Armacao("Arredondado",0.20,0.21,30,"RayBan", 2, "Teste", "4321");
		Produto produto = new Produto("limpa lente", (double)5.0, (double)15.00, 1);
		
		System.out.println("\n\nDados da armação "+ armacao01);
		System.out.println("\nDados da lente"+lente01);
		System.out.println("\nProduto"+produto);
		
		
		//Testes unidades
		Unidade unidade = new Unidade("Matriz", "Rua triz, 468 - Centro", 38173455);
		System.out.println("\n\nDados da unidade "+ unidade);
		
		
		//Testes receitas
		Receita receita = new Receita("Dra. Maria", 2, 12, 2022, cliente, 
				(float)3.5, (float)0.5, (float)180.0, (float)0.0, 
				(float)3.5, (float)0.5, (float)180.0, (float)0.0, 
				(float)35.2, (float)35.2);
		
		
		//Testes da Ordem de Serviço
		float desconto = (float) 2.00 ;
		float valorTotal = produto.getPrecoDeVenda();
		
		OrdemDeServico nova = new OrdemDeServico("Andamento", valorTotal, desconto, "cartão 5X", "filho de fulana", 
				30, 11, 2022, cliente , unidade, produto, pessoa02);
		OrdemDeServico nova2 = new OrdemDeServico("Andamento", valorTotal, desconto, "cartão 5X", "filho de fulana", 
				30, 11, 2022, cliente ,receita,  unidade, produto, pessoa02);
		
		System.out.println("\nOrdem de serviço: " + nova);
		System.out.println("\nOrdem de serviço: " + nova2);
		
		//teste de serialização
		/*
		System.out.println("\n\nSerializador"); 
		Serializador s = new Serializador();
		//Leandro criei ess string p gerar o nome do arwuivo
		String nomeObj = "Ordem" + nova.getNumero();
		try { 
			  s.serializar("./" + nomeObj + ".obj " , nova);
		 }catch (Exception ex){
			  System.err.println("Falha ao serializar! - " + ex.toString());
		 }*/
		
		//teste de Deserializador 
		/*System.out.println("\n\nDeserializador");
		Deserializador d = new Deserializador();
        nova = null;
        try {
            nova = (OrdemDeServico) d.deserializar("./Ordem1.obj");
        }catch (Exception ex) {
            System.err.println("Falha ao deserializar! - " + ex.toString());
        }
        System.out.println( "Número da ordem - " + nova.getNumero() + nova.getCliente());
		*/
		
		
	}
		
}

