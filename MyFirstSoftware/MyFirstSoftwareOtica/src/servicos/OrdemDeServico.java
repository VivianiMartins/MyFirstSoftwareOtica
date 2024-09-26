package servicos;

import java.util.Calendar;

public class OrdemDeServico {

	static private int numero;

	private String status;

	private float valorTotal;

	private String formaPagamento;

	private String obrservacoes;

	private Calendar dataVenda;

	// tem que ver como fazer isso:
	//private Cliente cliente;

	private Receita receita;

	// tem que ver como fazer isso:
	//private Unidade loja;

	// tem que ver como fazer isso:
	//private Produto produtos[];
	
	//após uma nova ordem de serviço ser criada este método deve ser chamado:
	public void setNumero() {
		numero = numero + 1;
	}

	public void criarOrdem() {

	}

	public void editarOrdem() {

	}

	public void pesquisarOrdem() {

	}

	public void excluirOrdem() {

	}

}
