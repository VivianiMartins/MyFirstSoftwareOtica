package aplicacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1440, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setBackground(new Color(200, 50, 43));
		panel.setForeground(new Color(200, 50, 43));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(406, 190, 684, 565);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(200, 50, 43));
		btnNewButton.setContentAreaFilled(false);
	    btnNewButton.setOpaque(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(261, 451, 133, 41);
		panel_1.add(btnNewButton);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(112, 23, 464, 192);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\leand\\Downloads\\logo_transparente.png"));

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(229, 229, 229));
		textField_1.setBounds(112, 379, 434, 42);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setBounds(112, 339, 147, 29);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.PLAIN, 24));

		textField = new JTextField();
		textField.setBackground(new Color(229, 229, 229));
		textField.setBounds(112, 270, 434, 42);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(112, 230, 147, 29);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 24));
	}
}