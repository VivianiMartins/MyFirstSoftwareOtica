package ordemDeServico.model;

//Serialização será usada aqui
import java.io.Serializable;

import estoque.model.Produto;
import pessoas.model.Cliente;
import pessoas.model.Funcionario;
import unidades.model.Unidade;

public class OrdemDeServico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	static private int numero;
	private String status;
	private float valorTotal;
	private String formaPagamento;
	private String observacoes;
	private String dataVenda;
	
	//Associação - composição:
	private Cliente cliente;
	//Associação - agregação:
	private Receita receita;
	//Associação - composição:
	private Unidade unidade;
	//Associação - composição:
	private Produto produtos;
	//Associação - composição:
	private Funcionario funcionario;
	
	public OrdemDeServico(String status, float valorTotal, float desconto, String formaPagamento, String observacoes, 
			int diaVenda, int mesVenda, int anoVenda, Cliente cliente, Receita receita ,Unidade unidade, Produto produtos, Funcionario funcionario) {
		this.setNumero();
		this.setStatus(status);
		this.setValorTotal(valorTotal, desconto);	
		this.setFormaPagamento(formaPagamento);
		this.setObservacoes(observacoes);
		this.setDataVenda(diaVenda, mesVenda, anoVenda);
		this.setCliente(cliente);
		this.setReceita(receita);
		this.setUnidade(unidade);
		this.setProduto(produtos);
		this.setFuncionario(funcionario);
	}
	
	public OrdemDeServico(String status, float valorTotal, float desconto, String formaPagamento, String observacoes, 
			int diaVenda, int mesVenda, int anoVenda, Cliente cliente ,Unidade unidade, Produto produtos, Funcionario funcionario) {
		this.setNumero();
		this.setStatus(status);
		this.setValorTotal(valorTotal, desconto);
		this.setFormaPagamento(formaPagamento);
		this.setObservacoes(observacoes);
		this.setDataVenda(diaVenda, mesVenda, anoVenda);
		this.setCliente(cliente);
		this.setUnidade(unidade);
		this.setProduto(produtos);
		this.setFuncionario(funcionario);
	}

	//após uma nova ordem de serviço ser criada este método deve ser chamado:
	public void setNumero() {
		numero = numero + 1;
	}
	
	private void setStatus(String status){
		this.status = status;
	}
	
	private void setValorTotal(float valorTotal, float desconto) {
		this.valorTotal = valorTotal-desconto;
	}
	
	private void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	private void setObservacoes(String observacoes){
		if(observacoes == null)
			this.observacoes = "Sem obsevações";
		else
			this.observacoes = observacoes;
	}
	
	private void setDataVenda(int diaVenda, int mesVenda, int anoVenda) {
		String data;
		if(diaVenda <= 0 && mesVenda <= 0 && anoVenda <= 0)
			data = "00/00/0000";
		else
			data = diaVenda + "/" + mesVenda + "/" + anoVenda;
		
		this.dataVenda = data;
	}
	
	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	private void setReceita(Receita receita) {
		this.receita = receita;
	}
	
	private void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	private void setProduto(Produto produtos) {
		this.produtos = produtos;
	}
	
	private void setFuncionario(Funcionario funcionario){
		this.funcionario = funcionario;
	}
	
	public int getNumero() {
		return  numero;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public float getValorTotal() {
		return this.valorTotal;
	}
	
	public String getFormaPagamento() {
		return this.formaPagamento;
	}
	
	public String getObservacoes(){
		return this.observacoes;
	}
	
	public String getDataVenda() {
		return this.dataVenda;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Receita getReceita() {
		return this.receita;
	}
	
	public Unidade getUnidade() {
		return this.unidade;
	}
	
	public Produto getProduto() {
		return this.produtos;
	}
	
	public Funcionario getFuncionario(){
		return this.funcionario;
	}

	public void cadastrarOrdem() {

	}

	public void editarOrdem() {

	}

	public void pesquisarOrdem() {

	}

	public void excluirOrdem() {

	}
	
	public String toString() {
		String texto = "\nNumero: " + this.getNumero() + "\nStatus: " + this.getStatus() +
				"\nValor Total: " + this.getValorTotal() + "\nForma de pagamento: " +
				getFormaPagamento() + "\nObservações: " + this.getObservacoes() +
				"\nData:" + this.getDataVenda() + "\nCliente: " + this.getCliente() +  
				  "\nReceita: " + this.getReceita() + "\nLoja: " + getUnidade() +
				  "\nProdutos:" + this.getProduto() + "\nVendedor: " + this.getFuncionario() +  
				  "\nReceita: " + this.getReceita() + "\nLoja: " + getUnidade();
		return texto;
	}
}
