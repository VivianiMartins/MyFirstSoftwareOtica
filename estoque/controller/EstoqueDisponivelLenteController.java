package estoque.controller;

import estoque.model.Armacao;
import estoque.model.Lente;

public class EstoqueDisponivelLenteController {
	
	public boolean cadastrarArmacao(String tipo, double precoDeCusto, double precoDeVenda, int quantidade, String marca, int cor, String nomeModelo, String codPreco) {
		if(marca != null && marca.length()>0 && cor >0 && nomeModelo !=null && nomeModelo.length()>0 
				&& codPreco != null && codPreco.length()>0 && tipo !=null && precoDeCusto >0 && precoDeVenda >0 && quantidade >0) {
			Armacao armacao = new Armacao(tipo, precoDeCusto, precoDeVenda, quantidade, marca, cor, nomeModelo, codPreco);
			armacao.criarArmacao();
			return true;
		}
		return false;
	}
	
	public boolean cadastrarLente(String tipo, double precoDeCusto, double precoDeVenda, int quantidade, String laboratorio, int grau, String tratamento) {
		if(tipo != null && tipo.length()>0 && tipo !=null && precoDeCusto >0 && precoDeVenda >0 && quantidade >0 && laboratorio != null && grau>0 && tratamento != null) {
			Lente lente = new Lente(tipo, precoDeCusto, precoDeVenda, quantidade, laboratorio, grau, tratamento);
			lente.criarLente();
			return true;
		}
		return false;
	}
}
