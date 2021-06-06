package com.ensah.core.dao;

import com.ensah.core.bo.Compte;

public class UserPrincipal {

	private Compte user;

	public UserPrincipal(Compte user) {
		super();
		this.user = user;
	}

	public Compte getUser() {
		return user;
	}

	public void setUser(Compte user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserPrincipal [user=" + user + "]";
	}
	
	
	
	
}
