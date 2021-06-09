package com.ensah.core.services;

import com.ensah.core.bo.Absence;

import java.util.List;

public interface IAbsenceService {

    public void addAbsence(Absence cAbsence);
    public Absence getAbsenceById(Long id);
    public List<Absence> getAllAbsences();
    public void updateAbsence(Absence cAbsence);
    public void deleteAbsence(Long id);

}
