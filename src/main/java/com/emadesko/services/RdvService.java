package com.emadesko.services;

import java.util.List;

import com.emadesko.entities.Rdv;
import com.emadesko.repositories.RdvRepository;

public class RdvService implements Service<Rdv>{
    
    RdvRepository rdvRepository;
    
    public RdvService(RdvRepository rdvRepository) {
        this.rdvRepository = rdvRepository;
    }

    public int add(){
        return  rdvRepository.insert();
    }

    public List<Rdv> getAll(){
        return rdvRepository.selectAll();
    }
}
