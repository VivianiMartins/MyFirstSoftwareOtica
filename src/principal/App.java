package principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import estoque.model.Armacao;
import estoque.model.Lente;
import estoque.model.Produto;
import ordemDeServico.model.OrdemDeServico;
import ordemDeServico.model.Receita;
import pessoas.model.Cliente;
import pessoas.model.FactoryPessoa;
import pessoas.model.Funcionario;
import unidades.model.Unidade;
import util.model.Conexao;
import serializacao.Deserializador;
import serializacao.Serializador;



public class App {
	
	public static void main(String[] args) {
		
		//teste Pessoas com BD
		FactoryPessoa fabricaDePessoas = new FactoryPessoa();
		/*
		//teste do BD com metodos de cliente
		//teste Insert:
		Cliente clienteBD = (Cliente)fabricaDePessoas.setPessoa("Caio de Abreu", 5, 8, 1999, (long)0632555111, "Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil",1225544, "Cliente", false);
		System.out.println("\ncliente BD: " + clienteBD);
		//clienteBD.cadastrarCliente();
		
		//teste procura com CPF:
		//Cliente.pesquisarCliente((long)644536402);
		
		//teste edição por CPF:
		Cliente clienteEditar = (Cliente)fabricaDePessoas.setPessoa("Valeria Rosana Almeida", 4, 1, 1975, (long)644536402, "Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil",1225544, "Cliente", true);
		System.out.println("\ncliente Editar: " + clienteEditar);
		//clienteEditar.editarCliente();
		
		//teste excluir pelo CPF:
		//Cliente.excluirCliente((long)1132354121);
		*/
		
		
		/*
		//teste do BD com metodos do funcionario
		//teste Insert:
		Funcionario funcionarioBD = (Funcionario)fabricaDePessoas.setPessoa("Vanuza Botelho", 5, 10, 1977, (long)874964126,"Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil", 1221214, 29, 10, 2022, "1547866Senha", true);
		System.out.println("\nFuncionario BD: " + funcionarioBD);
		//funcionarioBD.cadastrarFuncionario();
				
		//teste procura com CPF:
		//Funcionario.pesquisarFuncionario((long)874964126);
				
		//teste edição por CPF:
		Funcionario funcionarioEditar = (Funcionario)fabricaDePessoas.setPessoa("Maria Jose de Assis", 5, 10, 1977, (long)874964126,"Vila do Chaves", "31", "casa", "Acapulco", "75300-000",
				"Anapolis", "GO", "Brasil", 1221214, 29, 10, 2022, "123456", true);
		System.out.println("\nFuncionario BD: " + funcionarioEditar);
		//funcionarioEditar.editarFuncionario();
		*/
		
		
		/*
		//teste para o login:
		boolean entrar = false;
		entrar = Funcionario.fazerLogin((long)874964126, "123456");
		System.out.println( "\nEntrar? " + entrar);
		if(entrar == true) {
			System.out.println("Bem vindx!");
		}else {
			System.out.println("Login ou senha incorretos");
		}*/
	
		
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
		float desconto = 2.00 ;
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
		//Leandro criei ess string p gerar o nome do arquivo
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

