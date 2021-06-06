package com.ensah.core.bo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pieceJustificative")
public class PieceJustificative {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idPieceJustificative;

   private String cheminFichier;

   private String intitule;

   private java.util.Date dateLivraison;

   private int etat;

   private String source;
   
   @ManyToMany
   @JoinTable(name="Absence_PieceJustificative", 
		   	  joinColumns = @JoinColumn(name="idPieceJustificative"),
		   	  inverseJoinColumns = @JoinColumn(name="idAbsence")
		   )
   public java.util.Collection<Absence> absence;
   
   
//   /** @pdGenerated default getter */
//   public java.util.Collection<Absence> getAbsence() {
//      if (absence == null)
//         absence = new java.util.HashSet<Absence>();
//      return absence;
//   }
//   
//   /** @pdGenerated default iterator getter */
//   public java.util.Iterator getIteratorAbsence() {
//      if (absence == null)
//         absence = new java.util.HashSet<Absence>();
//      return absence.iterator();
//   }
//   
//   /** @pdGenerated default setter
//     * @param newAbsence */
//   public void setAbsence(java.util.Collection<Absence> newAbsence) {
//      removeAllAbsence();
//      for (java.util.Iterator iter = newAbsence.iterator(); iter.hasNext();)
//         addAbsence((Absence)iter.next());
//   }
//   
//   /** @pdGenerated default add
//     * @param newAbsence */
//   public void addAbsence(Absence newAbsence) {
//      if (newAbsence == null)
//         return;
//      if (this.absence == null)
//         this.absence = new java.util.HashSet<Absence>();
//      if (!this.absence.contains(newAbsence))
//      {
//         this.absence.add(newAbsence);
//         newAbsence.addPieceJustificative(this);      
//      }
//   }
//   
//   /** @pdGenerated default remove
//     * @param oldAbsence */
//   public void removeAbsence(Absence oldAbsence) {
//      if (oldAbsence == null)
//         return;
//      if (this.absence != null)
//         if (this.absence.contains(oldAbsence))
//         {
//            this.absence.remove(oldAbsence);
//            oldAbsence.removePieceJustificative(this);
//         }
//   }
//   
//   /** @pdGenerated default removeAll */
//   public void removeAllAbsence() {
//      if (absence != null)
//      {
//         Absence oldAbsence;
//         for (java.util.Iterator iter = getIteratorAbsence(); iter.hasNext();)
//         {
//            oldAbsence = (Absence)iter.next();
//            iter.remove();
//            oldAbsence.removePieceJustificative(this);
//         }
//      }
//   }

}