package pessoas.model;

import java.util.Calendar;

public abstract class Pessoa{

	private String nomeCompleto;
	private Calendar dataNascimento;
	private long cpf;
	private String endereco;
	private int telefone;
	private String tipo;
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, String endereco, int telefone, String tipo) throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento( dia, mes, ano);
			this.setCpf(cpf);
			this.setEndereco(endereco);
			this.setTelefone(telefone);
			this.setTipo(tipo);
		} else throw new PessoaExcecao(nomeCompleto, cpf, telefone);
		
	}
	
	public Pessoa(String nomeCompleto, long cpf, String endereco, int telefone, String tipo) throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento(00, 00, 0000);
			this.setCpf(cpf);
			this.setEndereco(endereco);
			this.setTelefone(telefone);
			this.setTipo(tipo);
		} else throw new PessoaExcecao(nomeCompleto, cpf, telefone);
	}
	
	
	public Pessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, int telefone, String tipo)  throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento(dia, mes, ano);
			this.setCpf(cpf);
			this.setEndereco("sem endereco registrado");
			this.setTelefone(telefone);
			this.setTipo(tipo);
		} else throw new PessoaExcecao(nomeCompleto, cpf, telefone);
	}
	
	public Pessoa(String nomeCompleto, long cpf, int telefone, String tipo) throws PessoaExcecao{
		if(nomeCompleto != null && cpf > 0 && telefone > 0) {
			this.setNomeCompleto( nomeCompleto);
			this.setDataNascimento(00, 00, 0000);
			this.setCpf(cpf);
			this.setEndereco("sem endereco registrado");
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


	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	private void setCpf(long cpf) {
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


	public long getCpf() {
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
