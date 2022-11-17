package view;

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

public class TelaEstoqueDisponivelLente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLaboratorio;
	private JTextField textFieldTipo;
	private JTextField textFieldGrau;
	private JTextField textFieldTratamento;
	private JTextField textFieldPrecoDeVenda;
	private JTextField textFieldQuantidadeTotal;
	private JTextField textFieldNomeLoja;
	private JTextField textFieldQuantidadeLenteC;
	private JTextField textFieldTelefone;
	private JTextField textFieldCoresDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoqueDisponivelLente frame = new TelaEstoqueDisponivelLente();
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
	public TelaEstoqueDisponivelLente() {
getContentPane().setBackground(new Color(229, 229, 229));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 800);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(229, 229, 229));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel_2 = new JLabel("Estoque disponível - Armação");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 22));
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblPreoDeVenda = new JLabel("Preço de venda");
		lblPreoDeVenda.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblNomeDaLoja = new JLabel("Nome da loja");
		lblNomeDaLoja.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Roboto", Font.PLAIN, 18));
			
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
		
		JLabel lblEstoqueDisponivelLente = new JLabel("Estoque disponível - Lente");
		lblEstoqueDisponivelLente.setFont(new Font("Roboto", Font.PLAIN, 22));
		
		JLabel lblLaboratorio = new JLabel("Laboratório");
		lblLaboratorio.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldLaboratorio = new JTextField();
		textFieldLaboratorio.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldTipo = new JTextField();
		textFieldTipo.setColumns(10);
		
		JLabel lblGrau = new JLabel("Grau");
		lblGrau.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldGrau = new JTextField();
		textFieldGrau.setColumns(10);
		
		JLabel lblTratamento = new JLabel("Tratamento");
		lblTratamento.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldTratamento = new JTextField();
		textFieldTratamento.setColumns(10);
		
		JLabel lblPreoDeVenda_1 = new JLabel("Preço de venda");
		lblPreoDeVenda_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldPrecoDeVenda = new JTextField();
		textFieldPrecoDeVenda.setColumns(10);
		
		JLabel lblQuantidadeTotal = new JLabel("Quantidade total");
		lblQuantidadeTotal.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldQuantidadeTotal = new JTextField();
		textFieldQuantidadeTotal.setColumns(10);
		
		JLabel lblLenteDeContato = new JLabel("Lente de contato");
		lblLenteDeContato.setFont(new Font("Roboto", Font.PLAIN, 22));
		
		JLabel lblNomeDaLoja_1 = new JLabel("Nome da loja");
		lblNomeDaLoja_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldNomeLoja = new JTextField();
		textFieldNomeLoja.setColumns(10);
		
		JLabel lblNomeDaLoja_1_1 = new JLabel("Quantidade");
		lblNomeDaLoja_1_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldQuantidadeLenteC = new JTextField();
		textFieldQuantidadeLenteC.setColumns(10);
		
		JLabel lblNomeDaLoja_1_2 = new JLabel("Telefone");
		lblNomeDaLoja_1_2.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		
		textFieldCoresDisp = new JTextField();
		textFieldCoresDisp.setColumns(10);
		
		JLabel lblNomeDaLoja_1_1_1 = new JLabel("Cores disponiveis");
		lblNomeDaLoja_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JButton btnPesquisarLente = new JButton("Pesquisar");
		btnPesquisarLente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnPesquisarLente.setForeground(Color.WHITE);
		btnPesquisarLente.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnPesquisarLente.setContentAreaFilled(false);
		btnPesquisarLente.setBackground(new Color(200, 50, 43));
		btnPesquisarLente.setOpaque(true);
		
		JButton btnCancelarLente = new JButton("Cancelar");
		btnCancelarLente.setForeground(Color.WHITE);
		btnCancelarLente.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnCancelarLente.setContentAreaFilled(false);
		btnCancelarLente.setBackground(new Color(200, 50, 43));
		btnCancelarLente.setOpaque(true);
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomeDaLoja_1_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNomeLoja, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomeDaLoja_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLenteDeContato, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldQuantidadeTotal, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldTratamento, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTratamento, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblLaboratorio)
							.addComponent(lblEstoqueDisponivelLente)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
									.addComponent(textFieldTipo, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
								.addGap(34)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addComponent(textFieldGrau, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblGrau, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPreoDeVenda_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
									.addComponent(textFieldPrecoDeVenda, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNomeDaLoja_1_2, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
									.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNomeDaLoja_1_1_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnCancelarLente, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldCoresDisp, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))))
							.addComponent(textFieldLaboratorio))
						.addComponent(lblQuantidadeTotal, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnPesquisarLente, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addComponent(textFieldQuantidadeLenteC, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(144, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(40)
					.addComponent(lblEstoqueDisponivelLente)
					.addGap(18)
					.addComponent(lblLaboratorio)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldLaboratorio, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGrau, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldTipo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldGrau, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTratamento, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreoDeVenda_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTratamento, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPrecoDeVenda, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblQuantidadeTotal, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldQuantidadeTotal, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lblLenteDeContato, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeDaLoja_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomeDaLoja_1_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNomeLoja, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeDaLoja_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomeDaLoja_1_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldQuantidadeLenteC, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCoresDisp, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPesquisarLente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelarLente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(54))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPesquisa.class.getResource("/imagens/oie_44xkGYDqzvRI.png")));
		
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
