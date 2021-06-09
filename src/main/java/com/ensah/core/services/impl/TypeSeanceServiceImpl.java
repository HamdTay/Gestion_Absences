package com.ensah.core.services.impl;

import com.ensah.core.bo.TypeSeance;
import com.ensah.core.services.ITypeSeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.ITypeSeanceDao;

import java.util.List;

@Service
@Transactional
public class TypeSeanceServiceImpl implements ITypeSeanceService {

	@Autowired
	private ITypeSeanceDao typeSeanceDao;

	public void addTypeSeance(TypeSeance pTypeSeance) {
		typeSeanceDao.create(pTypeSeance);

	}

	public TypeSeance getTypeSeanceById(Long id) {
		return typeSeanceDao.findById(id);

	}

	public List<TypeSeance> getAllTypeSeances() {
		return typeSeanceDao.getAll();
	}

	public void updateTypeSeance(TypeSeance pTypeSeance) {
		typeSeanceDao.update(pTypeSeance);

	}

	public void deleteTypeSeance(Long id) {
		typeSeanceDao.delete(id);

	}

}
