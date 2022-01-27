package projeto.dois;

import java.util.List;

public interface ILivros {
	
	void alugarLivro(List <String> livro, List <Integer> numeroPaginas);
	
	void devolverLivro(String livro);
	
	void listarLivrosAlugados();

}
