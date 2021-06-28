package com.ensah.core.dao.Impl;


import org.springframework.stereotype.Repository;

import com.ensah.core.bo.BlockIP;
import com.ensah.core.dao.IBlockIPDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

@Repository
public class BlockIPDaoImpl extends HibernateSpringGenericDaoImpl<BlockIP, Long> implements IBlockIPDao{

	public BlockIPDaoImpl() {
		super(BlockIP.class);
		// TODO Auto-generated constructor stub
	}

}
