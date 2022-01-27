package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Cliente marcos = new Cliente("Marcos", 457);
		Cliente paulo = new Cliente("Paulo", 1);
		
		Biblioteca bibliotecaMunicipal = new Biblioteca("Biblioteca Municipal");
		
		Livros livro1 = new Livros(marcos, bibliotecaMunicipal);
		Livros livro2 = new Livros(paulo, bibliotecaMunicipal);
		
		List <String> nomeLivro1 = new ArrayList<String>();
		List <Integer> paginas1 = new ArrayList<Integer>();
		nomeLivro1.add("Narnia");
		paginas1.add(890);
		nomeLivro1.add("História");
		paginas1.add(780);
		
		List <String> nomeLivro2 = new ArrayList<>();
		List <Integer> paginas2 = new ArrayList<Integer>();
		nomeLivro2.add("Senhor dos aneis");
		paginas2.add(792);
		
		livro1.alugarLivro(nomeLivro1, paginas1);
		livro2.alugarLivro(nomeLivro2, paginas2);
		
		livro1.listarLivrosAlugados();
		livro2.listarLivrosAlugados();
		
		livro1.devolverLivro("Narnia");
		
		livro1.listarLivrosAlugados();
		
	}
	
}
