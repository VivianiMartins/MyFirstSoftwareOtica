package estoque.model;

import java.io.Serializable;

public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tipo;
	private double precoDeCusto;
	private double precoDeVenda;
	private int quantidade;
	
	public Produto() {
		this.setTipo(null);
		this.setPrecoDeCusto(0);
		this.setPrecoDeVenda(0);
		this.setQuantidade(0);
	}
	
	public Produto(String tipo, double precoDeCusto, double precoDeVenda, int quantidade) {
		this.setPrecoDeCusto(precoDeCusto);
		this.setTipo(tipo);
		this.setPrecoDeVenda(precoDeVenda);
		this.setQuantidade(quantidade);
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPrecoDeCusto() {
		return (float) precoDeCusto;
	}

	public void setPrecoDeCusto(double precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public float getPrecoDeVenda() {
		return (float) precoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void criarProduto() {

	}

	public void editarProduto() {

	}

	public void pesquisarProduto() {

	}

	public void excluirProduto() {

	}
	
	public String toString() {
		String texto = "\nTipo: " + this.getTipo() + "\nPreco de custo: "+this.getPrecoDeCusto() + 
				"\nPreco de venda: "+this.getPrecoDeVenda()
		+ "\nQuantidade: "+this.getQuantidade();
		return texto;
	}
}
