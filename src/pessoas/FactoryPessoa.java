package pessoas;

public class FactoryPessoa {
	public Pessoa getPessoa (String nomeCompleto, int dia, int mes, int ano, long cpf, String endereco, int telefone, String tipo) {
		Pessoa retorno = null;
		if (tipo.equals("cliente"))
			retorno = new Cliente(tipo, telefone, telefone, telefone, telefone, tipo, telefone);
		
		if (tipo.equals("funcionario"))
			retorno= new Funcionario(tipo, telefone, telefone, telefone, telefone, tipo, telefone, telefone, telefone, telefone, tipo, tipo);
		
		return retorno;
	}
}
