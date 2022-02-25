package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Equipos;

public interface IEquiposServices {
	public List<Equipos> mostrarEquipos();
	
	public Equipos mostrarEquipoID(String id);
	
	public Equipos crearEquipoID(Equipos equipo);
	
	public Equipos modificarEquipoID(Equipos equipo);
	
	public void eliminarEquipo(String id);
	
}
