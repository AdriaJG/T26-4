/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Investigadores;

/**
 * @author Fenrir
 *
 */
public interface IInvestigadoresDAO extends JpaRepository<Investigadores, String> {

}
