/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignemt.grudtrainer.controllers;

import com.assignemt.grudtrainer.entities.Trainer;
import com.assignemt.grudtrainer.entities.validators.TrainerValidator;
import com.assignemt.grudtrainer.services.ITrainerService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Chris
 */
@Controller
public class TrainerController {
    
    @Autowired
    ITrainerService trainerService;
    TrainerValidator trainerVal;
    
    @GetMapping("/")
    public String getAllTrainers(ModelMap mm){
        
        List<Trainer>  trainers = trainerService.getAllTrainers();
        mm.addAttribute("trainers", trainers);
        return "alltrainers";
        
    }
    
    @GetMapping("/add")
    public String addForm(ModelMap mm){
        Trainer trainer = new Trainer();
        mm.addAttribute("newtrainer", trainer);
        return "add";
    }
    
    @PostMapping("/addtrainer")
    public String insertTrainer( @Valid @ModelAttribute(name = "newtrainer")Trainer t,
                                 BindingResult result,
                                 ModelMap mm){
        if(result.hasErrors()){
            return "add";
        }                       
        trainerService.insertTrainer(t);
        List<Trainer>  trainers = trainerService.getAllTrainers();
        mm.addAttribute("trainers", trainers);
        return "alltrainers";
    }

    @GetMapping("/edit/{id}")
    public String updateTrainer(@PathVariable(name = "id") String id,
                                ModelMap mm){
        
        
       
        int trainerId = Integer.parseInt(id);
        Trainer trainer = trainerService.findById(trainerId);
        mm.addAttribute("newtrainer", trainer);
        
        
       return "edit";
    }
    

    @PostMapping("/edittrainer")
    public String updateTrainer( @Valid @ModelAttribute(name = "newtrainer")Trainer t,
                                  BindingResult result,
                                  ModelMap mm){
        if(result.hasErrors()){
            return "edit";
        } 
        
        trainerService.updateTrainer(t,t.getId());
        List<Trainer>  trainers = trainerService.getAllTrainers();
        mm.addAttribute("trainers", trainers);
        return "alltrainers";
    }

    @GetMapping("/delete/{id}")
    public String deleteTrainer(@PathVariable(name="id")String id,
                                ModelMap mm){
    
        int trainerId = Integer.parseInt(id);
        Trainer trainer = trainerService.findById(trainerId);
        if(trainer.getId() > 0){
        trainerService.deleteTrainer(trainer);  
        List<Trainer>  trainers = trainerService.getAllTrainers();
        mm.addAttribute("trainers", trainers);
        }
            return "alltrainers";
    }
}
