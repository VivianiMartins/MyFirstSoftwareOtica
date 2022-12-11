package ordemDeServico.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import estoque.model.Armacao;
import estoque.model.Lente;
import estoque.model.Produto;
import estoque.view.TelaEstoqueDisponivelArmacao;
import estoque.view.TelaEstoqueDisponivelLente;
import menu.view.TelaMenu;
import ordemDeServico.model.OrdemDeServico;
import ordemDeServico.model.Receita;
import ordemDeServico.view.TelaOrdemDeServico;
import pesquisa.view.TelaPesquisa;
import pessoas.controller.TelaNovoClienteController;
import pessoas.model.Cliente;
import pessoas.model.Funcionario;
import pessoas.view.TelaNovoCliente;
import serializacao.Serializador;
import unidades.model.Unidade;

public class OrdemDeServicoController implements ActionListener{
	private Cliente cliente;
	private Receita receita;
	private Unidade unidade;
	private Produto produtos;
	private Armacao armacao;
	private Lente lente;
	private Funcionario funcionario;
	private OrdemDeServico novaOdermDeServico;
	private TelaOrdemDeServico ordemDeServico;
	
	private String telefone;
	private String nome;
	private String preco1;
	private String preco2;
	private double valorTotal;
	private String observacoes;
	
	public OrdemDeServicoController(TelaOrdemDeServico ordemDeServico) {
		this.ordemDeServico = ordemDeServico;
		//menu
		ordemDeServico.getBtnPesquisarTela().addActionListener(e -> abrirTelaPesquisar());
		ordemDeServico.getBtnNovoCliente().addActionListener(e -> abrirTelaNovoCliente());
		ordemDeServico.getBtnNovaOrdem().addActionListener(e -> abrirTelaOrdemDeServico());
		
		//tela
		//botões para clientes
		ordemDeServico.getBtnAdicionarNovo().addActionListener(e -> abrirTelaNovoCliente2());
		ordemDeServico.getBtnPesquisar().addActionListener(e -> pesquisarClienteBotao());
		
		//caixas de texto cliente:
		ordemDeServico.addPropertyChangeListener(e ->setTextFieldNomeCompleto(this.nome));
		ordemDeServico.addPropertyChangeListener(e ->setTextFieldTelefone(this.telefone));
		
		//observacoes
		ordemDeServico.addPropertyChangeListener(e ->getTextPaneObservacoes());
		
		//pesuisar armaçao
		ordemDeServico.getBtnPesquisarArmacao().addActionListener(e -> abrirTelaArmacaoDisponivel());
		//caixa de texto do preço da armação
		ordemDeServico.addPropertyChangeListener(e ->setTextFieldPreco(this.preco1));
		
		//pesquisar lente
		ordemDeServico.getBtnPesquisarLente().addActionListener(e -> lente.pesquisarLente());
		
		//caixa de texto do preco da lente
		ordemDeServico.addPropertyChangeListener(e ->setTextFieldPreco2(this.preco2));
			
		
		//adicionar nova receita
		ordemDeServico.getBtnAdicionarReceita().addActionListener(e -> criarNovaReceita());
		
		//avançar quando gera o documento
		ordemDeServico.getBtnAvancar().addActionListener(e -> setOrdemDeServico());
		
		//cancelar
		ordemDeServico.getBtnCancelar().addActionListener(e -> abrirTelaMenu());
		
	}
	
	//menu
	public void abrirTelaPesquisar() {
		TelaPesquisa frame = new TelaPesquisa();
		frame.setVisible(true);
		this.ordemDeServico.setVisible(false);
	}
	
	public void abrirTelaNovoCliente() {
		TelaNovoCliente frame = new TelaNovoCliente();
		frame.setVisible(true);
		this.ordemDeServico.setVisible(false);
	}
	
	public void abrirTelaOrdemDeServico() {
		TelaOrdemDeServico frame = new TelaOrdemDeServico();
		frame.setVisible(true);
		this.ordemDeServico.setVisible(false);
	}
		
	//tela
	//criacao de cliente, ainda incompleto
	public Cliente abrirTelaNovoCliente2() {
		TelaNovoCliente frame = new TelaNovoCliente();
		TelaNovoClienteController t = new TelaNovoClienteController(frame);
		frame.setVisible(true);
		
		this.cliente = t.clienteSalvar();
		
		//caixas de texto cliente:
		this.telefone = String.valueOf(cliente.getTelefone());
		this.nome = cliente.getNomeCompleto();
		return this.cliente;
	}
	
	public Cliente pesquisarClienteBotao() {
		String cpf = JOptionPane.showInputDialog("Insira o cpf: ");
		long CPF =  Long.parseLong(cpf);
		this.cliente  = Cliente.pesquisarCliente(CPF);
		
		//caixas de texto cliente:
		this.telefone = String.valueOf(cliente.getTelefone());
		this.nome = cliente.getNomeCompleto();
		return this.cliente;
	}
	
	//campos de texto cliente
	private void setTextFieldNomeCompleto(String nome2) {
		ordemDeServico.setTextFieldNomeCompleto(nome2);
	}
	
	private void setTextFieldTelefone(String telefone) {
		ordemDeServico.setTextFieldTelefone(telefone);
	}
	
	//observacoes
	public void getTextPaneObservacoes() {
		this.observacoes = ordemDeServico.getTextPaneObservacoes();
	}
	
	//pesquisar armação
	public Armacao abrirTelaArmacaoDisponivel() {
		TelaEstoqueDisponivelArmacao frame = new TelaEstoqueDisponivelArmacao();
		frame.setVisible(true);
		this.armacao = null;
		
		//caixas de texto cliente:
		if(armacao == null) {
			this.preco1 = String.valueOf("0.0");
		}else {
			this.preco1 = String.valueOf(armacao.getPrecoDeVenda());
			this.valorTotal = this.valorTotal + armacao.getPrecoDeVenda();
		}
	
		return this.armacao;
	}
	
	private void setTextFieldPreco(String preco1) {
		ordemDeServico.setTextFieldPreco(preco1);
	}
	
	//pesquisar lente
	public Lente abrirTelaLenteDisponivel() {
		TelaEstoqueDisponivelLente frame = new TelaEstoqueDisponivelLente();
		frame.setVisible(true);
		this.lente = null;
			
		//caixas de texto cliente:
		if(lente == null) {
			this.preco2 = String.valueOf("0.0");
		}else {
			this.preco2 = String.valueOf(lente.getPrecoDeVenda());
			this.valorTotal = this.valorTotal + lente.getPrecoDeVenda();
		}
		
		return this.lente;
	}
	
	private void setTextFieldPreco2(String preco2) {
		ordemDeServico.setTextFieldPreco2(preco2);
	}
	
	//receita(ainda não possui tela, apenas para apresentacao
	public Receita criarNovaReceita() {
		this.receita = new Receita("Dra. Maria", 2, 12, 2022, cliente, 
				(float)3.5, (float)0.5, (float)180.0, (float)0.0, 
				(float)3.5, (float)0.5, (float)180.0, (float)0.0, 
				(float)35.2, (float)35.2);
		System.out.println(receita);
		return this.receita;
	}
	
	//Criando a ordem e a serialização
	public void setOrdemDeServico() {	
		this.novaOdermDeServico = new OrdemDeServico("andamento", this.valorTotal, this.observacoes, 
				this.cliente, this.armacao, this.lente);
		
		if(this.novaOdermDeServico != null && this.cliente != null) {
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Falha ao regitrar");
		}
		
		Serializador s = new Serializador();
		//Leandro criei ess string p gerar o nome do arquivo
		String nomeObj = "Ordem" + novaOdermDeServico.getNumero();
		try { 
			  s.serializar("./" + nomeObj + ".obj " , novaOdermDeServico);
		 }catch (Exception ex){
			  System.err.println("Falha ao serializar! - " + ex.toString());
		 }
		
	}
	
	//cancelar
	public void abrirTelaMenu() {
		int i = JOptionPane.showConfirmDialog(
					null, 
			        "Deseja cancelar?",
			        "Confirme",
			        JOptionPane.OK_CANCEL_OPTION
		        );
		if(i == JOptionPane.YES_OPTION) {
			TelaMenu frame = new TelaMenu();
			frame.setVisible(true);
			this.ordemDeServico.setVisible(false);
		}
	}
	
	//caixas de texto:
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
