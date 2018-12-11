package com.tsystems.tu;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;

import org.apache.log4j.Logger;
import java.io.Serializable;

/**
 * Clase BackingBean demo.
 * @author krequena
 *
 */
@Model
@SessionScoped
public class DemoBackingBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(DemoBackingBean.class);

	@Produces
	private String dato;

	/**
	 * @return the dato
	 */
	public String getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(String dato) {
		this.dato = dato;
	}

	public String operacion() {
		LOGGER.info("Dato: " + this.dato);
		return "";
	}

}
