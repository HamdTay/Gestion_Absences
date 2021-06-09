package com.ensah.core.dao.impl;

import com.ensah.core.bo.Filiere;
import com.ensah.core.dao.IFiliereDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class FiliereDaoImpl extends HibernateSpringGenericDaoImpl<Filiere, Long> implements IFiliereDao {

    public FiliereDaoImpl() {
        super(Filiere.class);
    }

}
