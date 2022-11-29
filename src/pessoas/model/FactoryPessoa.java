package pessoas.model;

import javax.swing.JOptionPane;

public class FactoryPessoa {

	public Pessoa getPessoa (String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			int telefone, String tipo) {
		return null;
	}

	public Cliente getPessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais, int telefone, String tipo, boolean spc) {
		try {
			return new Cliente(nomeCompleto, dia, mes, ano, cpf, 
					enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
					enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, telefone, tipo, spc);
		}catch (PessoaExcecao e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
	
	public Funcionario getPessoa(String nomeCompleto, int dia, int mes, int ano, int cpf,
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			 int telefone, int diaContratacao, int mesContratacao, int anoContratacao, 
			 String senha, String login, boolean admin) {
		try {
			return new Funcionario(nomeCompleto, dia, mes, ano,  cpf,  
					enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
					enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais,  telefone, 
					 diaContratacao,  mesContratacao,  anoContratacao,  senha,  login, admin);
		} catch (PessoaExcecao e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
	
}
