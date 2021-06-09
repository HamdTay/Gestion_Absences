package com.ensah.core.dao.impl;

import com.ensah.core.dao.IUtilisateurDao;
import org.springframework.stereotype.Repository;

import com.ensah.core.bo.Utilisateur;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

@Repository
public class UtilisateurDaoImpl extends HibernateSpringGenericDaoImpl<Utilisateur, Long> implements IUtilisateurDao {

	public UtilisateurDaoImpl() {
		super(Utilisateur.class);
	}

}
