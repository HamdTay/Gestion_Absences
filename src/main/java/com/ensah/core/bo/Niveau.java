package com.ensah.core.bo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Niveau {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY) 
   private int idNiveau;

   private String alias;

   private String titre;
   
   @OneToMany(mappedBy="niveau", cascade=CascadeType.ALL, targetEntity = Module.class)
   public java.util.Collection<Module> modules;
   
   @OneToMany(mappedBy="niveau", cascade=CascadeType.ALL,  targetEntity = Inscription.class)
   public java.util.Collection<Inscription> Inscriptions;
   
   @ManyToOne
   @JoinColumn(name="idFiliere")
   public Filiere filiere;
   
   
//   /** @pdGenerated default getter */
//   public java.util.Collection<Module> getModules() {
//      if (modules == null)
//         modules = new java.util.HashSet<Module>();
//      return modules;
//   }
//   
//   /** @pdGenerated default iterator getter */
//   public java.util.Iterator getIteratorModules() {
//      if (modules == null)
//         modules = new java.util.HashSet<Module>();
//      return modules.iterator();
//   }
//   
//   /** @pdGenerated default setter
//     * @param newModules */
//   public void setModules(java.util.Collection<Module> newModules) {
//      removeAllModules();
//      for (java.util.Iterator iter = newModules.iterator(); iter.hasNext();)
//         addModules((Module)iter.next());
//   }
//   
//   /** @pdGenerated default add
//     * @param newModule */
//   public void addModules(Module newModule) {
//      if (newModule == null)
//         return;
//      if (this.modules == null)
//         this.modules = new java.util.HashSet<Module>();
//      if (!this.modules.contains(newModule))
//      {
//         this.modules.add(newModule);
//         newModule.setNiveau(this);      
//      }
//   }
//   
//   /** @pdGenerated default remove
//     * @param oldModule */
//   public void removeModules(Module oldModule) {
//      if (oldModule == null)
//         return;
//      if (this.modules != null)
//         if (this.modules.contains(oldModule))
//         {
//            this.modules.remove(oldModule);
//            oldModule.setNiveau((Niveau)null);
//         }
//   }
//   
//   /** @pdGenerated default removeAll */
//   public void removeAllModules() {
//      if (modules != null)
//      {
//         Module oldModule;
//         for (java.util.Iterator iter = getIteratorModules(); iter.hasNext();)
//         {
//            oldModule = (Module)iter.next();
//            iter.remove();
//            oldModule.setNiveau((Niveau)null);
//         }
//      }
//   }
//   /** @pdGenerated default getter */
//   public java.util.Collection<Inscription> getNiveau() {
//      if (niveau == null)
//         niveau = new java.util.HashSet<Inscription>();
//      return niveau;
//   }
//   
//   /** @pdGenerated default iterator getter */
//   public java.util.Iterator getIteratorNiveau() {
//      if (niveau == null)
//         niveau = new java.util.HashSet<Inscription>();
//      return niveau.iterator();
//   }
//   
//   /** @pdGenerated default setter
//     * @param newNiveau */
//   public void setNiveau(java.util.Collection<Inscription> newNiveau) {
//      removeAllNiveau();
//      for (java.util.Iterator iter = newNiveau.iterator(); iter.hasNext();)
//         addNiveau((Inscription)iter.next());
//   }
//   
//   /** @pdGenerated default add
//     * @param newInscription */
//   public void addNiveau(Inscription newInscription) {
//      if (newInscription == null)
//         return;
//      if (this.niveau == null)
//         this.niveau = new java.util.HashSet<Inscription>();
//      if (!this.niveau.contains(newInscription))
//      {
//         this.niveau.add(newInscription);
//         newInscription.setInscriptions(this);      
//      }
//   }
//   
//   /** @pdGenerated default remove
//     * @param oldInscription */
//   public void removeNiveau(Inscription oldInscription) {
//      if (oldInscription == null)
//         return;
//      if (this.niveau != null)
//         if (this.niveau.contains(oldInscription))
//         {
//            this.niveau.remove(oldInscription);
//            oldInscription.setInscriptions((Niveau)null);
//         }
//   }
//   
//   /** @pdGenerated default removeAll */
//   public void removeAllNiveau() {
//      if (niveau != null)
//      {
//         Inscription oldInscription;
//         for (java.util.Iterator iter = getIteratorNiveau(); iter.hasNext();)
//         {
//            oldInscription = (Inscription)iter.next();
//            iter.remove();
//            oldInscription.setInscriptions((Niveau)null);
//         }
//      }
//   }
//   /** @pdGenerated default parent getter */
//   public Filiere getFiliere() {
//      return filiere;
//   }
//   
//   /** @pdGenerated default parent setter
//     * @param newFiliere */
//   public void setFiliere(Filiere newFiliere) {
//      if (this.filiere == null || !this.filiere.equals(newFiliere))
//      {
//         if (this.filiere != null)
//         {
//            Filiere oldFiliere = this.filiere;
//            this.filiere = null;
//            oldFiliere.removeNiveaux(this);
//         }
//         if (newFiliere != null)
//         {
//            this.filiere = newFiliere;
//            this.filiere.addNiveaux(this);
//         }
//      }
//   }

}