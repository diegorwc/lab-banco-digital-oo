package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton", LocalDate.of(2000, 10, 12), "13245678912");
		venilton.setNome("Venilton");
		
		Banco vBank = new Banco("vBank");
		List<Conta> contas = new ArrayList<>();
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		contas.add(cc);
		contas.add(poupanca);
		
		vBank.setContas(contas);
		System.out.println(vBank.getContas());

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
