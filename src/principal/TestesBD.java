package principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.model.Conexao;

public class TestesBD {
private static Conexao conectar = null;
	
	public static void main(String[] args) {
		try{
	
			//servidor, banco de dados, usuario, senha
			conectar = new Conexao();
	
			//Aqui pode vir o uso da conex�o para executar comando DDL ou DML
	
			System.out.println("Usuario da Conexao: " + conectar.getConexao().getMetaData().getUserName());
			System.out.println("URL da Conexao: " + conectar.getConexao().getMetaData().getURL());
			buscandoDadosParaTeste();
			/*operacaoTransacaoDeTeste();*/
	
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
		String comandoDMLAlunosMaiorEMenor = "SELECT cpf, nome_completo FROM pessoa " +
				"WHERE cpf >= ? AND cpf <= ?;";
	
		try {
			ResultSet resultado = null;
	
	
			//PreparedStatement stmTodosAlunos = con.prepareStatement(comandoDMLTodosAlunos);
			PreparedStatement stmAlunosMaiorEMenor = con.prepareStatement(comandoDMLAlunosMaiorEMenor);
	
			stmAlunosMaiorEMenor.setLong(1, 120000000);
			stmAlunosMaiorEMenor.setLong(2, 130000000);
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
					System.out.println("Nome do Aluno: " + resultado.getString(iNome) + "CPF(ID): " + resultado.getObject(iMatricula));
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
}
