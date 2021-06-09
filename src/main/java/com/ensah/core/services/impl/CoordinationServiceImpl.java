package com.ensah.core.services.impl;

import com.ensah.core.services.ICoordinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.ICoordinationDao;

@Service
@Transactional
public class CoordinationServiceImpl implements ICoordinationService {

	@Autowired
	private ICoordinationDao coordinationDao;

}
