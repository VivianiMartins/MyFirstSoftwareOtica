package pessoas.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.model.Conexao;

public class Funcionario extends Pessoa {

	private String dataContratacao;
	private String senha;
	private boolean admin;
	
	public Funcionario(String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais, long telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha, boolean admin) throws PessoaExcecao 
	{
		super( nomeCompleto, dia, mes, ano, (long)cpf, 
				enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais,
				(long)telefone, "funcionário");
		this.setDataContracao(diaContratacao, mesContratacao, anoContratacao);
		this.setSenha(senha);
		this.setAdmin(admin);
	}
	
	public Funcionario(String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais, long telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha) throws PessoaExcecao 
	{
		super( nomeCompleto, dia, mes, ano, (long)cpf, 
				enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, (long)telefone, "funcionário");
		this.setDataContracao(diaContratacao, mesContratacao, anoContratacao);
		this.setSenha(senha);
		this.setAdmin(false);
	}
	
	public void setDataContracao(int diaContratacao, int mesContratacao, int anoContratacao) {
		String dataContratacao = diaContratacao + "/" + mesContratacao + "/" + anoContratacao;
		this.dataContratacao = dataContratacao;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String getDataContracao() {
		return this.dataContratacao;
	}
	
	public String getSenha() {
		return this.senha;
	}

	
	public boolean getAdmin(){
		return this.admin;
	}

	public void cadastrarFuncionario() {
		super.cadastrarPessoa();
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		
		String inserirFuncionario = "INSERT INTO funcionario(senha, fk_pessoa_cpf, data_contratacao, admin ) VALUES (?, ?, ?, ?)";
		try{
			PreparedStatement stmInserirFuncionario = con.prepareStatement(inserirFuncionario);
			
			//Montando os valores
			//senha:
			stmInserirFuncionario.setString(1, this.getSenha());
			//cpf:
			stmInserirFuncionario.setLong(2, super.getCpf());
			//data contratação:
			stmInserirFuncionario.setString(3, this.getDataContracao());
			//data de nascimento:
			stmInserirFuncionario.setBoolean(4, this.getAdmin());
			
			//Aqui ocorre o registro: 
			stmInserirFuncionario.executeQuery();

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

	public void editarFuncionario() {
		super.editarPessoa();
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		System.out.println(con.toString());
		
		String editarFuncionario = "UPDATE funcionario SET senha = ?, data_contratacao = ?, admin = ? WHERE fk_pessoa_cpf = "+ super.getCpf();
		
		try{
			PreparedStatement stmEditarFuncionario = con.prepareStatement(editarFuncionario);
			
			//Montando os valores
			//Montando os valores
			//senha:
			stmEditarFuncionario.setString(1, this.getSenha());
			//data contratação:
			stmEditarFuncionario.setString(2, this.getDataContracao());
			//data de nascimento:
			stmEditarFuncionario.setBoolean(3, this.getAdmin());
			
			//Aqui ocorre o registro:
			stmEditarFuncionario.executeUpdate();

		}catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha na edicao!");
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

	public static void pesquisarFuncionario(long cpf) {
		pesquisarPessoa((long)cpf);
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		
		String pesquisarFuncionario = "SELECT senha, data_contratacao, admin FROM funcionario " +
					"WHERE fk_pessoa_cpf = ?";
		
		try {
			ResultSet resultado = null;
			PreparedStatement stmPesquisarFuncionario = con.prepareStatement(pesquisarFuncionario);
		
			stmPesquisarFuncionario.setLong(1, cpf);
				
			resultado = stmPesquisarFuncionario.executeQuery();
			
			int iSenha = 1; 
			int iDataCont = 2;
			int iAdmin = 3;
			
			int conta = 0;
			
			if(resultado != null){
				while(resultado.next()){
					System.out.println( "\nSenha: " + resultado.getString(iSenha)+ "\nData de contratação: " + resultado.getString(iDataCont) + 
							"\nAdmin: " + resultado.getObject(iAdmin) );
					conta++;
				}
			}
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha na pesquisa");
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
	
	public static boolean fazerLogin(long login, String senha) {
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		
		String result = "";
		String checkLogin = "SELECT senha FROM funcionario WHERE fk_pessoa_cpf = ?";
		
		
		try {
			ResultSet resultado = null;
			PreparedStatement stmCheckLogin = con.prepareStatement(checkLogin);
		
			stmCheckLogin.setLong(1, login);
			
			resultado = stmCheckLogin.executeQuery();
			
			int iSenha = 1; 
			
			
			if(resultado != null){
				while(resultado.next()){
					//System.out.println( "\nSenha: " + resultado.getString(iSenha));
					result = resultado.getString(iSenha);
					//System.out.println( "\nSenha: " + result);
				}
			}
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha na pesquisa");
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
		return senha.equals(result);
		
	}
	
	public String toString() {
		String texto = super.toString() + "\nData Contratação: " + this.getDataContracao() +
				 "\nSenha: " + this.getSenha()
				+ "\nAdministrador: " + this.getAdmin();
		return texto;
	}

}
