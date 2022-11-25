package ordemDeServico.model;

import java.util.Calendar;

import pessoas.model.Cliente;

public class Receita {

	private String nomeMedico;

	private Calendar dataReceita;

	//Associação - composição:
	private Cliente paciente;

	private float grauLongeDireitoEsferico;

	private float grauLongeDireitoCilindrico;

	private float eixoDireito;

	private float grauDireitoAdicao;

	private float grauLongeEsquerdoEsferico;

	private float grauLongeEsquerdoCilindrico;

	private float eixoEsquerdo;

	private float grauEsquerdoAdicao;

	private float distanciaPupilarDireito;

	private int distanciaPupilarEsquerdo;
	
	//add cliente, get cliente

	public void criarReceita() {

	}

	public void editarReceita() {

	}

	public void excluirReceita() {

	}

}
