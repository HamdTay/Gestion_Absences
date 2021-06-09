package com.ensah.core.dao.impl;

import com.ensah.core.bo.CadreAdministrateur;
import com.ensah.core.dao.ICadreAdministrateurDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class CadreAdministrateurDaoImpl extends HibernateSpringGenericDaoImpl<CadreAdministrateur, Long> implements ICadreAdministrateurDao {
    public CadreAdministrateurDaoImpl() {
        super(CadreAdministrateur.class);
    }
}
