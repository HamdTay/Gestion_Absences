package com.ensah.core.services.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.bo.JournalisationEvenements;
import com.ensah.core.dao.ICompteDao;
import com.ensah.core.dao.IJournalisationEvenementsDao;
import com.ensah.core.services.IJournalisationEvenementsService;

@Service
@Transactional
public class JournalisationEvenementsServiceImpl implements IJournalisationEvenementsService {

	@Autowired
	IJournalisationEvenementsDao logDao; 
	@Autowired
	
	ICompteDao accountDao;
	@Override
	public String removeLog(Long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLog(String Login, String ip, String Type, String Criticite ,String Detail) {
		
		JournalisationEvenements log = new JournalisationEvenements();
		log.setAdresseIP(ip);
		log.setTypeEvenement(Type);
		log.setCompte(accountDao.findByUserName(Login));
		if(Criticite == null) {
			log.setCriticite("TRACE");
		}else {
			log.setCriticite(Criticite);
		}
		log.setDateHeure(new Date());
		log.setDetails(Detail);
		logDao.create(log);
		System.out.println("Log created");
	}

	@Override
	public List<JournalisationEvenements> getLoginLogs(Long id) {
		List<JournalisationEvenements> LOG = new ArrayList<>();
		
		List<JournalisationEvenements> LG = logDao.getEntityByColValue("JournalisationEvenements", "idCompte", String.valueOf(id));
		
		for(JournalisationEvenements l : LG) {
			if(l.getTypeEvenement().toLowerCase().equals("login")) {
				LOG.add(l);
			}
		}		
		
		return LOG;
	}

	@Override
	public List<JournalisationEvenements> getAllLogsOfUser(Long id) {
		return logDao.getEntityByColValue("JournalisationEvenements", "idCompte", String.valueOf(id));
	}
	
}
