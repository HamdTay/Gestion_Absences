package com.ensah.core.services;

import java.util.List;

import com.ensah.core.bo.CadreAdministrateur;

public interface ICadreAdministrateurService {
	
		public void addCadreAdministrateur(CadreAdministrateur cAdministrateur);
		
		public void updateCadreAdministrateur(CadreAdministrateur cAdministrateur);
		
		public List<CadreAdministrateur> getAllCadresAdministrateur();
		
		public void deleteCadreAdministrateur(Long id);
		
		public CadreAdministrateur getCadreAdministrateurById(Long id);
		
}
