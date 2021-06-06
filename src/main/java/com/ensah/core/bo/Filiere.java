package com.ensah.core.bo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Filiere {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY) 
   private String idFiliere;

   private String titreFiliere;

   private String codeFiliere;

   private int anneeaccreditation;

   private int anneeFinaccreditation;
   
   @OneToMany(mappedBy="filiere", cascade=CascadeType.ALL)
   public java.util.Collection<Niveau> niveaux;

   @OneToMany(cascade=CascadeType.ALL)
   @JoinColumn(name="idUtilisateur")
   public java.util.Collection<Coordination> periodeCoordination;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Niveau> getNiveaux() {
      if (niveaux == null)
         niveaux = new java.util.HashSet<Niveau>();
      return niveaux;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNiveaux() {
      if (niveaux == null)
         niveaux = new java.util.HashSet<Niveau>();
      return niveaux.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNiveaux */
   public void setNiveaux(java.util.Collection<Niveau> newNiveaux) {
      removeAllNiveaux();
      for (java.util.Iterator iter = newNiveaux.iterator(); iter.hasNext();)
         addNiveaux((Niveau)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNiveau */
   public void addNiveaux(Niveau newNiveau) {
      if (newNiveau == null)
         return;
      if (this.niveaux == null)
         this.niveaux = new java.util.HashSet<Niveau>();
      if (!this.niveaux.contains(newNiveau))
      {
         this.niveaux.add(newNiveau);
         newNiveau.setFiliere(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldNiveau */
   public void removeNiveaux(Niveau oldNiveau) {
      if (oldNiveau == null)
         return;
      if (this.niveaux != null)
         if (this.niveaux.contains(oldNiveau))
         {
            this.niveaux.remove(oldNiveau);
            oldNiveau.setFiliere((Filiere)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNiveaux() {
      if (niveaux != null)
      {
         Niveau oldNiveau;
         for (java.util.Iterator iter = getIteratorNiveaux(); iter.hasNext();)
         {
            oldNiveau = (Niveau)iter.next();
            iter.remove();
            oldNiveau.setFiliere((Filiere)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Coordination> getPeriodeCoordination() {
      if (periodeCoordination == null)
         periodeCoordination = new java.util.HashSet<Coordination>();
      return periodeCoordination;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPeriodeCoordination() {
      if (periodeCoordination == null)
         periodeCoordination = new java.util.HashSet<Coordination>();
      return periodeCoordination.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPeriodeCoordination */
   public void setPeriodeCoordination(java.util.Collection<Coordination> newPeriodeCoordination) {
      removeAllPeriodeCoordination();
      for (java.util.Iterator iter = newPeriodeCoordination.iterator(); iter.hasNext();)
         addPeriodeCoordination((Coordination)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCoordination */
   public void addPeriodeCoordination(Coordination newCoordination) {
      if (newCoordination == null)
         return;
      if (this.periodeCoordination == null)
         this.periodeCoordination = new java.util.HashSet<Coordination>();
      if (!this.periodeCoordination.contains(newCoordination))
         this.periodeCoordination.add(newCoordination);
   }
   
   /** @pdGenerated default remove
     * @param oldCoordination */
   public void removePeriodeCoordination(Coordination oldCoordination) {
      if (oldCoordination == null)
         return;
      if (this.periodeCoordination != null)
         if (this.periodeCoordination.contains(oldCoordination))
            this.periodeCoordination.remove(oldCoordination);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPeriodeCoordination() {
      if (periodeCoordination != null)
         periodeCoordination.clear();
   }

}