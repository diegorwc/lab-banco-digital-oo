package main;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton", LocalDate.of(2000, 10, 12), "13245678912");
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
