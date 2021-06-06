package com.ensah.core.bo;


import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Role {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idRole;


   private String nomRole;
   
   @OneToMany(mappedBy="role", cascade=CascadeType.ALL)
   public java.util.Collection<Compte> comptes;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Compte> getComptes() {
      if (comptes == null)
         comptes = new java.util.HashSet<Compte>();
      return comptes;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorComptes() {
      if (comptes == null)
         comptes = new java.util.HashSet<Compte>();
      return comptes.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newComptes */
   public void setComptes(java.util.Collection<Compte> newComptes) {
      removeAllComptes();
      for (java.util.Iterator iter = newComptes.iterator(); iter.hasNext();)
         addComptes((Compte)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCompte */
   public void addComptes(Compte newCompte) {
      if (newCompte == null)
         return;
      if (this.comptes == null)
         this.comptes = new java.util.HashSet<Compte>();
      if (!this.comptes.contains(newCompte))
      {
         this.comptes.add(newCompte);
         newCompte.setRole(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCompte */
   public void removeComptes(Compte oldCompte) {
      if (oldCompte == null)
         return;
      if (this.comptes != null)
         if (this.comptes.contains(oldCompte))
         {
            this.comptes.remove(oldCompte);
            oldCompte.setRole((Role)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComptes() {
      if (comptes != null)
      {
         Compte oldCompte;
         for (java.util.Iterator iter = getIteratorComptes(); iter.hasNext();)
         {
            oldCompte = (Compte)iter.next();
            iter.remove();
            oldCompte.setRole((Role)null);
         }
      }
   }

}