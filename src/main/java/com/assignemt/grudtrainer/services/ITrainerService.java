/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignemt.grudtrainer.services;

import com.assignemt.grudtrainer.entities.Trainer;
import java.util.List;

/**
 *
 * @author Chris
 */
public interface ITrainerService {
    
    public List<Trainer> getAllTrainers();
    public Trainer insertTrainer(Trainer trainer);
    public Trainer findById(int id);
    public void updateTrainer(Trainer trainer, int id);
    public boolean deleteTrainer(Trainer trainer);
    
    
}
