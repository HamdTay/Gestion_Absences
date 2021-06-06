package com.ensah.core.bo;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Matiere {
   public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idMatiere;

   private String nom;

   private String code;
   
   @ManyToOne
   @JoinColumn(name="idModule")
   public Module module;
   
   
   /** @pdGenerated default parent getter */
   public Module getModule() {
      return module;
   }
   
   /** @pdGenerated default parent setter
     * @param newModule */
   public void setModule(Module newModule) {
      if (this.module == null || !this.module.equals(newModule))
      {
         if (this.module != null)
         {
            Module oldModule = this.module;
            this.module = null;
            oldModule.removeMatieres(this);
         }
         if (newModule != null)
         {
            this.module = newModule;
            this.module.addMatieres(this);
         }
      }
   }

}