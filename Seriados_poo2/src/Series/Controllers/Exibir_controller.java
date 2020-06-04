package Series.Controllers;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.EpisodioDAO;
import Series.Models.Episodio_model;

public class Exibir_controller {
	
	private JTable table;
	public String column[] = {"nome", "assistido", "temporada", "ano", "nota"};
	
	public Exibir_controller(JTable table) {
		this.table = table;
		this.getEpisodios();
	}
	
	private void getEpisodios() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for(String columnName : this.column) {
			model.addColumn(columnName);
		}
		
		try {
			EpisodioDAO epDAO = new EpisodioDAO();
			List<Episodio_model> ep = epDAO.listarEpisodios();
			for(Episodio_model listaEp : ep) {
				model.addRow(new Object[] {
						listaEp.getNome(),
						listaEp.getAssistido(),
						listaEp.getTemporada(),
						listaEp.getAno(),
						listaEp.getNota()
				});
			}
			
		} catch (SQLException event) {		
			event.printStackTrace();
		}
		
	}

}
