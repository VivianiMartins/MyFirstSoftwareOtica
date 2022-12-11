package pessoas.model;

import javax.swing.JOptionPane;

public class FactoryPessoa {

	public Pessoa setPessoa (String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			long telefone, String tipo) {
		return null;
	}

	public Cliente setPessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais, long telefone, String tipo, boolean spc) {
		try {
			return new Cliente(nomeCompleto, dia, mes, ano, (long)cpf, 
					enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
					enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, (long)telefone, tipo, spc);
		}catch (PessoaExcecao e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
	
	public Cliente setPessoa(String nomeCompleto, String DataNascimento, long cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, 
			String enderecoCep, String enderecoCidade, String enderecoEstado, long telefone, String tipo, boolean spc) {
		try {
			return new Cliente(nomeCompleto, DataNascimento, (long)cpf, 
					enderecoRua, enderecoNumero, enderecoComplemento, 
					enderecoCep, enderecoCidade, enderecoEstado, (long)telefone, tipo, spc);
		}catch (PessoaExcecao e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
	
	public Funcionario setPessoa(String nomeCompleto, int dia, int mes, int ano, long cpf,
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			long telefone, int diaContratacao, int mesContratacao, int anoContratacao, 
			 String senha, boolean admin) {
		try {
			return new Funcionario(nomeCompleto, dia, mes, ano, (long)cpf,  
					enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
					enderecoCep, enderecoCidade, enderecoEstado, enderecoPais, (long)telefone, 
					 diaContratacao,  mesContratacao,  anoContratacao,  senha, admin);
		} catch (PessoaExcecao e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
	
}
