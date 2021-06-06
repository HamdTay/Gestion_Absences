package com.ensah.core.bo;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Enseignant extends Utilisateur {

   private String specialite;
   
   @OneToMany(mappedBy="observateur", cascade=CascadeType.ALL,  targetEntity = Absence.class)
   public java.util.Collection<Absence> absencesMarquees;
   
   

//   public java.util.Collection<Absence> getAbsencesMarquees() {
//      if (absencesMarquees == null)
//         absencesMarquees = new java.util.HashSet<Absence>();
//      return absencesMarquees;
//   }
//   
//
//   public java.util.Iterator getIteratorAbsencesMarquees() {
//      if (absencesMarquees == null)
//         absencesMarquees = new java.util.HashSet<Absence>();
//      return absencesMarquees.iterator();
//   }
//   
//
//
//   public void setAbsencesMarquees(java.util.Collection<Absence> newAbsencesMarquees) {
//      removeAllAbsencesMarquees();
//      for (java.util.Iterator iter = newAbsencesMarquees.iterator(); iter.hasNext();)
//         addAbsencesMarquees((Absence)iter.next());
//   }
//   
//   /** @pdGenerated default add
//     * @param newAbsence */
//   public void addAbsencesMarquees(Absence newAbsence) {
//      if (newAbsence == null)
//         return;
//      if (this.absencesMarquees == null)
//         this.absencesMarquees = new java.util.HashSet<Absence>();
//      if (!this.absencesMarquees.contains(newAbsence))
//      {
//         this.absencesMarquees.add(newAbsence);
//         newAbsence.setObservateur(this);      
//      }
//   }
//   
//   /** @pdGenerated default remove
//     * @param oldAbsence */
//   public void removeAbsencesMarquees(Absence oldAbsence) {
//      if (oldAbsence == null)
//         return;
//      if (this.absencesMarquees != null)
//         if (this.absencesMarquees.contains(oldAbsence))
//         {
//            this.absencesMarquees.remove(oldAbsence);
//            oldAbsence.setObservateur((Enseignant)null);
//         }
//   }
//   
//   /** @pdGenerated default removeAll */
//   public void removeAllAbsencesMarquees() {
//      if (absencesMarquees != null)
//      {
//         Absence oldAbsence;
//         for (java.util.Iterator iter = getIteratorAbsencesMarquees(); iter.hasNext();)
//         {
//            oldAbsence = (Absence)iter.next();
//            iter.remove();
//            oldAbsence.setObservateur((Enseignant)null);
//         }
//      }
//   }

}