package estoque.view;

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
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import pesquisa.view.TelaPesquisa;

public class TelaEstoqueDisponivelArmacao extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldModelo;
	private JTextField textFieldMarca;
	private JTextField textFieldPrecoDeVenda;
	private JTextField textFieldNomeDaLoja;
	private JTextField textFieldQuant;
	private JTextField textFieldTelefone;
	private JTextField textFieldCoresDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoqueDisponivelArmacao frame = new TelaEstoqueDisponivelArmacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaEstoqueDisponivelArmacao() {
getContentPane().setBackground(new Color(229, 229, 229));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 800);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(229, 229, 229));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
					.addGap(7))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel_2 = new JLabel("Estoque disponível - Armação");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 22));
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldModelo = new JTextField();
		textFieldModelo.setColumns(10);
		
		textFieldMarca = new JTextField();
		textFieldMarca.setColumns(10);
		
		JLabel lblPreoDeVenda = new JLabel("Preço de venda");
		lblPreoDeVenda.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldPrecoDeVenda = new JTextField();
		textFieldPrecoDeVenda.setColumns(10);
		
		JLabel lblNomeDaLoja = new JLabel("Nome da loja");
		lblNomeDaLoja.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldNomeDaLoja = new JTextField();
		textFieldNomeDaLoja.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldQuant = new JTextField();
		textFieldQuant.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldCoresDisp = new JTextField();
		textFieldCoresDisp.setColumns(10);
		
		JLabel lblCoresDisponveis = new JLabel("Cores disponíveis");
		lblCoresDisponveis.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JButton btnPesquisarArmacao = new JButton("Pesquisar");
		btnPesquisarArmacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
		btnPesquisarArmacao.setForeground(Color.WHITE);
		btnPesquisarArmacao.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisarArmacao.setContentAreaFilled(false);
		btnPesquisarArmacao.setBackground(new Color(200, 50, 43));
		btnPesquisarArmacao.setOpaque(true);
		
		JButton btnCancelarArmacao = new JButton("Cancelar");
		btnCancelarArmacao.setForeground(Color.WHITE);
		btnCancelarArmacao.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnCancelarArmacao.setContentAreaFilled(false);
		btnCancelarArmacao.setBackground(new Color(200, 50, 43));
		btnCancelarArmacao.setOpaque(true);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textFieldPrecoDeVenda, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
							.addGap(328))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblPreoDeVenda, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(494))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblModelo, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
											.addGap(221))
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addComponent(textFieldModelo, Alignment.LEADING)
											.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(textFieldNomeDaLoja, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblNomeDaLoja, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
											.addGap(166))
										.addComponent(textFieldQuant, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblQuantidade, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
											.addGap(166)))
									.addGap(39))
								.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
									.addGap(170)
									.addComponent(btnPesquisarArmacao, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblTelefone, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
									.addGap(166))
								.addComponent(textFieldTelefone, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
								.addComponent(textFieldMarca, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblMarca, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
									.addGap(221))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblCoresDisponveis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(149))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addGap(137)
										.addComponent(btnCancelarArmacao, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
									.addComponent(textFieldCoresDisp, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))))
					.addGap(93))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel_2)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModelo)
						.addComponent(lblMarca, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldModelo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldMarca, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPreoDeVenda, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldPrecoDeVenda, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomeDaLoja, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNomeDaLoja, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidade, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCoresDisponveis, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldQuant, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCoresDisp, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelarArmacao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisarArmacao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lbNomeCompleto = new JLabel("Nome completo*");
		lbNomeCompleto.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lbCPF = new JLabel("CPF*");
		lbCPF.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lbDataNasc = new JLabel("Data de nascimento");
		lbDataNasc.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lbTelefone = new JLabel("Telefone*");
		lbTelefone.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lbEndereco = new JLabel("Endereço");
		lbEndereco.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lbTelefone2 = new JLabel("Telefone 2*");
		lbTelefone2.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblNumero = new JLabel("Número");
		lblNumero.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblConsultaNoSpc = new JLabel("Consulta no SPC?");
		lblConsultaNoSpc.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JRadioButton rdbtnSPCSim = new JRadioButton("Sim");
		rdbtnSPCSim.setBackground(new Color(229, 229, 229));
		rdbtnSPCSim.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JRadioButton rdbtnSPCNao = new JRadioButton("Não");
		rdbtnSPCNao.setBackground(new Color(229, 229, 229));
		rdbtnSPCNao.setFont(new Font("Roboto", Font.PLAIN, 11));
		
		JButton btnVerOrdensDe = new JButton("Ver ordens de serviço");
		btnVerOrdensDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerOrdensDe.setForeground(Color.WHITE);
		btnVerOrdensDe.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnVerOrdensDe.setContentAreaFilled(false);
		btnVerOrdensDe.setBackground(new Color(122, 122, 122));
		btnVerOrdensDe.setOpaque(true);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnEditar.setForeground(Color.WHITE);
		btnEditar.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnEditar.setContentAreaFilled(false);
		btnEditar.setBackground(new Color(200, 50, 43));
		btnEditar.setOpaque(true);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBackground(new Color(200, 50, 43));
		btnVoltar.setOpaque(true);
		
		JTextArea txtrPesquisarclientearmaolenteOrdem = new JTextArea();
		txtrPesquisarclientearmaolenteOrdem.setEditable(false);
		txtrPesquisarclientearmaolenteOrdem.setForeground(new Color(0, 0, 0));
		txtrPesquisarclientearmaolenteOrdem.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtrPesquisarclientearmaolenteOrdem.setLineWrap(true);
		txtrPesquisarclientearmaolenteOrdem.setBackground(new Color(241, 239, 239));
		txtrPesquisarclientearmaolenteOrdem.setText("Pesquisar (cliente/armação/lente/ordem de \r\n                               serviço)");
		
		JLabel lblNewLabel_1 = new JLabel("Procurar pelo código/cpf");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1_1 = new JLabel("Procurar pelo nome/laboratório");
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setForeground(Color.WHITE);
		btnPesquisar.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setOpaque(true);
		btnPesquisar.setBackground(new Color(200, 50, 43));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPesquisa.class.getResource("/imagens/logo.png")));
		
		JButton btnPesquisarTela = new JButton("Pesquisar");
		btnPesquisarTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnPesquisarTela.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisarTela.setForeground(Color.WHITE);
		btnPesquisarTela.setBackground(new Color(200, 50, 43));
		btnPesquisarTela.setContentAreaFilled(false);
	    btnPesquisarTela.setOpaque(true);
		
		JButton btnNovoCliente = new JButton("Novo cliente");
		btnNovoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovoCliente.setForeground(Color.WHITE);
		btnNovoCliente.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnNovoCliente.setBackground(new Color(200, 50, 43));
		btnNovoCliente.setContentAreaFilled(false);
	    btnNovoCliente.setOpaque(true);
		
		JButton btnNovaOrdem = new JButton("Nova ordem");
		btnNovaOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPesquisarTela, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNovoCliente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNovaOrdem, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(478, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
}
