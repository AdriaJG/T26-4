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

import com.example.demo.dto.Reserva;
import com.example.demo.services.ReservasServiceImpl;

/**
 * @author Fenrir
 *
 */
@RestController
@RequestMapping("/api")
public class ReservasController {
	
	@Autowired
	ReservasServiceImpl reservasServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas(){
		return reservasServiceImpl.mostrarReservas();
	}
	
	@GetMapping("/reservas/{id}")
	public Reserva mostrarReservaID(@PathVariable(name="id") Long id){
		return reservasServiceImpl.mostrarReservaID(id);
	}
	
	@PutMapping("/reservas/crear")
	public Reserva crearReserva(@RequestBody Reserva reserva) {
		return reservasServiceImpl.crearReserva(reserva);
	}
	
	@PostMapping("/reservas/modificar/{id}")
	public Reserva modificarReservas(@PathVariable(name="id") Long id, @RequestBody Reserva reserva) {
		Reserva reservaSeleccionado = new Reserva();
		Reserva reservaModificado = new Reserva();
		
		reservaSeleccionado = reservasServiceImpl.mostrarReservaID(id);
		reservaSeleccionado.setDNI(reserva.getDNI());
		reservaSeleccionado.setNumSerie(reserva.getNumSerie());
		reservaSeleccionado.setComienzo(reserva.getComienzo());
		reservaSeleccionado.setFin(reserva.getFin());
		
		return reservaModificado = reservasServiceImpl.modificarReserva(reservaSeleccionado);
	}
	
	@DeleteMapping("reserva/eliminar/{id}")
	public void eliminarEquioi(@PathVariable(name="id") Long id) {
		reservasServiceImpl.eliminarReserva(id);
		
	}
	
}
