package com.ensah.core.services;

import java.util.List;

import com.ensah.core.bo.JournalisationEvenements;

public interface IJournalisationEvenementsService {
	
	public void addLog(String Login, String ip,String Type, String Criticite ,String Detail);
	public String removeLog(Long accountId);
	public List<JournalisationEvenements> getLoginLogs(Long id);
	public List<JournalisationEvenements> getAllLogsOfUser(Long id);
}
