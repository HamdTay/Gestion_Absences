package com.ensah.core.services.impl;

import com.ensah.core.services.IMatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IMatiereDao;

@Service
@Transactional
public class MatiereServiceImpl implements IMatiereService {
	@Autowired
	private IMatiereDao matiereDao;
}
