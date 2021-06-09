package com.ensah.core.services.impl;

import com.ensah.core.services.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IInscriptionDao;

@Service
@Transactional
public class InscriptionServiceImpl implements IInscriptionService {
	@Autowired
	private IInscriptionDao inscriptionDao;
}
