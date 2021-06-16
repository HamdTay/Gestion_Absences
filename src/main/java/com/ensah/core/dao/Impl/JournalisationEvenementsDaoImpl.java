package com.ensah.core.dao.Impl;

import org.springframework.stereotype.Repository;

import com.ensah.core.bo.JournalisationEvenements;
import com.ensah.core.dao.IJournalisationEvenementsDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

@Repository
public class JournalisationEvenementsDaoImpl extends HibernateSpringGenericDaoImpl<JournalisationEvenements, Long> implements IJournalisationEvenementsDao{

	public JournalisationEvenementsDaoImpl() {
		super(JournalisationEvenements.class);
	}

}
