package br.com.lino.binario;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SomaTest {

	private Soma soma;

	@Before
	public void setUp() {
		soma = new Soma();
	}

	@Test
	public void deveSomarValoresPares() {
		int valor = soma.calcula("10", "10");

		assertEquals(100, valor);
	}

	@Test
	public void deveSomarValoresImpares() {
		int valor = soma.calcula("11", "11");

		assertEquals(110, valor);
	}

	@Test
	public void deveSomarImparComPar() {
		int valor = soma.calcula("11", "10");

		assertEquals(101, valor);
	}

	@Test
	public void deveSomarParComImpar() {
		int valor = soma.calcula("10", "11");

		assertEquals(101, valor);
	}

	@Test
	public void deveSomarTamanhosIguais() {
		int valor = soma.calcula("10", "10");

		assertEquals(100, valor);
	}

	@Test
	public void deveSomarComTamanhoDoPrimeiroMaiorQueSegundo() {
		int valor = soma.calcula("11001", "11");

		assertEquals(11100, valor);
	}

	@Test
	public void deveSomarComTamanhoDoSegundoMaiorQuePrimeiro() {
		int valor = soma.calcula("11", "11001");

		assertEquals(11100, valor);
	}

}
