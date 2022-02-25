/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Investigadores;

/**
 * @author Fenrir
 *
 */
public interface IInvestigadoresService {
	public List<Investigadores> mostrarInvestigadores();
	
	public Investigadores mostrarInvestigadorID(String id);
	
	public Investigadores crearInvestigador(Investigadores investigador);
	
	public Investigadores modificarInvestigador(Investigadores investigador);
	
	public void eliminarInvestigador(String id);
}
