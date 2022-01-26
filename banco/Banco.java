package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	Banco(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void listarClientes() {
		List <String> titularConta = new ArrayList<>();
		String retirarIguais = " ";
		
		System.out.println(String.format("O %s tem os seguintes clientes:", this.nome));
		for (Conta conta : contas) {
			titularConta.add(conta.cliente.getNome());
		}
		
		Collections.sort(titularConta);
		for (String titular : titularConta) {
			if(!titular.equals(retirarIguais)) {
				System.out.println(String.format(titular));
			}
			retirarIguais = titular;
		}
		
	}
	
}
