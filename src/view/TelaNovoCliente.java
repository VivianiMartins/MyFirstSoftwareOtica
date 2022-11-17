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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class TelaNovoCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeCompleto;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNasc;
	private JTextField textFieldTelefone;
	private JTextField textFieldTelefone2;
	private JTextField textFieldEndereco;
	private JTextField textFieldNumeroEnd;
	private JTextField textFieldComplemento;
	private JTextField textFieldCEP;
	private JTextField textFieldCidade;
	private JTextField textFieldEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovoCliente frame = new TelaNovoCliente();
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
	public TelaNovoCliente() {
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
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1487, Short.MAX_VALUE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		
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
		
		textFieldNomeCompleto = new JTextField();
		textFieldNomeCompleto.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldNomeCompleto.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldCPF.setColumns(10);
		
		textFieldDataNasc = new JTextField();
		textFieldDataNasc.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldDataNasc.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldTelefone.setColumns(10);
		
		textFieldTelefone2 = new JTextField();
		textFieldTelefone2.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldTelefone2.setColumns(10);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldEndereco.setColumns(10);
		
		textFieldNumeroEnd = new JTextField();
		textFieldNumeroEnd.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldNumeroEnd.setColumns(10);
		
		textFieldComplemento = new JTextField();
		textFieldComplemento.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldComplemento.setColumns(10);
		
		textFieldCEP = new JTextField();
		textFieldCEP.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldCEP.setColumns(10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldCidade.setColumns(10);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setFont(new Font("Roboto", Font.PLAIN, 11));
		textFieldEstado.setColumns(10);
		
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
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblEstado, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addGap(590))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textFieldDataNasc, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textFieldCPF, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnVerOrdensDe)
							.addGap(93)
							.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(btnVoltar, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
							.addGap(49))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lbDataNasc, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbCPF, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbNomeCompleto, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(519, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(textFieldNomeCompleto, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lbTelefone, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbEndereco, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldEndereco, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lbTelefone2, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addComponent(textFieldTelefone2, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
												.addComponent(textFieldNumeroEnd, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))))))
							.addGap(23))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblComplemento, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addGap(50))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(textFieldComplemento, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
									.addGap(49)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCep, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldCEP, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
							.addGap(49)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCidade, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldCidade, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
							.addGap(23))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblConsultaNoSpc, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnSPCSim)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(rdbtnSPCNao))
								.addComponent(textFieldEstado, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(397, Short.MAX_VALUE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(23)
					.addComponent(lbNomeCompleto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldNomeCompleto, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lbCPF, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldCPF, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lbDataNasc, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldDataNasc, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbTelefone, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbTelefone2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldTelefone2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbEndereco, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNumeroEnd, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldEndereco, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblComplemento, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCidade, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldComplemento, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textFieldCEP, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(textFieldCidade, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
					.addGap(18)
					.addComponent(lblEstado, GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldEstado, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConsultaNoSpc, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnSPCSim)
						.addComponent(rdbtnSPCNao))
					.addGap(124)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnVerOrdensDe, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(66))
		);
		panel_1.setLayout(gl_panel_1);
		
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
					.addComponent(lblNewLabel)
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

