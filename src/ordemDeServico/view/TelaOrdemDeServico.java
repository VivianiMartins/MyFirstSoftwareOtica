package ordemDeServico.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import ordemDeServico.controller.OrdemDeServicoController;
import pesquisa.view.TelaPesquisa;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import java.awt.Toolkit;

public class TelaOrdemDeServico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeCompleto;
	private JTextField textFieldTelefone;
	private JTextPane textPaneObservacoes;
	private JTextField textFieldPreco;
	private JTextField textFieldPreco2;
	//menu
	private JButton btnPesquisarTela;
	private JButton btnNovoCliente;
	private JButton btnNovaOrdem;
	//botões para clientes
	private JButton btnAdicionarNovo;
	private JButton btnPesquisar;
	//pesuisar armaçao
	private JButton btnPesquisarArmacao;
	//pesquisar lente
	private JButton btnPesquisarLente;
	//adicionar nova receita
	private JButton btnAdicionarReceita;
	//avançar quando gera o documento
	private JButton btnAvancar;
	//cancelar
	private JButton btnCancelar;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOrdemDeServico frame = new TelaOrdemDeServico();
					OrdemDeServicoController controles = new OrdemDeServicoController(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaOrdemDeServico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaOrdemDeServico.class.getResource("/imagens/icon.png")));
		getContentPane().setBackground(new Color(229, 229, 229));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 800);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TelaPesquisa.class.getResource("/imagens/logo.png")));
		
		btnPesquisarTela = new JButton("Pesquisar");
		btnPesquisarTela.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisarTela.setForeground(Color.WHITE);
		btnPesquisarTela.setBackground(new Color(200, 50, 43));
		btnPesquisarTela.setContentAreaFilled(false);
	    btnPesquisarTela.setOpaque(true);
		
		btnNovoCliente = new JButton("Novo cliente");
		btnNovoCliente.setForeground(Color.WHITE);
		btnNovoCliente.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnNovoCliente.setBackground(new Color(200, 50, 43));
		btnNovoCliente.setContentAreaFilled(false);
	    btnNovoCliente.setOpaque(true);
		
		btnNovaOrdem = new JButton("Nova ordem");
		btnNovaOrdem.setForeground(Color.WHITE);
		btnNovaOrdem.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnNovaOrdem.setBackground(new Color(200, 50, 43));
		btnNovaOrdem.setContentAreaFilled(false);
	    btnNovaOrdem.setOpaque(true);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNovoCliente, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
								.addComponent(btnPesquisarTela, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
								.addComponent(btnNovaOrdem, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
							.addGap(63)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnPesquisarTela, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNovoCliente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNovaOrdem, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(478))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(229, 229, 229));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblCliente = new JLabel("Cliente*");
		lblCliente.setFont(new Font("Roboto", Font.PLAIN, 18));

		btnAdicionarNovo = new JButton("Adicionar novo");
		btnAdicionarNovo.setForeground(Color.WHITE);
		btnAdicionarNovo.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnAdicionarNovo.setContentAreaFilled(false);
		btnAdicionarNovo.setBackground(new Color(122, 122, 122));
		btnAdicionarNovo.setOpaque(true);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setForeground(Color.WHITE);
		btnPesquisar.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setBackground(new Color(122, 122, 122));
		btnPesquisar.setOpaque(true);
		
		JLabel lblNomeCompleto = new JLabel("Nome completo");
		lblNomeCompleto.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldNomeCompleto = new JTextField();
		textFieldNomeCompleto.setFont(new Font("Roboto", Font.PLAIN, 18));
		textFieldNomeCompleto.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setFont(new Font("Roboto", Font.PLAIN, 18));
		textFieldTelefone.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observações:");
		lblObservacoes.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblArmacao = new JLabel("Armação:");
		lblArmacao.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		btnPesquisarArmacao = new JButton("Pesquisar");
		btnPesquisarArmacao.setForeground(Color.WHITE);
		btnPesquisarArmacao.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisarArmacao.setContentAreaFilled(false);
		btnPesquisarArmacao.setBackground(new Color(122, 122, 122));
		btnPesquisarArmacao.setOpaque(true);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldPreco = new JTextField();
		textFieldPreco.setFont(new Font("Roboto", Font.PLAIN, 18));
		textFieldPreco.setColumns(10);
		
		JLabel lblLente = new JLabel("Lente:");
		lblLente.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		btnPesquisarLente = new JButton("Pesquisar");
		btnPesquisarLente.setForeground(Color.WHITE);
		btnPesquisarLente.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisarLente.setContentAreaFilled(false);
		btnPesquisarLente.setBackground(new Color(122, 122, 122));
		btnPesquisarLente.setOpaque(true);
		
		textFieldPreco2 = new JTextField();
		textFieldPreco2.setFont(new Font("Roboto", Font.PLAIN, 18));
		textFieldPreco2.setColumns(10);
		
		JLabel lblPreco_1 = new JLabel("Preço");
		lblPreco_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		btnAdicionarReceita = new JButton("Adicionar Receita");
		btnAdicionarReceita.setForeground(Color.WHITE);
		btnAdicionarReceita.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnAdicionarReceita.setContentAreaFilled(false);
		btnAdicionarReceita.setBackground(new Color(200, 50, 43));
		btnAdicionarReceita.setOpaque(true);
		
		btnAvancar = new JButton("Avançar");
		btnAvancar.setForeground(Color.WHITE);
		btnAvancar.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnAvancar.setContentAreaFilled(false);
		btnAvancar.setBackground(new Color(200, 50, 43));
		btnAvancar.setOpaque(true);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBackground(new Color(200, 50, 43));
		btnCancelar.setOpaque(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomeCompleto, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreco_1)
						.addComponent(lblObservacoes, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addGap(453))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAdicionarNovo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(32)
							.addComponent(btnPesquisar, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
							.addGap(298))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnAdicionarReceita, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addGap(78)
							.addComponent(btnAvancar, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addGap(75)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addGap(45))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(textFieldPreco2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblPreco)
									.addGap(193))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblArmacao, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnPesquisarArmacao, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addComponent(textFieldPreco, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblLente)
									.addGap(38)
									.addComponent(btnPesquisarLente, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
							.addGap(472))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textFieldNomeCompleto, Alignment.LEADING)
							.addComponent(scrollPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnAdicionarNovo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNomeCompleto, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldNomeCompleto, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(lblObservacoes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblArmacao, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisarArmacao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldPreco, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLente, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisarLente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblPreco_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldPreco2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdicionarReceita, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAvancar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		textPaneObservacoes = new JTextPane();
		scrollPane_1.setViewportView(textPaneObservacoes);
		textPaneObservacoes.setFont(new Font("Roboto", Font.PLAIN, 18));
		panel_1.setLayout(gl_panel_1);
		getContentPane().setLayout(groupLayout);
	}
	
	public JTextField getTextFieldNomeCompleto() {
		return textFieldNomeCompleto;
	}


	public JTextField getTextFieldTelefone() {
		return textFieldTelefone;
	}
	
	public String getTextPaneObservacoes() {
		return textPaneObservacoes.getText();
	}


	public JTextField getTextFieldPreco() {
		return textFieldPreco;
	}


	public JTextField getTextFieldPreco2() {
		return textFieldPreco2;
	}

	
	public void setTextFieldNomeCompleto(String textFieldNomeCompleto) {
		this.textFieldNomeCompleto.setText(textFieldNomeCompleto);
	}

	public void setTextFieldTelefone(String textFieldTelefone) {
		this.textFieldTelefone.setText(textFieldTelefone);
	}
	
	public void setTextPaneObservacoes(JTextPane textPaneObservacoes) {
		this.textPaneObservacoes = textPaneObservacoes;
	}


	public void setTextFieldPreco(String textFieldPreco) {
		this.textFieldPreco.setText(textFieldPreco);
	}


	public void setTextFieldPreco2(String textField) {
		this.textFieldPreco2.setText(textField);
	}

	public JButton getBtnPesquisarTela() {
		return btnPesquisarTela;
	}

	public void setBtnPesquisarTela(JButton btnPesquisarTela) {
		this.btnPesquisarTela = btnPesquisarTela;
	}


	public JButton getBtnNovoCliente() {
		return btnNovoCliente;
	}


	public void setBtnNovoCliente(JButton btnNovoCliente) {
		this.btnNovoCliente = btnNovoCliente;
	}


	public JButton getBtnNovaOrdem() {
		return btnNovaOrdem;
	}


	public void setBtnNovaOrdem(JButton btnNovaOrdem) {
		this.btnNovaOrdem = btnNovaOrdem;
	}


	public JButton getBtnAdicionarNovo() {
		return btnAdicionarNovo;
	}


	public void setBtnAdicionarNovo(JButton btnAdicionarNovo) {
		this.btnAdicionarNovo = btnAdicionarNovo;
	}


	public JButton getBtnPesquisar() {
		return btnPesquisar;
	}


	public void setBtnPesquisar(JButton btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}


	public JButton getBtnPesquisarArmacao() {
		return btnPesquisarArmacao;
	}


	public void setBtnPesquisarArmacao(JButton btnPesquisarArmacao) {
		this.btnPesquisarArmacao = btnPesquisarArmacao;
	}


	public JButton getBtnPesquisarLente() {
		return btnPesquisarLente;
	}


	public void setBtnPesquisarLente(JButton btnPesquisarLente) {
		this.btnPesquisarLente = btnPesquisarLente;
	}


	public JButton getBtnAdicionarReceita() {
		return btnAdicionarReceita;
	}


	public void setBtnAdicionarReceita(JButton btnAdicionarReceita) {
		this.btnAdicionarReceita = btnAdicionarReceita;
	}


	public JButton getBtnAvancar() {
		return btnAvancar;
	}


	public void setBtnAvancar(JButton btnAvancar) {
		this.btnAvancar = btnAvancar;
	}


	public JButton getBtnCancelar() {
		return btnCancelar;
	}


	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
}