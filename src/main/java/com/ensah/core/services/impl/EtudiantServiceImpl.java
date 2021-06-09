package com.ensah.core.services.impl;

import com.ensah.core.bo.Etudiant;
import com.ensah.core.services.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IEtudiantDao;

import java.util.List;

@Service
@Transactional
public class EtudiantServiceImpl implements IEtudiantService {

	@Autowired
	private IEtudiantDao etudiantDao;

	public void addEtudiant(Etudiant pEtudiant) {
		etudiantDao.create(pEtudiant);

	}

	public Etudiant getEtudiantById(Long id) {
		return etudiantDao.findById(id);

	}

	public List<Etudiant> getAllEtudiants() {
		return etudiantDao.getAll();
	}

	public void updateEtudiant(Etudiant pEtudiant) {
		etudiantDao.update(pEtudiant);

	}

	public void deleteEtudiant(Long id) {
		etudiantDao.delete(id);

	}
}
