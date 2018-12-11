package com.tsystems.tu.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tsystems.tu.DemoBackingBean;

/**
 * Clase de test del BackingBean.
 * @author crequena
 *
 */
public class DemoBackingBeanTest {
	
	private static final String DATO_TEST = "dato de prueba";

	/**
	 * Método de prueba de un setter.
	 */
	@Test
	public void setDatoTest() {
		DemoBackingBean demoBackingBean = new DemoBackingBean();
		demoBackingBean.setDato(DATO_TEST);

		// Test de igualdad.
		assertEquals(demoBackingBean.getDato(), DATO_TEST);
	}

}
