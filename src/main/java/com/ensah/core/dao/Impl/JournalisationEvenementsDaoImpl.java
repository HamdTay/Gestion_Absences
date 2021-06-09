package com.ensah.core.dao.impl;

import com.ensah.core.bo.JournalisationEvenements;
import com.ensah.core.dao.IJournalisationEvenementsDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class JournalisationEvenementsDaoImpl extends HibernateSpringGenericDaoImpl<JournalisationEvenements, Long> implements IJournalisationEvenementsDao {

    public JournalisationEvenementsDaoImpl() {
        super(JournalisationEvenements.class);
    }

}
