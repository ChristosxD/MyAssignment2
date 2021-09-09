/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignemt.grudtrainer.services;

import com.assignemt.grudtrainer.entities.Trainer;
import com.assignemt.grudtrainer.repositories.TrainerRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chris
 */
@Service
@Transactional
public class TrainerService implements ITrainerService{

    @Autowired
    TrainerRepository trainerRepo;
    
    @Override
    public List<Trainer> getAllTrainers() {
         return trainerRepo.findAll();
    }

    @Override
    public Trainer insertTrainer(Trainer trainer) {
        
        trainerRepo.save(trainer);
        return trainer;
    }

    @Override
    public Trainer findById(int id) {
        Trainer trainer = trainerRepo.getById(id);
        return trainer;
        
    }

    @Override
    public void updateTrainer(Trainer trainer,int id) {
        trainer.setId(id);
        trainerRepo.save(trainer);
    }

    @Override
    public boolean deleteTrainer(Trainer trainer) {
        trainerRepo.delete(trainer);
        if(trainer == null){
            return true;
        }
        return false;
    }
}
