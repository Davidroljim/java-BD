package negocio.servicios.impl;

import java.util.List;

import negocio.servicios.BibliotecaService;
import negocio.vo.Libro;
import persistencia.dao.LibroDAO;
import persistencia.dao.impl.LibroDaoimpL;

public class BibliotecaServiceimpL implements BibliotecaService{

	LibroDAO librosBD = new LibroDaoimpL();

	@Override
	public List<Libro> listaLibros() {
		List<Libro> catalogo = null;
		// TODO pedir el catalogo a persistencia
		return catalogo;
	}

	@Override
	public boolean inserta(Libro libro) {
		return false;
		// TODO Auto-generated method stub
		//return librosBD.inserta(libro);
	}

	@Override
	public boolean elimina(Libro libro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizaLibro(String isbn, Libro libro) {
		// TODO Auto-generated method stub
		return false;
	}

	
}



