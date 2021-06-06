package com.ensah.core.bo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity
public class Etudiant extends Utilisateur {
   @Column(unique = true)
   private String cne;


   private java.util.Date dateNaissance;
   
   //Relational to inscription
   @OneToMany(mappedBy="utilisateur", cascade=CascadeType.ALL)
   public java.util.Collection<Inscription> inscriptions;
   
   

   public java.util.Collection<Inscription> getInscriptions() {
      if (inscriptions == null)
         inscriptions = new java.util.HashSet<Inscription>();
      return inscriptions;
   }
   

   public java.util.Iterator getIteratorInscriptions() {
      if (inscriptions == null)
         inscriptions = new java.util.HashSet<Inscription>();
      return inscriptions.iterator();
   }
   


   public void setInscriptions(java.util.Collection<Inscription> newInscriptions) {
      removeAllInscriptions();
      for (java.util.Iterator iter = newInscriptions.iterator(); iter.hasNext();)
         addInscriptions((Inscription)iter.next());
   }
   


   public void addInscriptions(Inscription newInscription) {
      if (newInscription == null)
         return;
      if (this.inscriptions == null)
         this.inscriptions = new java.util.HashSet<Inscription>();
      if (!this.inscriptions.contains(newInscription))
      {
         this.inscriptions.add(newInscription);
         newInscription.setEtudiant(this);      
      }
   }
   


   public void removeInscriptions(Inscription oldInscription) {
      if (oldInscription == null)
         return;
      if (this.inscriptions != null)
         if (this.inscriptions.contains(oldInscription))
         {
            this.inscriptions.remove(oldInscription);
            oldInscription.setEtudiant((Etudiant)null);
         }
   }
   


   public void removeAllInscriptions() {
      if (inscriptions != null)
      {
         Inscription oldInscription;
         for (java.util.Iterator iter = getIteratorInscriptions(); iter.hasNext();)
         {
            oldInscription = (Inscription)iter.next();
            iter.remove();
            oldInscription.setEtudiant((Etudiant)null);
         }
      }
   }


public String getCne() {
	return cne;
}


public void setCne(String cne) {
	this.cne = cne;
}


public java.util.Date getDateNaissance() {
	return dateNaissance;
}


public void setDateNaissance(java.util.Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}

}