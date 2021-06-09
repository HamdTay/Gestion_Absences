package com.ensah.core.dao.impl;

import com.ensah.core.bo.Role;
import com.ensah.core.dao.IRoleDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends HibernateSpringGenericDaoImpl<Role, Long> implements IRoleDao {

    public RoleDaoImpl() {
        super(Role.class);
    }

}