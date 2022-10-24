package pessoas;

import java.util.Calendar;


public class Pessoa {

	private String nomeCompleto;
	private Calendar dataNascimento;
	private int cpf;
	private String endereco;
	private int telefone;
	private String tipo;
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, int cpf, String endereco, int telefone, String tipo) {
		this.setNomeCompleto( nomeCompleto);
		this.setDataNascimento( dia, mes, ano);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setTipo(tipo);
	}
	
	public Pessoa(String nomeCompleto, int cpf, String endereco, int telefone, String tipo) {
		this.setNomeCompleto( nomeCompleto);
		this.setDataNascimento(00, 00, 0000);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setTipo(tipo);
	}
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, String endereco, int telefone, String tipo) {
		this.setNomeCompleto( nomeCompleto);
		this.setDataNascimento(dia, mes, ano);
		this.setCpf(00000000000);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setTipo(tipo);
	}
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, int cpf, int telefone, String tipo) {
		this.setNomeCompleto( nomeCompleto);
		this.setDataNascimento(dia, mes, ano);
		this.setCpf(cpf);
		this.setEndereco("sem endereco registrado");
		this.setTelefone(telefone);
		this.setTipo(tipo);
	}
	
	public Pessoa(String nomeCompleto, int telefone, String tipo) {
		this.setNomeCompleto( nomeCompleto);
		this.setDataNascimento(00, 00, 0000);
		this.setCpf(0000000000);
		this.setEndereco("sem endereco registrado");
		this.setTelefone(telefone);
		this.setTipo(tipo);
	}
	

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}


	private void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	private void setCpf(int cpf) {
		this.cpf = cpf;
	}

	private void setDataNascimento(int dia, int mes, int ano) {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(ano, mes, dia);
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


	public int getCpf() {
		return this.cpf;
		
	}

	//ver como imprimir apenas a data de nascimento
	public Calendar getDataNascimento() {
		return this.dataNascimento;
		
	}


	public String getNomeCompleto() {
		return this.nomeCompleto;
		
	}

	public void cadastrarPessoa() {

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
