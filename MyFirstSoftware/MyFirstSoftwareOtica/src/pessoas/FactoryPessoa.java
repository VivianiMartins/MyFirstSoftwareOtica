package pessoas;

public class FactoryPessoa {

	public Pessoa getPessoa (String nomeCompleto, int dia, int mes, int ano, long cpf, String endereco, int telefone, String tipo) {
		return null;
		/*if (tipo.equals("cliente"))
		 	retorno= new Cliente(nomeCompleto, dia, mes, ano, cpf, endereco, telefone, tipo, spc);*/
		
		/*if (tipo.equals("funcionario"))
			retorno= new Funcionario(nomeCompleto, dia, mes, ano,  cpf,  endereco,  telefone, 
					 diaContratacao,  mesContratacao,  anoContratacao,  senha,  login, admin);*/
		
		//return retorno;
	}

	public Cliente getPessoa(String nomeCompleto, int dia, int mes, int ano, long cpf, String endereco, int telefone, String tipo, boolean spc) {
		return new Cliente(nomeCompleto, dia, mes, ano, cpf, endereco, telefone, tipo, spc);
	}
	
	public Funcionario getPessoa(String nomeCompleto, int dia, int mes, int ano, int cpf, String endereco, int telefone, 
			int diaContratacao, int mesContratacao, int anoContratacao, String senha, String login, boolean admin) {
		return new Funcionario(nomeCompleto, dia, mes, ano,  cpf,  endereco,  telefone, 
				 diaContratacao,  mesContratacao,  anoContratacao,  senha,  login, admin);
	}
	
}
