/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEquiposDAO;
import com.example.demo.dto.Equipos;

/**
 * @author Fenrir
 *
 */
@Service
public class EquiposServiceImpl implements IEquiposServices {
	
	@Autowired
	IEquiposDAO iEquiposDAO;
	
	@Override
	public List<Equipos> mostrarEquipos() {
		// TODO Auto-generated method stub
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos mostrarEquipoID(String id) {
		// TODO Auto-generated method stub
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipos crearEquipoID(Equipos equipo) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipo);
	}

	@Override
	public Equipos modificarEquipoID(Equipos equipo) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String id) {
		// TODO Auto-generated method stub
		iEquiposDAO.deleteById(id);
		
	}

}
