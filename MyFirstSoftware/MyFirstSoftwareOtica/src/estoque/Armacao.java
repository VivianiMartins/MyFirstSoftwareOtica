package estoque;

public class Armacao extends Produto{
	
	private String marca;
	private int cor;
	private String nomeModelo;
	private String codPreco;
	
	public Armacao (){
		this.setMarca(null);
		this.setCor(0);
		this.setNomeModelo(null);
		this.setCodPreco(null);
	}
	
	public Armacao(String tipo, double precoDeCusto, double precoDeVenda, int quantidade, String marca, int cor, String nomeModelo, String codPreco) {
		super(tipo, precoDeCusto, precoDeVenda, quantidade);
		this.setMarca(marca);
		this.setCor(cor);
		this.setNomeModelo(nomeModelo);
		this.setCodPreco(codPreco);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public String getNomeModelo() {
		return nomeModelo;
	}

	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}

	public String getCodPreco() {
		return codPreco;
	}

	public void setCodPreco(String codPreco) {
		this.codPreco = codPreco;
	}

	public void criarArmacao() {

	}

	public void editarArmacao() {

	}
	public void pesquisarArmacao() {

	}
	
	public String toString() {
		String texto = "\nMarca: "+this.getMarca()+"\nCor: "+this.getCor()+"\nNome do modelo: "+this.getNomeModelo()
		+"\nCodigo preco: "+this.getCodPreco();
		return texto;
	}
}
