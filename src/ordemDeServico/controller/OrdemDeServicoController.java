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
import menu.view.TelaMenu;
import ordemDeServico.model.OrdemDeServico;
import ordemDeServico.model.Receita;
import ordemDeServico.view.TelaOrdemDeServico;
import pesquisa.view.TelaPesquisa;
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

	
	public OrdemDeServicoController(TelaOrdemDeServico ordemDeServico) {
		this.ordemDeServico = ordemDeServico;
		//menu
		ordemDeServico.getBtnPesquisarTela().addActionListener(e -> abrirTelaPesquisar());
		ordemDeServico.getBtnNovoCliente().addActionListener(e -> abrirTelaNovoCliente());
		ordemDeServico.getBtnNovaOrdem().addActionListener(e -> abrirTelaOrdemDeServico());
		
		//tela
		//botões para clientes
		ordemDeServico.getBtnAdicionarNovo().addActionListener(e -> abrirTelaNovoCliente());
		ordemDeServico.getBtnPesquisar().addActionListener(e -> pesquisarClienteBotao());
		
		//pesuisar armaçao
		ordemDeServico.getBtnPesquisarArmacao().addActionListener(e -> armacao.pesquisarArmacao());
		//pesquisar lente
		ordemDeServico.getBtnPesquisarLente().addActionListener(e -> lente.pesquisarLente());
		//adicionar nova receita
		ordemDeServico.getBtnAdicionarReceita().addActionListener(e -> criarNovaReceita());
		//avançar quando gera o documento
		ordemDeServico.getBtnAvancar().addActionListener(e -> setOrdemDeServico("Andamento", (double)1.0, (double)0.0, "cartão 5X", "filho de fulana", 
				30, 11, 2022, cliente, receita , unidade, produtos, armacao, lente, funcionario));
		//cancelar
		ordemDeServico.getBtnCancelar().addActionListener(e -> abrirTelaMenu());
		
		//caixas de texto:
		ordemDeServico.getTextFieldNomeCompleto();
		ordemDeServico.getTextFieldTelefone();
		ordemDeServico.getTextFieldPreco();
		ordemDeServico.getTextField();
	}
	
	//menu
	public void abrirTelaPesquisar() {
		TelaPesquisa frame = new TelaPesquisa();
		frame.setVisible(true);
	}
	
	public void abrirTelaNovoCliente() {
		TelaNovoCliente frame = new TelaNovoCliente();
		frame.setVisible(true);
	}
	
	public void abrirTelaOrdemDeServico() {
		TelaOrdemDeServico frame = new TelaOrdemDeServico();
		frame.setVisible(true);
	}
		
	//tela
	//criacao da receita
	public void pesquisarClienteBotao() {
			
		String cpf = JOptionPane.showInputDialog("Insira o cpf: ");
		long CPF =  Long.parseLong(cpf);
		Cliente.pesquisarCliente(CPF);
	}
	
	public Receita criarNovaReceita() {
		receita = new Receita("Dra. Maria", 2, 12, 2022, cliente, 
				(float)3.5, (float)0.5, (float)180.0, (float)0.0, 
				(float)3.5, (float)0.5, (float)180.0, (float)0.0, 
				(float)35.2, (float)35.2);
		System.out.println(receita);
		return receita;
	}
	
	//Criando a ordem e a serialização
	public void setOrdemDeServico(String status, double valorTotal, double desconto, String formaPagamento, String observacoes, 
			int diaVenda, int mesVenda, int anoVenda, Cliente cliente, Receita receita , Unidade unidade, Produto produtos,
			Armacao armacao, Lente lente, Funcionario funcionario) {
		
		this.novaOdermDeServico = new OrdemDeServico(status, valorTotal, desconto, formaPagamento, observacoes, 
				30, 11, 2022, cliente , unidade, produtos, funcionario);
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
		}
		
	}
	
	//caixas de texto:
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
