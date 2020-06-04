package Series.Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Series.Controllers.Init_controller;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JButton;

public class Init_view extends JFrame {

	private JPanel contentPane;
	private Init_controller handle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Init_view frame = new Init_view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Init_view() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SERIADOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 61, 414, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(72, 194, 108, 23);
		contentPane.add(btnExibir);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(253, 194, 108, 23);
		contentPane.add(btnCadastrar);
		
		handle = new Init_controller();
		
		btnExibir.addActionListener(handle);
		btnCadastrar.addActionListener(handle);	

	}
}
