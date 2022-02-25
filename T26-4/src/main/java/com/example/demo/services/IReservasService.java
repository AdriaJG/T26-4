/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Reserva;
import com.example.demo.dto.ReservaId;

/**
 * @author Fenrir
 *
 */
public interface IReservasService {
	public List<Reserva> mostrarReservas();
	
	public  Reserva mostrarReservaID(ReservaId id);
	
	public Reserva crearReserva(Reserva reserva);
	
	public Reserva modificarReserva(Reserva reserva);
	
	public void eliminarReserva(ReservaId id);
}
