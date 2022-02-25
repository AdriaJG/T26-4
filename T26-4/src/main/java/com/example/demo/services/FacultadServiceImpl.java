/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFacultadDAO;
import com.example.demo.dto.Facultad;

/**
 * @author Fenrir
 *
 */
@Service
public class FacultadServiceImpl implements IFacultadService {
	
	@Autowired
	IFacultadDAO iFacultadDAO;
	
	@Override
	public List<Facultad> mostrarFacultades() {
		// TODO Auto-generated method stub
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad mostrarFacultadID(int id) {
		// TODO Auto-generated method stub
		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad crearFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad modificarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		// TODO Auto-generated method stub
		iFacultadDAO.deleteById(id);
		
	}

}
