package estoque.model;

public class Lente extends Produto {
	
	private String laboratorio;
	private int grau;
	private String tipo;
	private String tratamento;
	
	public Lente() {
		this.setLaboratorio(null);
		this.setGrau(0);
		this.setTipo(null);
		this.setTratamento(null);
	}
	
	public Lente(String tipo, double precoDeCusto, double precoDeVenda, int quantidade, String laboratorio, int grau, String tratamento) {
		super(tipo, precoDeCusto, precoDeVenda, quantidade);
		this.setLaboratorio(laboratorio);
		this.setGrau(grau);
		this.setTipo(tipo);
		this.setTratamento(tratamento);
	}
	
	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public void criarLente() {

	}

	public void editarLente() {

	}

	public void pesquisarLente() {

	}
	public String toString() {
		String texto = "\nTipo: "+this.getTipo()+"\nPreco de custo: "+this.getPrecoDeCusto()+"\nPreco de venda: "+this.getPrecoDeVenda()
		+"\nQuantidade: "+this.getQuantidade()+ "\nLaboratorio: "+this.getLaboratorio()+"\nGrau: "+this.getGrau()+"\nTratamento: "+this.getTratamento();
		return texto;
	}

}
