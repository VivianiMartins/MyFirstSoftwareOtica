package pessoas;

public class Cliente extends Pessoa{
	private boolean spc;
	
	public Cliente(String nomeCompleto, int dia, int mes, int ano, long cpf, String endereco, int telefone, String tipo, boolean spc) {
		super( nomeCompleto, dia, mes, ano, cpf, endereco, telefone, tipo);
		this.setSpc(spc);
	}
	
	public Cliente(String nomeCompleto, int dia, int mes, int ano, int cpf, String endereco, int telefone, String tipo) {
		super( nomeCompleto, dia, mes, ano, cpf, endereco, telefone, tipo);
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
