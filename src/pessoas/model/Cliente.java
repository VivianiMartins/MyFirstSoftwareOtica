package pessoas.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.model.Conexao;

public class Cliente extends Pessoa{

	private boolean spc;
	
	public Cliente(String nomeCompleto, int dia, int mes, int ano, long cpf,
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			long telefone, String tipo, boolean spc) throws PessoaExcecao{
		super( nomeCompleto, dia, mes, ano, (long)cpf, enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, (long)telefone, tipo);
		this.setSpc(spc);
	}
	
	public Cliente(String nomeCompleto, int dia, int mes, int ano, int cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			long telefone, String tipo) throws PessoaExcecao{
		super( nomeCompleto, dia, mes, ano, (long)cpf, 
				enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, (long)telefone, tipo);
		this.setSpc(false);
	}
	
	private void setSpc(boolean spc) {
		this.spc = spc;
	}
	
	public boolean getSpc() {
		return this.spc;
	}

	public void cadastrarCliente() {
		super.cadastrarPessoa();
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		
		String inserirCliente = "INSERT INTO cliente(consulta_spc, fk_pessoa_cpf) VALUES (?, ?)";
		try{
			PreparedStatement stmInserirCliente = con.prepareStatement(inserirCliente);
			
			//Montando os valores
			//spc:
			stmInserirCliente.setBoolean(1, this.getSpc());
			//cpf:
			stmInserirCliente.setLong(2, super.getCpf());
			
			//Aqui ocorre o registro: 
			stmInserirCliente.executeQuery();

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

	public void editarCliente() {
		super.editarPessoa();
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		System.out.println(con.toString());
		
		String editarCliente = "UPDATE cliente SET consulta_spc = ? WHERE fk_pessoa_cpf = "+ super.getCpf() ;
		
		try{
			PreparedStatement stmEditarCliente = con.prepareStatement(editarCliente);
			
			//Montando os valores
			//spc:
			stmEditarCliente.setBoolean(1, this.getSpc());
			
			//Aqui ocorre o registro:
			stmEditarCliente.executeUpdate();

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

	public static void excluirCliente(long cpf) {
		excluirPessoa(cpf);
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		
		String excluirCliente = "DELETE FROM cliente WHERE fk_pessoa_cpf = ?";
	
		try{
			PreparedStatement stmExcluirCliente = con.prepareStatement(excluirCliente);
			
			//Montando os valores
			//cpf:
			stmExcluirCliente.setLong(1, cpf);
			
			//Aqui ocorre o registro: 
			stmExcluirCliente.executeUpdate();
			
		}catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha na exclusao!");
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

	public static void pesquisarCliente(long cpf) {
		pesquisarPessoa((long)cpf);
		
		Conexao conectar = new Conexao();
		Connection con = conectar.getConexao();
		
		String pesquisarCliente = "SELECT consulta_spc FROM cliente WHERE fk_pessoa_cpf = ?";
		
		try {
			ResultSet resultado = null;
			PreparedStatement stmPesquisarCliente = con.prepareStatement(pesquisarCliente);
		
			stmPesquisarCliente.setLong(1, (long)cpf);
				
			resultado = stmPesquisarCliente.executeQuery();
			
			int iSPC = 1; 
			
			int conta = 0;
			
			if(resultado != null){
				
				while(resultado.next()){
					System.out.println( "\nSPC: " + resultado.getObject(iSPC));
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
	
	public String toString() {
		String texto = super.toString() + 
				"\nSpc: " + this.getSpc() ;
		return texto;
	}
}
