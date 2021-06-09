package com.ensah.core.dao.impl;

import com.ensah.core.bo.PieceJustificative;
import com.ensah.core.dao.IPieceJustificativeDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class PieceJustificativeDaoImpl extends HibernateSpringGenericDaoImpl<PieceJustificative, Long> implements IPieceJustificativeDao {

    public PieceJustificativeDaoImpl() {
        super(PieceJustificative.class);
    }

}
