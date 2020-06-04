package Series.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Series.Models.Episodio_model;

public class Cadastrar_controller implements ActionListener {

	private JTextField nome;
	private JCheckBox assistido;
	private JTextField temporada;
	private JTextField ano;
	private JTextField nota;	
	private List<Episodio_model> listaEp;
	
	public Cadastrar_controller(JTextField nome, JCheckBox assistido, JTextField temporada,	JTextField ano,	JTextField nota) {
		
		this.nome = nome;
		this.assistido = assistido;
		this.temporada = temporada;
		this.ano = ano;
		this.nota = nota;	
		listaEp = new ArrayList<>();	
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		this.cadastrarEpisodio();
	}
	
	public void cadastrarEpisodio() {		
//		Episodio_model ep = new Episodio_model(
//				this.nome.getText(),
//				this.assistido.isSelected(),
//				this.temporada.getText(),
//				this.ano.getText(),
//				this.nota.getText()
//				);
//		
//		listaEp.add(ep);
//		
//		for (int i = 0 ; i < listaEp.size() ; i ++ ) {
//			System.out.println(listaEp.get(i).toString());
//		}		
	}

}