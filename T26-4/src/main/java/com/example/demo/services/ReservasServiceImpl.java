/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IReservasDAO;
import com.example.demo.dto.Reserva;

/**
 * @author Fenrir
 *
 */
@Service
public class ReservasServiceImpl implements IReservasService{
	
	@Autowired
	IReservasDAO iReservasDAO;
	
	@Override
	public List<Reserva> mostrarReservas() {
		// TODO Auto-generated method stub
		return iReservasDAO.findAll();
	}

	@Override
	public Reserva mostrarReservaID(Long id) {
		// TODO Auto-generated method stub
		return iReservasDAO.findById(id).get();
	}

	@Override
	public Reserva crearReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservasDAO.save(reserva);
	}

	@Override
	public Reserva modificarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservasDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(Long id) {
		// TODO Auto-generated method stub
		iReservasDAO.deleteById(id);
	}

}
