package com.emadesko.services;

import java.util.List;

import com.emadesko.entities.Medecin;
import com.emadesko.repositories.MedecinRepository;

public class MedecinService implements Service<Medecin>{

    MedecinRepository medecinRepository;
    
    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public int add(){
        return  medecinRepository.insert();
    }

    public List<Medecin> getAll(){
        return medecinRepository.selectAll();
    }
}
