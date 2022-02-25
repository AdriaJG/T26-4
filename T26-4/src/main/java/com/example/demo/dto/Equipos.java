package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="equipos")
public class Equipos {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "numserie")
	private String numSerie;
	@Column(name="nombre")
	private String nombre;
	@ManyToOne
	@JoinColumn(name="facultad")
	private Facultad facultad;
	public Equipos() {
		super();
	}
	public Equipos(String numSerie, String nombre, Facultad facultad) {
		super();
		numSerie = numSerie;
		this.nombre = nombre;
		this.facultad = facultad;
	}
	public String getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Facultad getFacultad() {
		return facultad;
	}
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	@Override
	public String toString() {
		return "Equipos [numSerie=" + numSerie + ", nombre=" + nombre + ", facultad=" + facultad + "]";
	}

}
