package pessoas.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Pessoa implements CadastrarPessoa, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeCompleto;
	private String dataNascimento;
	private long cpf;
	private String endereco;
	private int telefone;
	private String tipo;
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			int telefone, String tipo) throws PessoaExcecao{
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
			int telefone, String tipo) throws PessoaExcecao{
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
	
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, int telefone, String tipo)  throws PessoaExcecao{
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
	
	public Pessoa(String nomeCompleto, long cpf, int telefone, String tipo) throws PessoaExcecao{
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


	private void setTelefone(int telefone) {
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
			endereco = endereco + enderecoEstado;
		 else endereco = endereco + "MG, ";
		
		if(enderecoPais!=null) 
			endereco = endereco + enderecoPais;
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


	public int getTelefone() {
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
		Connection con = conectar.getConexao();
		
		String inserirPessoa = "INSERT INTO pessoa(cpf, nome_completo, data_nascimento,"
				+ "						   endereco,telefone) "
				+ "VALUES (?, ?, ?, ?, ?, "
				+ "	?,)";
		
		try{
			PreparedStatement stmInserirPessoa = con.prepareStatement(inserirPessoa);

			//Montando os valores
			//nome:
			stmInserirPessoa.setString(1, this.nomeCompleto);
			//data de nascimento:
			stmInserirPessoa.setString(2, this.dataNascimento);
			//cpf:
			stmInserirPessoa.setLong(3, this.cpf);
			//endereco:
			stmInserirPessoa.setString(4, this.endereco);
			//telefone
			stmInserirPessoa.setInt(5, this.telefone);
			//tipo
			stmInserirPessoa.setString(6, this.tipo);
			

			//Desativando o Auto Commit do banco
			con.setAutoCommit(false);

			//Aqui ocorre o registro: 
			stmInserirPessoa.executeUpdate();
			System.out.println("Insercao executada corretamente!");
			con.commit();


		}catch (SQLException e) {
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha insercao!");
					con.rollback();
				}catch(SQLException sqlE){
					sqlE.printStackTrace();
				}
			}
		}
		finally{
			/*if(con != null){
				con.setAutoCommit(true);
				con.close();
			}*/
		}
	}

	public void editarPessoa() {

	}

	public void excluirPessoa() {

	}

	public void pesquisarPessoa() {

	}
	
	public String toString() {
		String texto = "\nNome: " + this.getNomeCompleto() + "\nData de nascimento:" + this.getDataNascimento() + 
				"\nCPF: " + this.getCpf() + "\nEndereco: " + this.getEndereco() + "\nTelefone: " + this.getTelefone() +
				"\nTipo: " + this.getTipo() ;
		return texto;
	}

}
