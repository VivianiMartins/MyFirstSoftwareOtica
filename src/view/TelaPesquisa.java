package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JTextField;

public class TelaPesquisa extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPesquisa frame = new TelaPesquisa();
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
	public TelaPesquisa() {
		getContentPane().setBackground(new Color(201, 201, 201));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 800);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(201, 201, 201));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
					.addGap(11))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(241, 239, 239));
		
		JTextArea txtrPesquisarclientearmaolenteOrdem = new JTextArea();
		txtrPesquisarclientearmaolenteOrdem.setEditable(false);
		txtrPesquisarclientearmaolenteOrdem.setForeground(new Color(0, 0, 0));
		txtrPesquisarclientearmaolenteOrdem.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtrPesquisarclientearmaolenteOrdem.setLineWrap(true);
		txtrPesquisarclientearmaolenteOrdem.setBackground(new Color(241, 239, 239));
		txtrPesquisarclientearmaolenteOrdem.setText("Pesquisar (cliente/armação/lente/ordem de\r\n                                  serviço)\r\n");
		
		JLabel lblNewLabel_1 = new JLabel("Procurar pelo código/cpf");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1_1 = new JLabel("Procurar pelo nome/laboratório");
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(77)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
							.addGap(50))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
							.addGap(6))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
							.addGap(50))
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
					.addGap(68))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(185)
					.addComponent(btnPesquisar, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
					.addGap(169))
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(31)
					.addComponent(txtrPesquisarclientearmaolenteOrdem, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addGap(20)
					.addComponent(txtrPesquisarclientearmaolenteOrdem, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(122)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
					.addGap(97))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(224)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(241, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
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
		getContentPane().setLayout(groupLayout);
	}
}
