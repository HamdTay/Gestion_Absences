package com.ensah.core.bo;

import java.util.*;

import javax.persistence.Entity;

@Entity
public class CadreAdministrateur extends Utilisateur {

   private String grade;

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

}