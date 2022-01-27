package projeto.dois;

import java.util.List;

public class Livros implements ILivros {
	
	private static int REGISTRO_ALUGUEL = 1;
	
	private List <String> livro;
	private int registroAluguel;
	private List <Integer> numeroPaginas;
	private Cliente cliente; 
	private Biblioteca biblioteca;
	
	public Livros(Cliente cliente, Biblioteca biblioteca) {
		this.registroAluguel = REGISTRO_ALUGUEL++;
		this.cliente = cliente;
		this.biblioteca = biblioteca;
	}
	
	public List <String> getLivro() {
		return livro;
	}

	public int getRegistroAluguel() {
		return registroAluguel;
	}
	
	public List<Integer> getNumeroPaginas() {
		return numeroPaginas;
	}

	@Override
	public void alugarLivro(List <String> livro, List <Integer> numeroPaginas) {
		this.livro = livro;
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public void devolverLivro(String livro) {
		this.livro.remove(livro);
	}

	@Override
	public void listarLivrosAlugados() {
		int i = 0;
		for (String livros : this.livro) {
			System.out.println(String.format("Bem vindo a %s", this.biblioteca.getNome()));
			System.out.println(String.format("Livro: %s", livros));
			System.out.println(String.format("Número de registro do aluguel: %d", this.registroAluguel));
			System.out.println(String.format("Número de páginas: %d", this.numeroPaginas.get(i)));
			System.out.println(String.format("Cliente : %s", this.cliente.getNome()));
			System.out.println(String.format("Numero de Registro do Cliente : %d", this.cliente.getRegistro()));
			System.out.println("");
			i++;
		}
	}
	
}
