package servicos.model;

import java.util.Calendar;

import estoque.model.Produto;
import pessoas.model.Cliente;
import unidades.model.Unidade;

public class OrdemDeServico {

	static private int numero;

	private String status;

	private float valorTotal;

	private String formaPagamento;

	private String obrservacoes;

	private Calendar dataVenda;

	//Associação - composição ou agregação:
	private Cliente cliente;
	
	//Associação - composição ou agregação:
	private Receita receita;

	//Associação - composição ou agregação:
	private Unidade loja;

	//Associação - composição ou agregação:
	private Produto produtos[];
	
	//após uma nova ordem de serviço ser criada este método deve ser chamado:
	public void setNumero() {
		numero = numero + 1;
	}
	
	//add cliente, get cliente
	//get unidade
	//add receita
	//get produto

	public void criarOrdem() {

	}

	public void editarOrdem() {

	}

	public void pesquisarOrdem() {

	}

	public void excluirOrdem() {

	}

}
