package com.emadesko.core.factory;

import com.emadesko.repositories.MedecinRepository;
import com.emadesko.repositories.RdvRepository;
import com.emadesko.repositories.db.MedecinRepositoryDb;
import com.emadesko.repositories.db.RdvRepositoryDb;

public class RepositoryFactory {
    private MedecinRepository medecinRepository;
    private RdvRepository rdvRepository;

    public MedecinRepository getInstanceOfMedecinRepository(){
        if (this.medecinRepository!=null) {
            medecinRepository=new MedecinRepositoryDb();
        }
        return medecinRepository;
    }

    public RdvRepository getInstanceOfRdvRepository(){
        if (this.rdvRepository!=null) {
            rdvRepository=new RdvRepositoryDb();
        }
        return rdvRepository;
    }

}
