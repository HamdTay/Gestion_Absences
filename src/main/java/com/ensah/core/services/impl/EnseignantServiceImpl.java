package com.ensah.core.services.impl;

import java.util.List;
import com.ensah.core.bo.Enseignant;
import com.ensah.core.services.IEnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IEnseignantDao;

@Service
@Transactional
public class EnseignantServiceImpl implements IEnseignantService {

	@Autowired
	private IEnseignantDao enseignantDao;

	public void addEnseignant(Enseignant pEnseignant) {
		enseignantDao.create(pEnseignant);

	}

	public Enseignant getEnseignantById(Long id) {
		return enseignantDao.findById(id);

	}

	public List<Enseignant> getAllEnseignants() {
		return enseignantDao.getAll();
	}

	public void updateEnseignant(Enseignant pEnseignant) {
		enseignantDao.update(pEnseignant);

	}

	public void deleteEnseignant(Long id) {
		enseignantDao.delete(id);

	}
}
