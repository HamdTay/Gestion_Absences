package com.ensah.core.services;

import com.ensah.core.bo.Enseignant;

import java.util.List;

public interface IEnseignantService {

    public void addEnseignant(Enseignant cAdministrateur);
    public List<Enseignant> getAllEnseignants();
    public Enseignant getEnseignantById(Long id);
    public void updateEnseignant(Enseignant cAdministrateur);
    public void deleteEnseignant(Long id);


}
