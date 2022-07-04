/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.repository;

import com.quintaelena.demo.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author 51950
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

    List<Persona> findByTipoDocumento(Long tidoId);
}
