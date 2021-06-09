package com.ensah.core.services.impl;

import com.ensah.core.services.INiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.INiveauDao;

@Service
@Transactional
public class NiveauServiceImpl implements INiveauService {
	@Autowired
	private INiveauDao niveauDao;
}
