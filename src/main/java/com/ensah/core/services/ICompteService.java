package com.ensah.core.services;



import java.util.List;

import com.ensah.core.bo.Compte;
import com.ensah.core.bo.Role;


public interface ICompteService {
	
	public List<Role> getAllRoles();
	
	public List<Compte> getAllAccounts();

	public String createAccount(Long idRole, Long idPerson);
	
	public void deleteAccount();
	
	public void updateAccount(String Login, String Password, Long roleId, Long idCompte);
	
	public void changePassword(Long id, String password);
	
	public String resetPassword(Long id);
	
	public void activate(String username);
	
	public void deactivate(String username);


	//public ExcelExporter prepareCompteExport(List<Compte> comptes) ;
}
