package pessoas.model;

public class PessoaExcecao extends Exception {
	static String texto;
	public PessoaExcecao (String nomeCompleto, long cpf, int telefone){ 
		super("Campo(s) obrigatório(s):");
		setTexto(nomeCompleto, cpf, telefone);
		toString();
	}
	
	void setTexto(String nomeCompleto, long cpf, int telefone) {
		if(nomeCompleto == null) {
			texto = texto + "\nNome.";
		}
		if(cpf <=0) {
			texto = texto + "\nCPF.";
		}
		if(telefone <=0) {
			texto = texto + "\nCPF.";
		}	
	}
	
	public String toString() {
		return texto;
	}
	
	
}
