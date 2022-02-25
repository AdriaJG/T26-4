/**
 * 
 */
package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Fenrir
 *
 */
public class ReservaId implements Serializable {
	@Column(name="dni")
	String DNI;
	@Column(name="numserie")
	String numSerie;
	
	public ReservaId() {
		super();
	}

	public ReservaId(String dNI, String numSerie) {
		super();
		DNI = dNI;
		numSerie = numSerie;
	}
	
	
	
}
