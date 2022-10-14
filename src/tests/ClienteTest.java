package tests;

import java.time.LocalDate;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Cliente;

public class ClienteTest {
	
	@Test
	void testaEntradaDeNomesComCaracateresInvalidos() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Cliente("Diego #", LocalDate.of(1994, 2, 7), "12345678901"));
	}
	
	@Test
	void testaSeCpfContemApenasNumeros() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Cliente("Diego Ricardo", LocalDate.of(1994, 2, 7), "1234567890#"));		
	}
	
	@Test
	void testaSeCpfContemOnzeDigitos() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Cliente("Diego Ricardo", LocalDate.of(1994, 2, 7), "1234567891"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Cliente("Diego Ricardo", LocalDate.of(1994, 2, 7), "123456789123"));
	}
}
