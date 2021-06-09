package com.ensah.core.dao.impl;

import com.ensah.core.bo.Compte;
import com.ensah.core.dao.ICompteDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class CompteDaoImpl extends HibernateSpringGenericDaoImpl<Compte, Long> implements ICompteDao {

    public CompteDaoImpl() {
        super(Compte.class);
    }

}