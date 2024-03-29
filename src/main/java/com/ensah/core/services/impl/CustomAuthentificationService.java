package com.ensah.core.services.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.ensah.core.bo.UserPrincipal;
//import com.ensah.core.bo.UserAccount;
//import com.ensah.core.dao.IUserDao;

/**
 * 
 * Cette classe contient le gestionnaire d'authentification personnalisé
 *
 */


@Service
public class CustomAuthentificationService implements UserDetailsService {

//	@Autowired
//	private IUserDao userRepository;   //le DAO qui gère les utilisateurs
//	
//	/** Utilisé pour la journalisation */
//	private Logger LOGGER = Logger.getLogger(getClass().getName());


	public CustomAuthentificationService() {
	}

	
	//Implémentation de la méthode de vérification de l'existence d'un compte utilisateur
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		
		
//		UserAccount user = null;
//		
//		//On récupère le compte avec son username
//		user = userRepository.findByUsername(username);
//		
//		//Si il n'existe pas
//		if (user == null) {
//			
//			//On écrit dans le journal un message de warning 
//			LOGGER.warn("Utilisateur "+ username +" introuvable ");
//			
//			//Cette exception iforme Spring Security que l'utilisateur n'existe pas
//			//et donc il n a pas le droit de se connecter
//			throw new UsernameNotFoundException(username);
//		}
//
//		user.setLastAccessDate(new Date());
//		
//		//Embaler l'objet de type UserAccount dans un objet de type UserPrincipal qui lui même
//		// implémente UserDetails 
		return null;
	}

}
