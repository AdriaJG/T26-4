/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Reserva;
import com.example.demo.dto.ReservaId;

/**
 * @author Fenrir
 *
 */
public interface IReservasDAO extends JpaRepository<Reserva, ReservaId>{

}
