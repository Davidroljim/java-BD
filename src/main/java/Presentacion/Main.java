package Presentacion;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import negocio.servicios.BibliotecaService;
import negocio.servicios.impl.BibliotecaServiceimpL;
import negocio.vo.Libro;



public class Main {
	
public static void main(String[] args) {
		
		BibliotecaService servicio = new BibliotecaService() {
			
			@Override
			public List<Libro> listaLibros() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		int opcion = -1;
		do {
			menu();
			opcion = leerOpcion();
			switch (opcion) {
			case 0:
				//Salir del programa
				break;
				
			case 1:
				//TODO Insertar libro
				break;
				
			case 2:
				//TODO Borrar libro
				break;
				
			case 3:
				//TODO Editar libro
				break;
				
			case 4:
				//TODO Limpiar catálogo
				break;
			
			case 5:
				List<Libro> libros = servicio.listaLibros();
				System.out.println("ISBN\tTitulo\tGenero\tAutor\tPaginas");
				System.out.println("-----------------------------------");
					for(Libro libro : libros) {
						System.out.println(libro.getIsbn());
						System.out.println("\t");
						System.out.println(libro.getTitulo());
						System.out.println("\t");
						System.out.println(libro.getGenero());
						System.out.println("\t");
						System.out.println(libro.getAutor());
						System.out.println("\t");
						System.out.println(libro.getPaginas());
						System.out.println("-----------------------------------");
					}
				break;

			default:
				break;
			}
		} while (opcion!=0);
		
	}
	
	private static void menu() {
		
		System.out.println("Elija una opcion");
		System.out.println("0.Salir del programa");
		System.out.println("1.Insertar un libro");
		System.out.println("2.Borrar libro");
		System.out.println("3.Editar libro");
		System.out.println("4.Limpiar catálogo");
		System.out.println("5.Lista de Libros");


	}
	
	private static int leerOpcion() {
		int retorno = 0;
		Scanner sc = new Scanner(System.in);
		retorno = sc.nextInt();
		return retorno;
	}
}
