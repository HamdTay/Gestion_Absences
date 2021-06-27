package com.ensah.core.services.Impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.transaction.annotation.Transactional;


import org.springframework.beans.factory.annotation.Autowired;

import com.ensah.core.bo.CadreAdministrateur;
import com.ensah.core.bo.Enseignant;
import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.Utilisateur;
import com.ensah.core.dao.IUtilisateurDao;
import com.ensah.core.exceptions.EntityNotUnique;
import com.ensah.core.services.IUtilisateurService;

import org.springframework.stereotype.Service;


@Service
@Transactional
public class UtilisateurServiceImpl  implements IUtilisateurService{
	
	@Autowired
	private IUtilisateurDao userDao;

	@Override
	@Transactional
	public void addPerson(Utilisateur pPerson, int role) {
		
		System.out.println("inside utilisateur service");
		
		if(!userDao.checkIfEmailIsUnique(pPerson.getEmail())) {
			throw new EntityNotUnique(pPerson.getClass(), "email");
		}
		
		//si cne n'est pas unique
		if(!userDao.checkIfCINIsUnique(pPerson.getCin())) {
			System.err.println("inside service add person chek cin is unique");
			throw new EntityNotUnique(Utilisateur.class, "cin");
		}
		
		//si une etudiant a entréé un cne déja dans la base de donnée
		if(role == 3 && pPerson instanceof Etudiant) {
			Etudiant etud = (Etudiant)pPerson;
			
			if(!userDao.checkIfCNEIsUnique(etud.getCne())) {
				throw new EntityNotUnique(Etudiant.class, "cne");
			}
		}
		
		userDao.create(pPerson);
		
	}

	@Override
	public void updatePerson(Utilisateur pPerson, int role) {
		List<Utilisateur> pl = (List<Utilisateur>)userDao.getEntityByColValue("Utilisateur", "email", pPerson.getEmail());
		Utilisateur p = new Utilisateur();
		p.setCin("");
		Long id = null;
		if(pl != null && pl.size() > 0) {
			p = pl.get(0);
			id = p.getIdUtilisateur();
		}
		
		
		
		Utilisateur p1 = p;
		Long id1 = null;
		if(!p.getCin().equals(pPerson.getCin())) {
			List<Utilisateur> pl1 = (List<Utilisateur>)userDao.getEntityByColValue("Utilisateur", "cin", pPerson.getCin());			
			if(pl != null && pl.size() > 0) {
				p1 = pl1.get(0);
				id1 = p1.getIdUtilisateur();
			}
			System.out.println("inside ser cin ");
		}
				
		
		if(!userDao.checkIfEmailIsUnique(pPerson.getEmail())
			&& id != pPerson.getIdUtilisateur() && id != null) {
			throw new EntityNotUnique(pPerson.getClass(), "email");
		}
		
		//si cne n'est pas unique
		if(!userDao.checkIfCINIsUnique(pPerson.getCin())
				&& id1 != pPerson.getIdUtilisateur() && id1 != null) {
			System.err.println("inside service add person chek cin is unique");
			throw new EntityNotUnique(Utilisateur.class, "cin");
		}
		
		//si une etudiant a entréé un cne déja dans la base de donnée
		if(role == 3 && pPerson instanceof Etudiant) {
			Etudiant etud = (Etudiant)pPerson;
			
			List<Utilisateur>p2 = userDao.getEntityByColValue("Etudiant", "cne", etud.getCne());
			
			Long id2 = null;
			if(p2 != null && p2.size() > 0) {
				id2 = p2.get(0).getIdUtilisateur();
			}
			
			
			if(!userDao.checkIfCNEIsUnique(etud.getCne())
				&& id2 != etud.getIdUtilisateur() && id2 != null) {
				throw new EntityNotUnique(Etudiant.class, "cne");
			}
		}
		System.out.println("inside ser cin ");
		
		if(p.getCin().equals("")) {
			p =userDao.findById(pPerson.getIdUtilisateur());
		}
		
		p.setCin(pPerson.getCin());
		p.setEmail(pPerson.getEmail());
		p.setNom(pPerson.getNom());
		p.setNomArabe(pPerson.getNomArabe());
		p.setPrenom(pPerson.getPrenom());
		p.setPrenomArabe(pPerson.getPrenomArabe());
		p.setTelephone(pPerson.getTelephone());
		if(pPerson instanceof Etudiant ) {
			((Etudiant)p).setCne(((Etudiant)pPerson).getCne());
		}else if(pPerson instanceof CadreAdministrateur) {
			((CadreAdministrateur)p).setGrade(((CadreAdministrateur)pPerson).getGrade());			
		}else if(pPerson instanceof Enseignant) {
			((Enseignant)p).setSpecialite(((Enseignant)pPerson).getSpecialite());
		}
		
		
		//userDao.update(pPerson);
		
	}

	@Override
	public List<Utilisateur> getAllPersons() {
		return userDao.getAll();
	}

	@Override
	public void deletePerson(Long id) {
		
		if(!userDao.exists(id)){
			throw new EntityNotFoundException("L'id "+id+" de l'utilisateur ,n'est pas trouvé.");	
		}
		userDao.delete(id);
	}

	@Override
	public Utilisateur getPersonById(Long id) {
		return userDao.findById(id);
	}

	@Override
	public Utilisateur getPersonByCin(String cin) {

		List<Utilisateur> users =  userDao.getEntityByColValue("Utilisateur", "cin", cin);
		
		if(users != null && users.size() != 0) {
			return users.get(0);
		}
		
		return null;
	}


	
	
	
	
	
}
