package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void testSuma() {
		int res = operacion.suma(5, 8);
		int esperado = 13;
		assertEquals(esperado,res);
	}
	
	@Test
	public void testResta() {
		int res = operacion.resta(5, 8);
		int esperado = -3;
		assertEquals(esperado,res);
	}
	@Test
	public void testMultiplicacion() {
		int res = operacion.multiplicacion(5, 8);
		int esperado = 40;
		assertEquals(esperado,res);
	}
	
	@Test
	public void testDivision() {
		double res = operacion.division(5, 8);
		double esperado = 0.625;
		assertEquals(esperado, res, 0.0000);
	}
}
