package com.ensah.core.services.impl;

import com.ensah.core.services.IJournalisationEvenementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IJournalisationEvenementsDao;

@Service
@Transactional
public class JournalisationEvenementsServiceImpl implements IJournalisationEvenementsService {
	@Autowired
	private IJournalisationEvenementsDao journalisationEvenementsDao;

}
