package ordemDeServico.model;

import java.io.Serializable;

import pessoas.model.Cliente;

public class Receita implements Serializable{

	private String nomeMedico;
	private String dataReceita;
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
	private float distanciaPupilarEsquerdo;

	public Receita(String nomeMedico, int dia, int mes, int ano, Cliente paciente, float grauLongeDireitoEsferico,
	float grauLongeDireitoCilindrico, float eixoDireito, float grauDireitoAdicao, float grauLongeEsquerdoEsferico,
	float grauLongeEsquerdoCilindrico, float eixoEsquerdo, float grauEsquerdoAdicao, float distanciaPupilarDireito,
	float distanciaPupilarEsquerdo) {
		this.setNomeMedico(nomeMedico);
		this.setDataReceita(dia, mes, ano);
		this.setPaciente(paciente);
		this.setGrauLongeDireitoEsferico(grauLongeDireitoEsferico);
		this.setGrauLongeDireitoCilindrico(grauLongeDireitoCilindrico);
		this.setEixoDireito(eixoDireito);
		this.setGrauDireitoAdicao(grauDireitoAdicao);
		this.setGrauLongeEsquerdoEsferico(grauLongeEsquerdoEsferico);
		this.setGrauLongeEsquerdoCilindrico(grauLongeEsquerdoCilindrico);
		this.setEixoEsquerdo(eixoEsquerdo);
		this.setGrauEsquerdoAdicao(grauEsquerdoAdicao);
		this.setDistanciaPupilarDireito(distanciaPupilarDireito);
		this.setDistanciaPupilarEsquerdo(distanciaPupilarEsquerdo);
	}

	private void setNomeMedico(String nomeMedico2) {
		this.nomeMedico = nomeMedico2;	
	}

	private void setDataReceita(int dia, int mes, int ano) {
		String data = dia + "/" + mes + "/" + ano;
		this.dataReceita = data;
	}

	private void setPaciente(Cliente paciente2) {
		this.paciente = paciente2;
	}

	private void setGrauLongeDireitoEsferico(float grauLongeDireitoEsferico2) {
		this.grauLongeDireitoEsferico = grauLongeDireitoEsferico2;
	}

	private void setGrauLongeDireitoCilindrico(float grauLongeDireitoCilindrico2) {
		this.grauLongeDireitoCilindrico = grauLongeDireitoCilindrico2;
	}

	private void setEixoDireito(float eixoDireito2) {
		this.eixoDireito = eixoDireito2;
	}

	private void setGrauDireitoAdicao(float grauDireitoAdicao2) {
		this.grauDireitoAdicao = grauDireitoAdicao2;
	}

	private void setGrauLongeEsquerdoEsferico(float grauLongeEsquerdoEsferico2) {
		this.grauLongeEsquerdoEsferico = grauLongeEsquerdoEsferico2;
	}

	private void setGrauLongeEsquerdoCilindrico(float grauLongeEsquerdoCilindrico2) {
		this.grauLongeEsquerdoCilindrico = grauLongeEsquerdoCilindrico2;
	}

	private void setEixoEsquerdo(float eixoEsquerdo2) {
		this.eixoEsquerdo = eixoEsquerdo2;		
	}

	private void setGrauEsquerdoAdicao(float grauEsquerdoAdicao2) {
		this.grauEsquerdoAdicao = grauEsquerdoAdicao2;
	}

	private void setDistanciaPupilarDireito(float distanciaPupilarDireito2) {
		this.distanciaPupilarDireito = distanciaPupilarDireito2;
	}

	private void setDistanciaPupilarEsquerdo(float distanciaPupilarEsquerdo2) {
		this.distanciaPupilarEsquerdo = distanciaPupilarEsquerdo2;
	}
	
	public String getNomeMedico() {
		return this.nomeMedico;	
	}

	public String getDataReceita() {
		return this.dataReceita;
	}

	public Cliente getPaciente() {
		return this.paciente;
	}

	public float getGrauLongeDireitoEsferico() {
		return this.grauLongeDireitoEsferico;
	}

	public float getGrauLongeDireitoCilindrico() {
		return this.grauLongeDireitoCilindrico;
	}

	public float getEixoDireito() {
		return this.eixoDireito;
	}

	public float getGrauDireitoAdicao() {
		return this.grauDireitoAdicao;
	}

	public float getGrauLongeEsquerdoEsferico() {
		return this.grauLongeEsquerdoEsferico;
	}

	public float getGrauLongeEsquerdoCilindrico() {
		return this.grauLongeEsquerdoCilindrico;
	}

	public float getEixoEsquerdo() {
		return this.eixoEsquerdo;		
	}

	public float getGrauEsquerdoAdicao() {
		return this.grauEsquerdoAdicao;
	}

	public float getDistanciaPupilarDireito() {
		return this.distanciaPupilarDireito;
	}

	public float getDistanciaPupilarEsquerdo() {
		return this.distanciaPupilarEsquerdo;
	}

	public void criarReceita() {

	}

	public void editarReceita() {

	}

	public void excluirReceita() {

	}
	
	public void pesquisarReceita() {

	}
	
	public String toString() {
		String texto = "\nNome do médico: " + this.getNomeMedico() + 
				"\nData da consulta:" + this.getDataReceita() +
				"\nPaciente: " + this.getPaciente() + 
				"\nGrau Longe Direito Esferico: " + this.getGrauLongeDireitoEsferico() +
				"\nGrau Longe Direito Cilindrico: " + this.getGrauLongeDireitoCilindrico() +
				"\nEixo Direito: " + this.getEixoDireito() + 
				"\nGrau Direito Adicao: " + this.getGrauDireitoAdicao() +
				"\nGrau Longe Esquerdo Esferico: " + this.getGrauLongeEsquerdoEsferico() +
				"\nGrau Longe Esquerdo Cilindrico: " + this.getGrauLongeEsquerdoCilindrico()+
				"\nEixo Esquerdo: " + this.getEixoEsquerdo() + 
				"\nGrau Esquerdo Adicao: " + this.getGrauEsquerdoAdicao() +
				"\nDistancia Pupilar Direito " + this.getDistanciaPupilarDireito() + 
				"\nDistancia Pupilar Esquerdo: " + this.getDistanciaPupilarEsquerdo();
		return texto;
	}
	
}
