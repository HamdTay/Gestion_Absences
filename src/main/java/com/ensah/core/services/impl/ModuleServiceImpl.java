package com.ensah.core.services.impl;

import com.ensah.core.services.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IModuleDao;

@Service
@Transactional
public class ModuleServiceImpl implements IModuleService {
	@Autowired
	private IModuleDao moduleDao;
}
