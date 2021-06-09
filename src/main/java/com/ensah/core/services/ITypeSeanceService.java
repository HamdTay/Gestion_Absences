package com.ensah.core.services;

import com.ensah.core.bo.TypeSeance;

import java.util.List;

public interface ITypeSeanceService {

    public void addTypeSeance(TypeSeance cTypeSeance);
    public TypeSeance getTypeSeanceById(Long id);
    public List<TypeSeance> getAllTypeSeances();
    public void updateTypeSeance(TypeSeance cTypeSeance);
    public void deleteTypeSeance(Long id);

}
