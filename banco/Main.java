package banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	
	public static void main(String[] args) {
		// Nomear o cliente
		Cliente venilton = new Cliente("Venilton",1234567);
		Cliente paulo = new Cliente("Paulo",2345678);
		Cliente cleiton = new Cliente("Cleiton", 3456789);
		
		// Criar Contas
		Conta cc = new ContaCorrente(venilton);
		Conta cc2 = new ContaCorrente(paulo);
		Conta cc3 = new ContaCorrente(cleiton);
		
		Conta poupanca = new ContaPoupanca(venilton);
		Conta poupanca2 = new ContaPoupanca(cleiton);
		
		// Criar Bancos
		List <Conta> bancoContasBrasil = new ArrayList<>();
		List <Conta> bancoContasPaulista = new ArrayList<>();
		
		Banco bancoBrasil = new Banco("Banco do Brasil");
		Banco bancoPaulista = new Banco("Banco Paulista");
		
		//Adicionar Contas ao Banco
		bancoContasBrasil.add(cc);
		bancoContasBrasil.add(poupanca);
		
		bancoContasBrasil.add(cc2);
		
		bancoContasBrasil.add(cc3);
		bancoContasBrasil.add(poupanca2);
		
		bancoContasBrasil.add(cc3);
		bancoContasBrasil.add(poupanca2);
		
		bancoContasBrasil.add(cc);
		bancoContasBrasil.add(poupanca);
		
		bancoBrasil.setContas(bancoContasBrasil);
		bancoPaulista.setContas(bancoContasPaulista);
		
		//Listar Clientes
		bancoBrasil.listarClientes();
		bancoPaulista.listarClientes();
		
		//Depositar
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		//Imprimir extrato
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
