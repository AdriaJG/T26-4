/**
 * 
 */
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

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="investigadores")
public class Investigadores {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "DNI")
	private String DNI;
	@Column(name="nomapel")
	private String nomApels;
	@ManyToOne
	@JoinColumn(name="facultad")
	private Facultad facultad;
	
	public Investigadores() {
		super();
	}
	public Investigadores(String dNI, String nomApels, Facultad facultad) {
		super();
		DNI = dNI;
		this.nomApels = nomApels;
		this.facultad = facultad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	public Facultad getFacultad() {
		return facultad;
	}
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	@Override
	public String toString() {
		return "Investigadores [DNI=" + DNI + ", nomApels=" + nomApels + ", facultad=" + facultad + "]";
	}
	
	
}
