package com.ensah.core.bo;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Absence {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idAbsence;

   private java.util.Date dateHeureDebutAbsence;

   private java.util.Date dateHeureFinAbsence;

   private int etat;

   private String typeSaisie;

   @ManyToMany
   @JoinTable(name="Absence_PieceJustificative", 
		   	  joinColumns = @JoinColumn(name="idAbsence"),
		   	  inverseJoinColumns = @JoinColumn(name="idPieceJustificative")
		   )
   public java.util.Collection<PieceJustificative> pieceJustificative;
   
   @ManyToOne
   @JoinColumn(name="idInscription")   
   public Inscription inscription;

   @ManyToOne
   @JoinColumn(name="idTypeSeance")
   public TypeSeance typeSeance;

   @ManyToOne
   @JoinColumn(name="idEnseignat")
   public Enseignant observateur;
   
   
//   /** @pdGenerated default getter */
//   public java.util.Collection<PieceJustificative> getPieceJustificative() {
//      if (pieceJustificative == null)
//         pieceJustificative = new java.util.HashSet<PieceJustificative>();
//      return pieceJustificative;
//   }
//   
//   /** @pdGenerated default iterator getter */
//   public java.util.Iterator getIteratorPieceJustificative() {
//      if (pieceJustificative == null)
//         pieceJustificative = new java.util.HashSet<PieceJustificative>();
//      return pieceJustificative.iterator();
//   }
//   
//   /** @pdGenerated default setter
//     * @param newPieceJustificative */
//   public void setPieceJustificative(java.util.Collection<PieceJustificative> newPieceJustificative) {
//      removeAllPieceJustificative();
//      for (java.util.Iterator iter = newPieceJustificative.iterator(); iter.hasNext();)
//         addPieceJustificative((PieceJustificative)iter.next());
//   }
//   
//   /** @pdGenerated default add
//     * @param newPieceJustificative */
//   public void addPieceJustificative(PieceJustificative newPieceJustificative) {
//      if (newPieceJustificative == null)
//         return;
//      if (this.pieceJustificative == null)
//         this.pieceJustificative = new java.util.HashSet<PieceJustificative>();
//      if (!this.pieceJustificative.contains(newPieceJustificative))
//      {
//         this.pieceJustificative.add(newPieceJustificative);
//         newPieceJustificative.addAbsence(this);      
//      }
//   }
//   
//   /** @pdGenerated default remove
//     * @param oldPieceJustificative */
//   public void removePieceJustificative(PieceJustificative oldPieceJustificative) {
//      if (oldPieceJustificative == null)
//         return;
//      if (this.pieceJustificative != null)
//         if (this.pieceJustificative.contains(oldPieceJustificative))
//         {
//            this.pieceJustificative.remove(oldPieceJustificative);
//            oldPieceJustificative.removeAbsence(this);
//         }
//   }
//   
//   /** @pdGenerated default removeAll */
//   public void removeAllPieceJustificative() {
//      if (pieceJustificative != null)
//      {
//         PieceJustificative oldPieceJustificative;
//         for (java.util.Iterator iter = getIteratorPieceJustificative(); iter.hasNext();)
//         {
//            oldPieceJustificative = (PieceJustificative)iter.next();
//            iter.remove();
//            oldPieceJustificative.removeAbsence(this);
//         }
//      }
//   }
//   /** @pdGenerated default parent getter */
//   public Inscription getInscription() {
//      return inscription;
//   }
//   
//   /** @pdGenerated default parent setter
//     * @param newInscription */
//   public void setInscription(Inscription newInscription) {
//      if (this.inscription == null || !this.inscription.equals(newInscription))
//      {
//         if (this.inscription != null)
//         {
//            Inscription oldInscription = this.inscription;
//            this.inscription = null;
//            oldInscription.removeAbsences(this);
//         }
//         if (newInscription != null)
//         {
//            this.inscription = newInscription;
//            this.inscription.addAbsences(this);
//         }
//      }
//   }
//   /** @pdGenerated default parent getter */
//   public TypeSeance getTypeSeance() {
//      return typeSeance;
//   }
//   
//   /** @pdGenerated default parent setter
//     * @param newTypeSeance */
//   public void setTypeSeance(TypeSeance newTypeSeance) {
//      if (this.typeSeance == null || !this.typeSeance.equals(newTypeSeance))
//      {
//         if (this.typeSeance != null)
//         {
//            TypeSeance oldTypeSeance = this.typeSeance;
//            this.typeSeance = null;
//            oldTypeSeance.removeAbsences(this);
//         }
//         if (newTypeSeance != null)
//         {
//            this.typeSeance = newTypeSeance;
//            this.typeSeance.addAbsences(this);
//         }
//      }
//   }
//   /** @pdGenerated default parent getter */
//   public Enseignant getObservateur() {
//      return observateur;
//   }
//   
//   /** @pdGenerated default parent setter
//     * @param newEnseignant */
//   public void setObservateur(Enseignant newEnseignant) {
//      if (this.observateur == null || !this.observateur.equals(newEnseignant))
//      {
//         if (this.observateur != null)
//         {
//            Enseignant oldEnseignant = this.observateur;
//            this.observateur = null;
//            oldEnseignant.removeAbsencesMarquees(this);
//         }
//         if (newEnseignant != null)
//         {
//            this.observateur = newEnseignant;
//            this.observateur.addAbsencesMarquees(this);
//         }
//      }
//   }

}