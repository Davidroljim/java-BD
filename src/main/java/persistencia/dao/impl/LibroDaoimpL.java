package persistencia.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import negocio.vo.Genero;
import negocio.vo.Libro;
import persistencia.dao.LibroDAO;

public class LibroDaoimpL implements LibroDAO{

	@Override
	public List<Libro> obtenerDatosLibro() {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:6033/biblioteca","developer","programaciondaw");
			
			String sql = "SELECT * FROM libro ORDER BY titulo;";
			
			Statement sentencia = conexion.createStatement();
			
			ResultSet rs = sentencia.executeQuery(sql);
			
		} catch (SQLException e) {
			System.out.println("Error en la conexion con la BD");
			e.printStackTrace();
		}
		return null;
	}
	
	public void insertarLibros(){
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:6033/biblioteca","developer","programaciondaw");
			
			String sql = "INSERT INTO libro VALUES(" + ";";
			
			Statement sentencia = conexion.createStatement();
			
			ResultSet rs = sentencia.executeQuery(sql);
			
		} catch (SQLException e) {
			System.out.println("Error en la conexion con la BD");
			e.printStackTrace();
		}
	}

	private List<Libro> construyeLista(ResultSet rs) throws SQLException{
		List<Libro> lista = new ArrayList<>();
		
		while(rs.next()) {
			Libro l = new Libro();
			l.setIsbn(rs.getString("isbn"));
			l.setAutor(rs.getString("autor"));
			l.setGenero(Genero.getGenero(rs.getString("genero")));
			l.setTitulo(rs.getString("titulo"));
			l.setPaginas(rs.getInt("paginas"));
		}
		
		return lista;
		
	}

}
