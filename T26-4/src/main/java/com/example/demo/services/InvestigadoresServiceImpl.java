/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IInvestigadoresDAO;
import com.example.demo.dto.Investigadores;

/**
 * @author Fenrir
 *
 */
@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService {
	
	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;
	
	@Override
	public List<Investigadores> mostrarInvestigadores() {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores mostrarInvestigadorID(String id) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores crearInvestigador(Investigadores investigador) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigador);
	}

	@Override
	public Investigadores modificarInvestigador(Investigadores investigador) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String id) {
		// TODO Auto-generated method stub
		iInvestigadoresDAO.deleteById(id);
	}

}
