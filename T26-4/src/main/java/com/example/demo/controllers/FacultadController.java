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

import com.example.demo.dto.Facultad;
import com.example.demo.services.FacultadServiceImpl;

/**
 * @author Fenrir
 *
 */
@RestController
@RequestMapping("/api")
public class FacultadController {
	
	@Autowired
	FacultadServiceImpl facultadesServiceImpl;
	
	@GetMapping("/facultades")
	public List<Facultad> listarFacultad(){
		return facultadesServiceImpl.mostrarFacultades();
	}
	
	@GetMapping("/facultades/{id}")
	public Facultad mostrarFacultadID(@PathVariable(name="id") int id){
		return facultadesServiceImpl.mostrarFacultadID(id);
	}
	
	@PutMapping("/facultades/crear")
	public Facultad crearFacultad(@RequestBody Facultad facultad) {
		return facultadesServiceImpl.crearFacultad(facultad);
	}
	
	@PostMapping("/facultades/modificar/{id}")
	public Facultad modificarFacultad(@PathVariable(name="id") int id, @RequestBody Facultad facultad) {
		Facultad facultadSeleccionado = new Facultad();
		Facultad facultadModificado = new Facultad();
		
		facultadSeleccionado = facultadesServiceImpl.mostrarFacultadID(id);
		facultadSeleccionado.setCodigo(facultad.getCodigo());
		facultadSeleccionado.setNombre(facultad.getNombre());
		
		return facultadModificado = facultadesServiceImpl.modificarFacultad(facultadSeleccionado);
	}
	
	@DeleteMapping("facultad/eliminar/{id}")
	public void eliminarEquioi(@PathVariable(name="id") int id) {
		facultadesServiceImpl.eliminarFacultad(id);
		
	}
	
}
