package com.example.demo.dto;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="reserva")
@IdClass(ReservaId.class)
public class Reserva {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@ManyToOne
	@JoinColumn(name = "DNI")
	private String DNI;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@ManyToOne
	@JoinColumn(name = "numserie")
	private String numSerie;
	@Temporal(TemporalType.TIMESTAMP)
	private Date comienzo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fin;
	
	public Reserva() {
		super();
	}

	public Reserva(String dNI, String numSerie, Date comienzo, Date fin) {
		super();
		DNI = dNI;
		this.numSerie = numSerie;
		this.comienzo = comienzo;
		this.fin = fin;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	
	
	
}