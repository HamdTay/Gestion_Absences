package com.ensah.core.dao.impl;

import com.ensah.core.bo.TypeSeance;
import com.ensah.core.dao.ITypeSeanceDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class TypeSeanceDaoImpl extends HibernateSpringGenericDaoImpl<TypeSeance, Long> implements ITypeSeanceDao {

    public TypeSeanceDaoImpl() {
        super(TypeSeance.class);
    }

}
