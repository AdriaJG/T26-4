/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Reserva;

/**
 * @author Fenrir
 *
 */
public interface IReservasService {
	public List<Reserva> mostrarReservas();
	
	public  Reserva mostrarReservaID(Long id);
	
	public Reserva crearReserva(Reserva reserva);
	
	public Reserva modificarReserva(Reserva reserva);
	
	public void eliminarReserva(Long id);
}
