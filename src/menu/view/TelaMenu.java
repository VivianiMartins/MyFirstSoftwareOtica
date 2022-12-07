package menu.view;

	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.GroupLayout;
	import javax.swing.GroupLayout.Alignment;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import java.awt.Color;
	import javax.swing.JButton;
	import javax.swing.SwingConstants;
	import java.awt.Font;
	import java.awt.Toolkit;
	import menu.controller.MenuController;
	
import javax.swing.LayoutStyle.ComponentPlacement;
	

	
public class TelaMenu extends JFrame{
	private JButton btnPesquisarTela;
	private JButton btnNovoCliente;
	private JButton btnNovaOrdem;
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
					MenuController controles = new MenuController(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaMenu.class.getResource("/imagens/icon.png")));
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
			
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(122)
					.addGap(97))
		);
		gl_panel_2.setVerticalGroup(
		gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(224)
					.addContainerGap(241, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
			
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TelaMenu.class.getResource("/imagens/logo.png")));
			
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
					.addComponent(btnPesquisarTela, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)						.addGap(18)
				.addComponent(btnNovoCliente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(btnNovaOrdem, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				.addGap(478))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
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
}


