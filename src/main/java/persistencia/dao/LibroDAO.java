package persistencia.dao;

import java.util.List;

import negocio.vo.Libro;
public interface LibroDAO {

	List <Libro> obtenerDatosLibro();
	
	public void insertarLibros();
	
	public boolean actualizaLibro (String isbn, Libro libro);
}
