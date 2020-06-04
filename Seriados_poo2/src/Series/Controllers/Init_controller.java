package Series.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Series.Views.Cadastrar_view;
import Series.Views.Exibir_view;

public class Init_controller implements ActionListener{
	
	private Cadastrar_view cadastrar_view;
	private Exibir_view exibir_view;	
	
	public Init_controller() {	
		exibir_view = new Exibir_view();	
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		switch(event.getActionCommand()) {
		
		case "Cadastrar": this.cadastrar();
			break;
			
		case "Exibir": this.exibir();
			break;
		
		default: break;
		}
	}

	public void cadastrar() {	
		cadastrar_view = new Cadastrar_view();
		cadastrar_view.setVisible(true);
	}
	
	public void exibir() {
		Exibir_controller exibir_controller = new Exibir_controller(exibir_view.table);
		exibir_view.setVisible(true);
	}
	
}
