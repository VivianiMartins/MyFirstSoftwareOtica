package pessoas.controller;

import javax.swing.JOptionPane;

import menu.view.TelaMenu;
import ordemDeServico.view.TelaOrdemDeServico;
import pesquisa.view.TelaPesquisa;
import pessoas.model.Cliente;
import pessoas.model.FactoryPessoa;
import pessoas.view.TelaNovoCliente;

public class TelaNovoClienteController {
	FactoryPessoa fabricaDePessoas = new FactoryPessoa();
	private Cliente cliente;
	private TelaNovoCliente telaCliente;
	private String NomeCompleto;
	private String CPF;
	private String dataNascimento;
	private String telefone;
	private String enderecoRua;
	private String enderecoNumero;
	private String enderecoComplemento;
	private String enderecoCep;
	private String enderecoCidade;
	private String enderecoEstado;
	private boolean spc;
	
	
	public TelaNovoClienteController(TelaNovoCliente telaCliente) {
		this.telaCliente = telaCliente;
		//menu
		telaCliente.getBtnPesquisarTela().addActionListener(e -> abrirTelaPesquisar());
		telaCliente.getBtnNovoCliente().addActionListener(e -> abrirTelaNovoCliente());
		telaCliente.getBtnNovoCliente().addActionListener(e -> abrirTelaOrdemDeServico());
		//caixas de texto
		telaCliente.addPropertyChangeListener(e ->getTextFieldNomeCompleto());
		telaCliente.addPropertyChangeListener(e ->getTextFieldCPF());
		telaCliente.addPropertyChangeListener(e ->getTextFieldDataNasc());
		telaCliente.addPropertyChangeListener(e ->getTextFieldTelefone());
		telaCliente.addPropertyChangeListener(e ->getTextFieldEndereco());
		telaCliente.addPropertyChangeListener(e ->getTextFieldNumeroEnd());
		telaCliente.addPropertyChangeListener(e ->getTextFieldComplemento());
		telaCliente.addPropertyChangeListener(e ->getTextFieldCEP());
		telaCliente.addPropertyChangeListener(e ->getTextFieldCidade());
		telaCliente.addPropertyChangeListener(e ->getTextFieldEstado());
		telaCliente.addPropertyChangeListener(e ->getBooleanSPC());
		//botoes fim da tela
		telaCliente.getBtnVerOrdensDe().addActionListener(e -> abrirListaOrdemDeServico());
		telaCliente.getBtnSalvar().addActionListener(e -> clienteSalvar());
		telaCliente.getBtnVoltar().addActionListener(e -> abrirTelaMenu());
	}
	
	//menu
	public void abrirTelaPesquisar() {
		TelaPesquisa frame = new TelaPesquisa();
		frame.setVisible(true);
		this.telaCliente.setVisible(false);
	}
	
	public void abrirTelaNovoCliente() {
		TelaNovoCliente frame = new TelaNovoCliente();
		frame.setVisible(true);
		this.telaCliente.setVisible(false);
	}
		
	public void abrirTelaOrdemDeServico() {
		TelaOrdemDeServico frame = new TelaOrdemDeServico();
		frame.setVisible(true);
		this.telaCliente.setVisible(false);
	}
		
	
	//campos de texto
	public void getTextFieldNomeCompleto() {
		this.NomeCompleto = telaCliente.getTextFieldNomeCompleto();
	}
		
	public void getTextFieldCPF() {	
		this.CPF = telaCliente.getTextFieldCPF();
	}

	public void getTextFieldDataNasc() {
		this.dataNascimento = telaCliente.getTextFieldDataNasc();
	}
	
	public void getTextFieldTelefone() {
		this.telefone = telaCliente.getTextFieldTelefone();
	}
	
	public void getTextFieldEndereco() {
		this.enderecoRua = telaCliente.getTextFieldEndereco();
	}
	
	public void getTextFieldNumeroEnd() {
		this.enderecoNumero = telaCliente.getTextFieldNumeroEnd();
	}
	
	public void getTextFieldComplemento() {
		this.enderecoComplemento = telaCliente.getTextFieldComplemento();
	}
	
	public void getTextFieldCEP() {
		this.enderecoCep = telaCliente.getTextFieldCEP();
	}
	
	public void getTextFieldCidade() {
		this.enderecoCidade = telaCliente.getTextFieldCidade();
	}
	
	public void getTextFieldEstado() {
		this.enderecoEstado= telaCliente.getTextFieldEstado();
	}
	
	public void getBooleanSPC() {
		if(telaCliente.getRdbtnSPCSim().isSelected()) {
			this.spc = true;
		}else if(telaCliente.getRdbtnSPCNao().isSelected()) {
			this.spc = false;
		}
		
	}
	
	//botoes fim da tela
	public void abrirListaOrdemDeServico() {
		JOptionPane.showMessageDialog(null, 
		        "Função indiponível no momento");
	}
		
	public Cliente clienteSalvar() {
		System.out.println(this.CPF);
		final long cpf = (long)(long)Long.valueOf(this.CPF, 16);
		final long telefone = (long)(long)Long.valueOf(this.telefone, 16);
		this.cliente = (Cliente)fabricaDePessoas.setPessoa(this.NomeCompleto, this.dataNascimento, cpf, this.enderecoRua, this.enderecoNumero, this.enderecoComplemento,
				this.enderecoCep, this.enderecoCidade, this.enderecoEstado, telefone , "Cliente", this.spc);
		System.out.println(this.cliente);
		
		cliente.cadastrarCliente();
		return this.cliente;
	}
		
	public void abrirTelaMenu() {
		int i = JOptionPane.showConfirmDialog(
					null, 
			        "Deseja voltar para o menu?",
			        "Confirme",
			        JOptionPane.OK_CANCEL_OPTION
		        );
		if(i == JOptionPane.YES_OPTION) {
			TelaMenu frame = new TelaMenu();
			frame.setVisible(true);
			this.telaCliente.setVisible(false);
		}	
	}
}
