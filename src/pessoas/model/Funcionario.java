package pessoas.model;


public class Funcionario extends Pessoa {

	private String dataContratacao;
	private String senha;
	private String login;
	private boolean admin;
	
	public Funcionario(String nomeCompleto, int dia, int mes, int ano, int cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais, int telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha, String login, boolean admin) throws PessoaExcecao 
	{
		super( nomeCompleto, dia, mes, ano, cpf, 
				enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais,
				telefone, "funcionário");
		this.setDataContracao(diaContratacao, mesContratacao, anoContratacao);
		this.setSenha(senha);
		this.setLogin(login);
		this.setAdmin(admin);
	}
	
	public Funcionario(String nomeCompleto, int dia, int mes, int ano, int cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais, int telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha, String login) throws PessoaExcecao 
	{
		super( nomeCompleto, dia, mes, ano, cpf, 
				enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, telefone, "funcionário");
		this.setDataContracao(diaContratacao, mesContratacao, anoContratacao);
		this.setSenha(senha);
		this.setLogin(login);
		this.setAdmin(false);
	}
	
	public void setDataContracao(int diaContratacao, int mesContratacao, int anoContratacao) {
		String dataContratacao = diaContratacao + "/" + mesContratacao + "/" + anoContratacao;
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
	
	public String getDataContracao() {
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
		String texto = super.toString() + "\nData Contratação: " + this.getDataContracao() +
				"\nLogin: " + this.getLogin() + "\nSenha: " + this.getSenha()
				+ "\nAdministrador: " + this.getAdmin();
		return texto;
	}

}
