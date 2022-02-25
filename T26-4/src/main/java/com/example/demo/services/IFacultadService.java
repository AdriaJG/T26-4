/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Equipos;
import com.example.demo.dto.Facultad;

/**
 * @author Fenrir
 *
 */
public interface IFacultadService {
	public List<Facultad> mostrarFacultades();
	
	public Facultad mostrarFacultadID(int id);
	
	public Facultad crearFacultad(Facultad facultad);
	
	public Facultad modificarFacultad(Facultad facultad);
	
	public void eliminarFacultad(int id);
}
