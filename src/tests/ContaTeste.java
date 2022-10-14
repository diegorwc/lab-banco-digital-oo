package tests;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Cliente;
import main.Conta;
import main.ContaCorrente;

public class ContaTeste {
	
	@Test
	void deveImpedirEmDepositoNegativo() {
		Cliente cli = new Cliente("Diego Ricardo", LocalDate.of(1994, 2, 7), "12345678901");
		Conta conta = new ContaCorrente(cli);
		Assertions.assertEquals(conta.depositar(-10), false);
	}
	
	@Test
	void deveImpedirSaqueMaiorQueSaldo() {
		Cliente cli = new Cliente("Diego Ricardo", LocalDate.of(1994, 2, 7), "12345678901");
		Conta conta = new ContaCorrente(cli);
		conta.depositar(500);
		Assertions.assertEquals(conta.sacar(501), false);
	}
	
	@Test
	void deveImpedirTransferenciaMaiorQueSaldo() {
		Cliente cli = new Cliente("Diego Ricardo", LocalDate.of(1994, 2, 7), "12345678901");
		Conta conta = new ContaCorrente(cli);
		Cliente cli2 = new Cliente("Ricardo", LocalDate.of(1994, 2, 7), "12345678901");
		Conta conta2 = new ContaCorrente(cli2);
		conta.depositar(500);
		Assertions.assertEquals(conta.transferir(501, conta2), false);
	}

}
