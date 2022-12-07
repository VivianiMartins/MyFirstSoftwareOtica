package pessoas.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.model.Conexao;

public abstract class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nomeCompleto;
	private String dataNascimento;
	private long cpf;
	private String endereco;
	private long telefone;
	private String tipo;
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			long telefone, String tipo) throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento( dia, mes, ano);
			this.setCpf(cpf);
			this.setEndereco(enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
					enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais);
			this.setTelefone(telefone);
			this.setTipo(tipo);
		} else throw new PessoaExcecao(nomeCompleto, cpf, telefone);
		
	}
	
	public Pessoa(String nomeCompleto, long cpf, String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			long telefone, String tipo) throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento(00, 00, 0000);
			this.setCpf(cpf);
			this.setEndereco(enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
					enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais);
			this.setTelefone(telefone);
			this.setTipo(tipo);
		} else throw new PessoaExcecao(nomeCompleto, cpf, telefone);
	}
	
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, long telefone, String tipo)  throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento(dia, mes, ano);
			this.setCpf(cpf);
			this.setEndereco(null, null, null, null, 
					null, null, null,  null);
			this.setTelefone(telefone);
			this.setTipo(tipo);
		} else throw new PessoaExcecao(nomeCompleto, cpf, telefone);
	}
	
	public Pessoa(String nomeCompleto, long cpf, long telefone, String tipo) throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento(00, 00, 0000);
			this.setCpf(cpf);
			this.setEndereco(null, null, null, null, 
					null, null, null,  null);
			this.setTelefone(telefone);
			this.setTipo(tipo);
		} else throw new PessoaExcecao(nomeCompleto, cpf, telefone);
	}
	

	private void setTipo(String tipo){
		this.tipo = tipo;
	}


	private void setTelefone(long telefone) {
		this.telefone = telefone;
	}


	private void setEndereco(String enderecoRua, String enderecoNumero, String enderecoComplemento,
			String enderecoBairro, String enderecoCep, String enderecoCidade, String enderecoEstado,  
			String enderecoPais) {
		String endereco;
		
		if(enderecoRua!=null) 
			endereco = enderecoRua + ", ";
		 else endereco = "Sem rua, ";
		
		if(enderecoNumero!=null) 
			endereco = endereco + enderecoNumero + ", ";
		 else endereco = endereco + "Sem numero, ";
		
		if(enderecoComplemento!=null) 
			endereco = endereco + enderecoComplemento;
		 else endereco = endereco + "Sem complemento, "; 
		
		if(enderecoBairro!=null) 
			endereco = endereco + ", " + enderecoBairro;
		 else endereco = endereco + "Sem bairro, "; 
		
		if(enderecoCep!=null) 
			endereco = endereco +  ", " + enderecoCep;
		 else if(enderecoCidade == "Ponte Nova")
			 endereco = endereco + " 35430-000, ";
		 else endereco = endereco + " sem Cep, ";
		
		if(enderecoCidade!=null) 
			endereco = endereco +  ", " + enderecoCidade;
		 else endereco = endereco + " sem cidade, ";
		
		 
		if(enderecoEstado!=null) 
			endereco = endereco +  ", " + enderecoEstado;
		 else endereco = endereco + "MG, ";
		
		if(enderecoPais!=null) 
			endereco = endereco +  ", " + enderecoPais;
		 else endereco = endereco + "Brasil"; 
		 
		this.endereco = endereco;
	}


	private void setCpf(long cpf) {
		this.cpf = cpf;
	}

	private void setDataNascimento(int dia, int mes, int ano) {
		String dataNascimento = dia + "/" + mes + "/" + ano;
		this.dataNascimento = dataNascimento;
	}


	private void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;	
	}
	
	public String getTipo() {
		return this.tipo;	
	}


	public long getTelefone() {
		return this.telefone;
	}


	public String getEndereco() {
		return this.endereco;	
	}


	public long getCpf() {
		return this.cpf;	
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}


	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	public void cadastrarPessoa() {
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		//System.out.println(con.toString());
		
		String inserirPessoa = "INSERT INTO pessoa(cpf, nome_completo, endereco, telefone, data_nascimento) VALUES (?, ?, ?, ?, ?)";
		//System.out.println("\nIniciou o inserir: " + inserirPessoa);
		try{
			PreparedStatement stmInserirPessoa = con.prepareStatement(inserirPessoa);
			
			//Montando os valores
			//cpf:
			stmInserirPessoa.setLong(1, getCpf());
			//nome:
			stmInserirPessoa.setString(2, getNomeCompleto());
			//endereco:
			stmInserirPessoa.setString(3, getEndereco());
			//telefone
			stmInserirPessoa.setLong(4, getTelefone());
			//data de nascimento:
			stmInserirPessoa.setString(5, getDataNascimento());
			
			//Aqui ocorre o registro: 
			//System.out.println(stmInserirPessoa.toString());
			stmInserirPessoa.executeQuery();

		}catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha insercao!");
					con.close();
				}catch(SQLException sqlE){
					sqlE.printStackTrace();
				}
			}
		}
		finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public void editarPessoa() {

	}

	public void excluirPessoa() {

	}

	public static void pesquisarPessoa(long cpf) {
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		//System.out.println(con.toString());
		
		String pesquisarPessoa = "SELECT cpf, nome_completo, endereco, telefone FROM pessoa " +
					"WHERE cpf = ?";
		System.out.println( "\n\nPesquisar: " + pesquisarPessoa);
		
		try {
			ResultSet resultado = null;
			PreparedStatement stmPesquisarPessoa = con.prepareStatement(pesquisarPessoa);
		
			stmPesquisarPessoa.setLong(1, cpf);
			System.out.println(stmPesquisarPessoa.toString());
				
			resultado = stmPesquisarPessoa.executeQuery();
			int iCpf = 1; 
			int iNome = 2;
			int iEndereco = 3;
			int iTelefone = 4;
			
			int conta = 0;
			
			if(resultado != null){
				
				while(resultado.next()){
					System.out.println( "\nCPF: " + resultado.getObject(iCpf)+ "\nNome: " + resultado.getString(iNome) + 
							"\nEndereço: " + resultado.getString(iEndereco) + "\nTelefone: " + resultado.getObject(iTelefone) );
					conta++;
				}
				
				System.out.println(conta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha na pesquisa: ");
					con.rollback();
				}catch(SQLException sqlE){
					sqlE.printStackTrace();
				}
			}
		}
		finally{
			if(con != null){
				try {
					con.setAutoCommit(true);
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public String toString() {
		String texto = "\nNome: " + this.getNomeCompleto() + "\nData de nascimento:" + this.getDataNascimento() + 
				"\nCPF: " + this.getCpf() + "\nEndereco: " + this.getEndereco() + "\nTelefone: " + this.getTelefone() +
				"\nTipo: " + this.getTipo() ;
		return texto;
	}

}
