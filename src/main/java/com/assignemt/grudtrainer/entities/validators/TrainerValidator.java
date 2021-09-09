/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignemt.grudtrainer.entities.validators;

import com.assignemt.grudtrainer.entities.Trainer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author Chris
 */
public class TrainerValidator implements Validator{

    @Override
    public boolean supports(Class<?> type) {
       return (Trainer.class.equals(type));
    }

    @Override
    public void validate(Object o, Errors errors) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
