package com.ensah.core.dao.impl;

import com.ensah.core.bo.Inscription;
import com.ensah.core.dao.IInscriptionDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class InscriptionDaoImpl extends HibernateSpringGenericDaoImpl<Inscription, Long> implements IInscriptionDao {

    public InscriptionDaoImpl() {
        super(Inscription.class);
    }

}
