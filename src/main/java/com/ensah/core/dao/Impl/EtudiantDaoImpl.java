package com.ensah.core.dao.impl;

import com.ensah.core.bo.Etudiant;
import com.ensah.core.dao.IEtudiantDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class EtudiantDaoImpl extends HibernateSpringGenericDaoImpl<Etudiant, Long> implements IEtudiantDao {

    public EtudiantDaoImpl() {
        super(Etudiant.class);
    }

}
