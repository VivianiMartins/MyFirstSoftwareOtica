package menu.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import menu.view.TelaMenu;
import ordemDeServico.view.TelaOrdemDeServico;
import ordemDeServico.view.TelaOrdemDeServico;
import pesquisa.view.TelaPesquisa;
import pessoas.view.TelaNovoCliente;

public class MenuController implements ActionListener {
	private TelaMenu menu;
	
	public MenuController(TelaMenu menu) {
		this.menu = menu;
		menu.getBtnPesquisarTela().addActionListener(e -> abrirTelaPesquisar());
		menu.getBtnNovoCliente().addActionListener(e -> abrirTelaNovoCliente());
		menu.getBtnNovaOrdem().addActionListener(e -> abrirTelaOrdemDeServico());
	}
	
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	
