/**
 * 
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Equipos;
import com.example.demo.services.EquiposServiceImpl;

/**
 * @author Fenrir
 *
 */
@RestController
@RequestMapping("/api")
public class EquiposController {
	
	@Autowired
	EquiposServiceImpl equiposServiceImpl;
	
	@GetMapping("/equipos")
	public List<Equipos> listarEquipos(){
		return equiposServiceImpl.mostrarEquipos();
	}
	
	@GetMapping("/equipos/{id}")
	public Equipos mostrarEquipoID(@PathVariable(name="id") String id){
		return equiposServiceImpl.mostrarEquipoID(id);
	}
	
	@PutMapping("/equipos/crear")
	public Equipos crearEquipo(@RequestBody Equipos equipo) {
		return equiposServiceImpl.crearEquipoID(equipo);
	}
	
	@PostMapping("/equipos/modificar/{id}")
	public Equipos modificarEquipos(@PathVariable(name="id") String id, @RequestBody Equipos equipo) {
		Equipos equipoSeleccionado = new Equipos();
		Equipos equipoModificado = new Equipos();
		
		equipoSeleccionado = equiposServiceImpl.mostrarEquipoID(id);
		equipoSeleccionado.setFacultad(equipo.getFacultad());
		equipoSeleccionado.setNombre(equipo.getNombre());
		equipoSeleccionado.setNumSerie(equipo.getNumSerie());
		
		return equipoModificado = equiposServiceImpl.modificarEquipoID(equipoSeleccionado);
	}
	
	@DeleteMapping("equipo/eliminar/{id}")
	public void eliminarEquioi(@PathVariable(name="id") String id) {
		equiposServiceImpl.eliminarEquipo(id);
		
	}
	
}
