/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignemt.grudtrainer.repositories;

import com.assignemt.grudtrainer.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Chris
 */
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
    
  
}
