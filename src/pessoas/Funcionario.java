package pessoas;

import com.ibm.icu.util.Calendar;

public class Funcionario extends Pessoa {

	private Calendar dataContratacao;

	private String senha;

	private String login;
	
	public Funcionario(String nomeCompleto, int dia, int mes, int ano, int cpf, String endereco, int telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha, String login) {
		super( nomeCompleto, dia, mes, ano, cpf, endereco, telefone, "cliente");
		this.setDataContracao(diaContratacao, mesContratacao, anoContratacao);

		this.setSenha(senha);

		this.setlogin(login);
	}
	
	public void setDataContracao(int diaContratacao, int mesContratacao, int anoContratacao) {
		Calendar dataContratacao = Calendar.getInstance();
		dataContratacao.set(anoContratacao, mesContratacao, diaContratacao);
		this.dataContratacao = dataContratacao;
	}
	
	public void setSenha(String senha) {
		
	}

	public void setlogin(String login) {
		
	}
	
	public Calendar getDataContracao() {
		
		return this.dataContratacao;
	}
	
	public String setSenha() {
		return this.senha;
	}

	public String setlogin() {
		return this.login;
	}

	public void criarFuncionario() {

	}

	public void editarFuncionario() {

	}

	public void pesquisarFuncionario() {

	}

}
