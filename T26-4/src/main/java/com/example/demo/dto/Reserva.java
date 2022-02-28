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
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "DNI")
	private Investigadores DNI;
	
	@ManyToOne
	@JoinColumn(name = "numserie")
	private Equipos numSerie;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date comienzo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fin;
	
	public Reserva() {
		super();
	}

	public Reserva(Investigadores dNI, Equipos numSerie, Date comienzo, Date fin) {
		super();
		DNI = dNI;
		this.numSerie = numSerie;
		this.comienzo = comienzo;
		this.fin = fin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Investigadores getDNI() {
		return DNI;
	}

	public void setDNI(Investigadores dNI) {
		DNI = dNI;
	}

	public Equipos getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(Equipos numSerie) {
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