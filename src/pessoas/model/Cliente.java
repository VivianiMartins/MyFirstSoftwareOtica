package pessoas.model;

public class Cliente extends Pessoa{

	private boolean spc;
	
	public Cliente(String nomeCompleto, int dia, int mes, int ano, long cpf,
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			int telefone, String tipo, boolean spc) throws PessoaExcecao{
		super( nomeCompleto, dia, mes, ano, cpf, enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, telefone, tipo);
		this.setSpc(spc);
	}
	
	public Cliente(String nomeCompleto, int dia, int mes, int ano, int cpf, 
			String enderecoRua, String enderecoNumero, String enderecoComplemento, String enderecoBairro, 
			String enderecoCep, String enderecoCidade, String enderecoEstado,  String enderecoPais,
			int telefone, String tipo) throws PessoaExcecao{
		super( nomeCompleto, dia, mes, ano, cpf, 
				enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, 
				enderecoCep, enderecoCidade, enderecoEstado,  enderecoPais, telefone, tipo);
		this.setSpc(false);
	}
	
	private void setSpc(boolean spc) {
		this.spc = spc;
	}
	
	public boolean getSpc() {
		return this.spc;
	}

	public void criarCliente() {

	}

	public void editarCliente() {

	}

	public void excluirCliente() {

	}

	public void pesquisarCliente() {

	}
	
	public String toString() {
		String texto = super.toString() + 
				"\nSpc: " + this.getSpc() ;
		return texto;
	}
}
