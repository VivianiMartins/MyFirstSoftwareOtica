package unidades.model;

import java.io.Serializable;

public class Unidade implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	private String endereco;
	private int telefone;
	
	public Unidade(String nome, String endereco, int telefone) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}
	
	private void setNome(String nome){
		this.nome = nome;
	}
	
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	private void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public int getTelefone() {
		return this.telefone;
	}

	public void criarLoja() {

	}

	public void editarLoja() {

	}

	public void excluirLoja() {

	}

	public void pesquisarLoja() {

	}
	
	public String toString() {
		String texto = "\nNome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + 
				"\nTelefone: " + this.getTelefone() ;
		return texto;
	}

}
