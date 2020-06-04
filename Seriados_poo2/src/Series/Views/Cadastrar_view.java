package Series.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Series.Controllers.Cadastrar_controller;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Cadastrar_view extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField nota;
	private JTextField temporada;
	private JTextField ano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_view frame = new Cadastrar_view();
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
	public Cadastrar_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("nome");
		lblNome.setBounds(28, 76, 61, 16);
		contentPane.add(lblNome);
		
		JLabel lblNota = new JLabel("nota");
		lblNota.setBounds(28, 140, 61, 16);
		contentPane.add(lblNota);
		
		JLabel lblTemporada = new JLabel("temporada");
		lblTemporada.setBounds(266, 76, 61, 16);
		contentPane.add(lblTemporada);
		
		JLabel lblAno = new JLabel("ano");
		lblAno.setBounds(266, 140, 61, 16);
		contentPane.add(lblAno);
		
		JCheckBox assistido = new JCheckBox("assistido");
		assistido.setBounds(28, 204, 128, 23);
		contentPane.add(assistido);
		
		nome = new JTextField();
		nome.setBounds(70, 74, 86, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		nota = new JTextField();
		nota.setBounds(70, 138, 86, 20);
		contentPane.add(nota);
		nota.setColumns(10);
		
		temporada = new JTextField();
		temporada.setBounds(337, 74, 86, 20);
		contentPane.add(temporada);
		temporada.setColumns(10);
		
		ano = new JTextField();
		ano.setBounds(337, 138, 86, 20);
		contentPane.add(ano);
		ano.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(270, 215, 117, 29);
		contentPane.add(btnCadastrar);
		
		
		Cadastrar_controller handle = new Cadastrar_controller(nome, assistido, temporada, ano, nota);		
		
		JLabel lblNewLabel = new JLabel("Cadastro de Episodio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 434, 14);
		contentPane.add(lblNewLabel);
		
		btnCadastrar.addActionListener(handle);		
		
	}
}
