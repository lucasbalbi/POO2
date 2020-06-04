package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Series.Models.Episodio_model;

public class EpisodioDAO {

	public Connection conn;
	
	public EpisodioDAO() throws SQLException {		
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/seriados";
		
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("Conectado com o banco de dados!");	
	}
	
	public List<Episodio_model> listarEpisodios() throws SQLException {
		
		List<Episodio_model> eps = new ArrayList<>();
		
		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM episodios");		
		
		while(resultSet.next()) {
			Episodio_model tempEp = new Episodio_model(
					resultSet.getString("nome"),
					resultSet.getBoolean("assistido"),
					resultSet.getInt("temporada"),
					resultSet.getInt("ano"),				
					resultSet.getInt("nota")
					);
			eps.add(tempEp);
		}
		stmt.close();
		return eps;
	}

}
