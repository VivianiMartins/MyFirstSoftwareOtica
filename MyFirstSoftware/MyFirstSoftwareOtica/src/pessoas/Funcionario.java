package pessoas;

import java.util.Calendar;

public class Funcionario extends Pessoa {

	private Calendar dataContratacao;

	private String senha;

	private String login;
	
	private boolean admin;
	
	public Funcionario(String nomeCompleto, int dia, int mes, int ano, int cpf, String endereco, int telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha, String login, boolean admin) 
	{
		super( nomeCompleto, dia, mes, ano, cpf, endereco, telefone, "funcionário");
		this.setDataContracao(diaContratacao, mesContratacao, anoContratacao);

		this.setSenha(senha);

		this.setLogin(login);
		
		this.setAdmin(admin);
	}
	
	public Funcionario(String nomeCompleto, int dia, int mes, int ano, int cpf, String endereco, int telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha, String login) 
	{
		super( nomeCompleto, dia, mes, ano, cpf, endereco, telefone, "funcionário");
		this.setDataContracao(diaContratacao, mesContratacao, anoContratacao);

		this.setSenha(senha);

		this.setLogin(login);
		
		this.setAdmin(false);
	}
	
	public void setDataContracao(int diaContratacao, int mesContratacao, int anoContratacao) {
		Calendar dataContratacao = Calendar.getInstance();
		dataContratacao.set(anoContratacao, mesContratacao, diaContratacao);
		this.dataContratacao = dataContratacao;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	public void setLogin(String login) {
		this.login = login;
		
	}
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public Calendar getDataContracao() {
		return this.dataContratacao;
	}
	
	public String getSenha() {
		return this.senha;
	}

	public String getLogin() {
		return this.login;
	}
	
	public boolean getAdmin(){
		return this.admin;
	}

	public void criarFuncionario() {

	}

	public void editarFuncionario() {

	}

	public void pesquisarFuncionario() {

	}
	
	public String toString() {
		String texto = super.toString() + "\nData Conttratação: " + this.getDataContracao() +
				"\nLogin: " + this.getLogin() + "\nSenha: " + this.getSenha()
				+ "\nAdministrador: " + this.getAdmin();
		return texto;
	}

}
