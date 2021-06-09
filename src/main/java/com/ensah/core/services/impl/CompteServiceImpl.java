package com.ensah.core.services.impl;

import com.ensah.core.services.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.ICompteDao;

@Service
@Transactional
public class CompteServiceImpl implements ICompteService {
	@Autowired
	private ICompteDao compteDao;
}
