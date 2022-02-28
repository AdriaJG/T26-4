/**
 * 
 */
package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Fenrir
 *
 */
public class ReservaId implements Serializable {
	@ManyToOne
	@JoinColumn(name="DNI")
	Investigadores DNI;
	@ManyToOne
	@JoinColumn(name="numserie")
	Equipos numSerie;
	
	public ReservaId(Investigadores dNI, Equipos numserie) {
		super();
		DNI = dNI;
		this.numSerie = numserie;
	}

	public ReservaId() {
		super();
	}

}
