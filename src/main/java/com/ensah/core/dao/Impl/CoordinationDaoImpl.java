package com.ensah.core.dao.impl;

import com.ensah.core.bo.Coordination;
import com.ensah.core.dao.ICoordinationDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class CoordinationDaoImpl extends HibernateSpringGenericDaoImpl<Coordination, Long> implements ICoordinationDao {

    public CoordinationDaoImpl() {
        super(Coordination.class);
    }

}
