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

import com.example.demo.dto.Investigadores;
import com.example.demo.services.InvestigadoresServiceImpl;

/**
 * @author Fenrir
 *
 */
@RestController
@RequestMapping("/api")
public class InvestigadoresController {
	
	@Autowired
	InvestigadoresServiceImpl investigadoresServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigadores> listarInvestigadores(){
		return investigadoresServiceImpl.mostrarInvestigadores();
	}
	
	@GetMapping("/investigadores/{id}")
	public Investigadores mostrarInvestigadorID(@PathVariable(name="id") String id){
		return investigadoresServiceImpl.mostrarInvestigadorID(id);
	}
	
	@PutMapping("/investigadores/crear")
	public Investigadores crearInvestigador(@RequestBody Investigadores investigador) {
		return investigadoresServiceImpl.crearInvestigador(investigador);
	}
	
	@PostMapping("/investigadores/modificar/{id}")
	public Investigadores modificarInvestigadores(@PathVariable(name="id") String id, @RequestBody Investigadores investigador) {
		Investigadores investigadorSeleccionado = new Investigadores();
		Investigadores investigadorModificado = new Investigadores();
		
		investigadorSeleccionado = investigadoresServiceImpl.mostrarInvestigadorID(id);
		investigadorSeleccionado.setFacultad(investigador.getFacultad());
		investigadorSeleccionado.setNomApels(investigador.getNomApels());
		investigadorSeleccionado.setDNI(investigador.getDNI());
		
		return investigadorModificado = investigadoresServiceImpl.modificarInvestigador(investigadorSeleccionado);
	}
	
	@DeleteMapping("investigador/eliminar/{id}")
	public void eliminarEquioi(@PathVariable(name="id") String id) {
		investigadoresServiceImpl.eliminarInvestigador(id);
		
	}
	
}
