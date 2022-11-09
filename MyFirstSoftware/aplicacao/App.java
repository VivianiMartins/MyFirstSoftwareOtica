package aplicacao;

import pessoas.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Conexao;

public class App {
	
	private static Conexao conectar = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{

			//servidor, banco de dados, usuario, senha
			conectar = new Conexao();

			//Aqui pode vir o uso da conex�o para executar comando DDL ou DML


			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());
			buscandoDadosParaTeste();
			//operacaoTransacaoDeTeste();

		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			if(conectar != null)
				conectar.fecharConexao();
		}
	}
	private static void buscandoDadosParaTeste() {
		Connection con = conectar.getConexao();

		//String comandoDMLTodosAlunos = "SELECT nome, matricula FROM minicurso.aluno;";
		String comandoDMLAlunosMaiorEMenor = "SELECT nome, matricula FROM minicurso.aluno " +
				"WHERE matricula >= ? AND matricula <= ?;";

		try {
			ResultSet resultado = null;


			//PreparedStatement stmTodosAlunos = con.prepareStatement(comandoDMLTodosAlunos);
			PreparedStatement stmAlunosMaiorEMenor = con.prepareStatement(comandoDMLAlunosMaiorEMenor);

			stmAlunosMaiorEMenor.setInt(1, 50);
			stmAlunosMaiorEMenor.setInt(2, 200);
			System.out.println(stmAlunosMaiorEMenor.toString());
			//stm1.setString(3, "Alexandre");
			//stm1.executeUpdate();
			//resultado = stmTodosAlunos.executeQuery();
			resultado = stmAlunosMaiorEMenor.executeQuery();

			//String teste = null;
			//int matriculas = 0;
			int iNome = 1;
			int iMatricula =2;
			int conta = 0;
			if(resultado != null){
				while(resultado.next()){
					//teste = new String(resultado.getString(1));
					//matriculas = resultado.getInt(2);
					System.out.println("Nome do Aluno: " + resultado.getString(iNome) + "Matricula(ID): " + resultado.getInt(iMatricula));
					//System.out.println(teste + matriculas);
					conta++;
				}
				System.out.println(conta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			if(con != null){
				try{
					System.err.print("Falha transacao em Rollback!!!!");
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
		/*System.out.println("Seu aplicativo aqui...");
		
		Pessoa pessoa01 = new Pessoa("Viviani Martins dos Santos", 8, 11, 1987, 113235455, "Vila do Chaves", 1225544, "Cliente");
		
		Pessoa pessoa02 = new Pessoa("Teste dois de cadastro", 19, 1, 1986, 1132354121, "Vila do Chaves", 1221214, "Funcionario");
		
		System.out.println("Dados da Pessoa: " + pessoa01);
		System.out.println("Dados da 2ª Pessoa: " + pessoa02);
		*/

	}

