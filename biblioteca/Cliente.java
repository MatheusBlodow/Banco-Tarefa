package biblioteca;

public class Cliente {
	
	private String nome;
	private int registro;
	
	public Cliente(String nome, int registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	public String getNome() {
		return nome;
	}

	public int getRegistro() {
		return registro;
	}
}
