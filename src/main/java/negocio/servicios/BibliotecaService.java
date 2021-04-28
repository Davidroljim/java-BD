package negocio.servicios;

import java.util.List;

import negocio.vo.Libro;

public interface BibliotecaService {

	List<Libro> listaLibros();
	
	public boolean inserta (Libro libro);
	
	public boolean elimina (Libro libro);
	
	public boolean actualiza (String isbn, Libro libro);
}