package negocio.servicios;

import java.util.List;

import negocio.vo.Libro;

public interface BibliotecaService {

	List<Libro> listaLibros();
	
	public boolean insertaLibro (Libro libro);
	
	public boolean eliminaLibro (Libro libro);
	
	public boolean actualizaLibro (String isbn, Libro libro);
}