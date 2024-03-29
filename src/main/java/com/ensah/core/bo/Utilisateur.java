package com.ensah.core.bo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idUtilisateur;
   
   
   private String nom;

   private String prenom;
   
//   @NotBlank(message = "This field is required")
//   @Pattern(regexp = "^[A-Z]{2}[0-9]{8}", message = "The National ID must be 2 upper letters followed by  8 digits")
   private String cin;
   
//   @Email(message = "Enter a valid email")
//   @NotBlank(message = "This field is required")
   @Column(unique=true)
   private String email;

//   @NotBlank(message = "This field is required")
//   @Pattern(regexp = "^[0-9]{9}", message = "A phone number must be 9 digits long.")
   private String telephone;

   private String nomArabe;

   private String prenomArabe;

   private String photo;

   @OneToMany(mappedBy="proprietaire", cascade=CascadeType.ALL, targetEntity = Compte.class)
   public java.util.Collection<Compte> comptes;
   
   

   public java.util.Collection<Compte> getComptes() {
      if (comptes == null)
         comptes = new java.util.HashSet<Compte>();
      return comptes;
   }
   

   public java.util.Iterator getIteratorComptes() {
      if (comptes == null)
         comptes = new java.util.HashSet<Compte>();
      return comptes.iterator();
   }
   


   public void setComptes(java.util.Collection<Compte> newComptes) {
      removeAllComptes();
      for (java.util.Iterator iter = newComptes.iterator(); iter.hasNext();)
         addComptes((Compte)iter.next());
   }
   


   public void addComptes(Compte newCompte) {
      if (newCompte == null)
         return;
      if (this.comptes == null)
         this.comptes = new java.util.HashSet<Compte>();
      if (!this.comptes.contains(newCompte))
      {
         this.comptes.add(newCompte);
         newCompte.setProprietaire(this);      
      }
   }
   


   public void removeComptes(Compte oldCompte) {
      if (oldCompte == null)
         return;
      if (this.comptes != null)
         if (this.comptes.contains(oldCompte))
         {
            this.comptes.remove(oldCompte);
            oldCompte.setProprietaire((Utilisateur)null);
         }
   }
   


   public void removeAllComptes() {
      if (comptes != null)
      {
         Compte oldCompte;
         for (java.util.Iterator iter = getIteratorComptes(); iter.hasNext();)
         {
            oldCompte = (Compte)iter.next();
            iter.remove();
            oldCompte.setProprietaire((Utilisateur)null);
         }
      }
   }

}
