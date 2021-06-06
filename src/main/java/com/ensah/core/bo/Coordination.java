package com.ensah.core.bo;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coordination {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)   
   private int idCoordination;

   private java.util.Date dateDebut;

   private java.util.Date dateFin;
   
   @ManyToOne
   @JoinColumn(name="idUtilisateur")
   public Enseignant coordonateur;

}