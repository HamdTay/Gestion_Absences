package com.ensah.core.services.impl;

import java.util.List;

import com.ensah.core.services.ICadreAdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.bo.CadreAdministrateur;
import com.ensah.core.dao.ICadreAdministrateurDao;


@Service
@Transactional
public class CadreAdministrateurServiceImpl implements ICadreAdministrateurService {
	
	@Autowired
	private ICadreAdministrateurDao CadreAdministrateurDao;
	
	public void addCadreAdministrateur(CadreAdministrateur cAdministrateur) {
		CadreAdministrateurDao.create(cAdministrateur);
	}
	
	public void updateCadreAdministrateur(CadreAdministrateur cAdministrateur) {
		CadreAdministrateurDao.update(cAdministrateur);
	}
	
	public List<CadreAdministrateur> getAllCadresAdministrateur(){
		return CadreAdministrateurDao.getAll();
	}
	
	public void deleteCadreAdministrateur(Long id) {
		CadreAdministrateurDao.delete(id);
	}
	
	public CadreAdministrateur getCadreAdministrateurById(Long id) {
		return CadreAdministrateurDao.findById(id);
	}
	
}
