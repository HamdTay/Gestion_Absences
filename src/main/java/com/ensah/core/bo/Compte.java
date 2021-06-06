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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCompte;
    
    private int enabled;
    private int accountNotExpired;
    private int accountNotLocked;
    private int login;
    private int password;
    private boolean disconnectAccount;
    private boolean accepteDemandeAutorisationAbsence;
    private boolean affichePhoto;
    private boolean afficheEmail;
   
    @ManyToOne
    @JoinColumn(name="idRole")
    public Role role;
    
    @OneToMany(mappedBy="compte", cascade=CascadeType.ALL)
    public Collection<Notification> notifications;
    
    @OneToMany(mappedBy="expediteur", cascade=CascadeType.ALL)
    public Collection<Message> messagesEnvoyes;
    
    @OneToMany(mappedBy="destinataire", cascade=CascadeType.ALL)
    public Collection<Message> messagesReçus;
  
    
    @ManyToMany
    @JoinTable(
	   		name="Compte_Conversation", 
				joinColumns=@JoinColumn(name="idCompte"), 
				inverseJoinColumns=@JoinColumn(name="idConversation"))
    public java.util.Collection<Conversation> conversationReçues;
    
    
    @OneToMany(mappedBy="compte", cascade=CascadeType.ALL)
    public Collection<JournalisationEvenements> evenements;
    
    @ManyToOne
    @JoinColumn(name="idUtilisateur")
    public Utilisateur proprietaire;

    @OneToMany(mappedBy="createurConversation", cascade=CascadeType.ALL)
    public Collection<Conversation> conversationsCrees;
   
   /** @pdGenerated default parent getter */
   public Role getRole() {
      return role;
   }
   
   /** @pdGenerated default parent setter
     * @param newRole */
   public void setRole(Role newRole) {
      if (this.role == null || !this.role.equals(newRole))
      {
         if (this.role != null)
         {
            Role oldRole = this.role;
            this.role = null;
            oldRole.removeComptes(this);
         }
         if (newRole != null)
         {
            this.role = newRole;
            this.role.addComptes(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Notification> getNotifications() {
      if (notifications == null)
         notifications = new java.util.HashSet<Notification>();
      return notifications;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNotifications() {
      if (notifications == null)
         notifications = new java.util.HashSet<Notification>();
      return notifications.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNotifications */
   public void setNotifications(java.util.Collection<Notification> newNotifications) {
      removeAllNotifications();
      for (java.util.Iterator iter = newNotifications.iterator(); iter.hasNext();)
         addNotifications((Notification)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNotification */
   public void addNotifications(Notification newNotification) {
      if (newNotification == null)
         return;
      if (this.notifications == null)
         this.notifications = new java.util.HashSet<Notification>();
      if (!this.notifications.contains(newNotification))
      {
         this.notifications.add(newNotification);
         newNotification.setCompte(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldNotification */
   public void removeNotifications(Notification oldNotification) {
      if (oldNotification == null)
         return;
      if (this.notifications != null)
         if (this.notifications.contains(oldNotification))
         {
            this.notifications.remove(oldNotification);
            oldNotification.setCompte((Compte)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNotifications() {
      if (notifications != null)
      {
         Notification oldNotification;
         for (java.util.Iterator iter = getIteratorNotifications(); iter.hasNext();)
         {
            oldNotification = (Notification)iter.next();
            iter.remove();
            oldNotification.setCompte((Compte)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Message> getMessagesEnvoyes() {
      if (messagesEnvoyes == null)
         messagesEnvoyes = new java.util.HashSet<Message>();
      return messagesEnvoyes;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMessagesEnvoyes() {
      if (messagesEnvoyes == null)
         messagesEnvoyes = new java.util.HashSet<Message>();
      return messagesEnvoyes.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMessagesEnvoyes */
   public void setMessagesEnvoyes(java.util.Collection<Message> newMessagesEnvoyes) {
      removeAllMessagesEnvoyes();
      for (java.util.Iterator iter = newMessagesEnvoyes.iterator(); iter.hasNext();)
         addMessagesEnvoyes((Message)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMessage */
   public void addMessagesEnvoyes(Message newMessage) {
      if (newMessage == null)
         return;
      if (this.messagesEnvoyes == null)
         this.messagesEnvoyes = new java.util.HashSet<Message>();
      if (!this.messagesEnvoyes.contains(newMessage))
      {
         this.messagesEnvoyes.add(newMessage);
         newMessage.setExpediteur(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMessage */
   public void removeMessagesEnvoyes(Message oldMessage) {
      if (oldMessage == null)
         return;
      if (this.messagesEnvoyes != null)
         if (this.messagesEnvoyes.contains(oldMessage))
         {
            this.messagesEnvoyes.remove(oldMessage);
            oldMessage.setExpediteur((Compte)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMessagesEnvoyes() {
      if (messagesEnvoyes != null)
      {
         Message oldMessage;
         for (java.util.Iterator iter = getIteratorMessagesEnvoyes(); iter.hasNext();)
         {
            oldMessage = (Message)iter.next();
            iter.remove();
            oldMessage.setExpediteur((Compte)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Message> getMessagesReçus() {
      if (messagesReçus == null)
         messagesReçus = new java.util.HashSet<Message>();
      return messagesReçus;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMessagesReçus() {
      if (messagesReçus == null)
         messagesReçus = new java.util.HashSet<Message>();
      return messagesReçus.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMessagesReçus */
   public void setMessagesReçus(java.util.Collection<Message> newMessagesReçus) {
      removeAllMessagesReçus();
      for (java.util.Iterator iter = newMessagesReçus.iterator(); iter.hasNext();)
         addMessagesReçus((Message)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMessage */
   public void addMessagesReçus(Message newMessage) {
      if (newMessage == null)
         return;
      if (this.messagesReçus == null)
         this.messagesReçus = new java.util.HashSet<Message>();
      if (!this.messagesReçus.contains(newMessage))
      {
         this.messagesReçus.add(newMessage);
         newMessage.setDestinataire(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMessage */
   public void removeMessagesReçus(Message oldMessage) {
      if (oldMessage == null)
         return;
      if (this.messagesReçus != null)
         if (this.messagesReçus.contains(oldMessage))
         {
            this.messagesReçus.remove(oldMessage);
            oldMessage.setDestinataire((Compte)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMessagesReçus() {
      if (messagesReçus != null)
      {
         Message oldMessage;
         for (java.util.Iterator iter = getIteratorMessagesReçus(); iter.hasNext();)
         {
            oldMessage = (Message)iter.next();
            iter.remove();
            oldMessage.setDestinataire((Compte)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Conversation> getConversationsCrees() {
      if (conversationsCrees == null)
         conversationsCrees = new java.util.HashSet<Conversation>();
      return conversationsCrees;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorConversationsCrees() {
      if (conversationsCrees == null)
         conversationsCrees = new java.util.HashSet<Conversation>();
      return conversationsCrees.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newConversationsCrees */
   public void setConversationsCrees(java.util.Collection<Conversation> newConversationsCrees) {
      removeAllConversationsCrees();
      for (java.util.Iterator iter = newConversationsCrees.iterator(); iter.hasNext();)
         addConversationsCrees((Conversation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newConversation */
   public void addConversationsCrees(Conversation newConversation) {
      if (newConversation == null)
         return;
      if (this.conversationsCrees == null)
         this.conversationsCrees = new java.util.HashSet<Conversation>();
      if (!this.conversationsCrees.contains(newConversation))
      {
         this.conversationsCrees.add(newConversation);
         newConversation.setCreateurConversation(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldConversation */
   public void removeConversationsCrees(Conversation oldConversation) {
      if (oldConversation == null)
         return;
      if (this.conversationsCrees != null)
         if (this.conversationsCrees.contains(oldConversation))
         {
            this.conversationsCrees.remove(oldConversation);
            oldConversation.setCreateurConversation((Compte)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllConversationsCrees() {
      if (conversationsCrees != null)
      {
         Conversation oldConversation;
         for (java.util.Iterator iter = getIteratorConversationsCrees(); iter.hasNext();)
         {
            oldConversation = (Conversation)iter.next();
            iter.remove();
            oldConversation.setCreateurConversation((Compte)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<JournalisationEvenements> getEvenements() {
      if (evenements == null)
         evenements = new java.util.HashSet<JournalisationEvenements>();
      return evenements;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvenements() {
      if (evenements == null)
         evenements = new java.util.HashSet<JournalisationEvenements>();
      return evenements.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvenements */
   public void setEvenements(java.util.Collection<JournalisationEvenements> newEvenements) {
      removeAllEvenements();
      for (java.util.Iterator iter = newEvenements.iterator(); iter.hasNext();)
         addEvenements((JournalisationEvenements)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJournalisationEvenements */
   public void addEvenements(JournalisationEvenements newJournalisationEvenements) {
      if (newJournalisationEvenements == null)
         return;
      if (this.evenements == null)
         this.evenements = new java.util.HashSet<JournalisationEvenements>();
      if (!this.evenements.contains(newJournalisationEvenements))
      {
         this.evenements.add(newJournalisationEvenements);
         newJournalisationEvenements.setCompte(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldJournalisationEvenements */
   public void removeEvenements(JournalisationEvenements oldJournalisationEvenements) {
      if (oldJournalisationEvenements == null)
         return;
      if (this.evenements != null)
         if (this.evenements.contains(oldJournalisationEvenements))
         {
            this.evenements.remove(oldJournalisationEvenements);
            oldJournalisationEvenements.setCompte((Compte)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEvenements() {
      if (evenements != null)
      {
         JournalisationEvenements oldJournalisationEvenements;
         for (java.util.Iterator iter = getIteratorEvenements(); iter.hasNext();)
         {
            oldJournalisationEvenements = (JournalisationEvenements)iter.next();
            iter.remove();
            oldJournalisationEvenements.setCompte((Compte)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Utilisateur getProprietaire() {
      return proprietaire;
   }
   
   /** @pdGenerated default parent setter
     * @param newUtilisateur */
   public void setProprietaire(Utilisateur newUtilisateur) {
      if (this.proprietaire == null || !this.proprietaire.equals(newUtilisateur))
      {
         if (this.proprietaire != null)
         {
            Utilisateur oldUtilisateur = this.proprietaire;
            this.proprietaire = null;
            oldUtilisateur.removeComptes(this);
         }
         if (newUtilisateur != null)
         {
            this.proprietaire = newUtilisateur;
            this.proprietaire.addComptes(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Conversation> getConversationReçues() {
      if (conversationReçues == null)
         conversationReçues = new java.util.HashSet<Conversation>();
      return conversationReçues;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorConversationReçues() {
      if (conversationReçues == null)
         conversationReçues = new java.util.HashSet<Conversation>();
      return conversationReçues.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newConversationReçues */
   public void setConversationReçues(java.util.Collection<Conversation> newConversationReçues) {
      removeAllConversationReçues();
      for (java.util.Iterator iter = newConversationReçues.iterator(); iter.hasNext();)
         addConversationReçues((Conversation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newConversation */
   public void addConversationReçues(Conversation newConversation) {
      if (newConversation == null)
         return;
      if (this.conversationReçues == null)
         this.conversationReçues = new java.util.HashSet<Conversation>();
      if (!this.conversationReçues.contains(newConversation))
      {
         this.conversationReçues.add(newConversation);
         newConversation.addParticipant(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldConversation */
   public void removeConversationReçues(Conversation oldConversation) {
      if (oldConversation == null)
         return;
      if (this.conversationReçues != null)
         if (this.conversationReçues.contains(oldConversation))
         {
            this.conversationReçues.remove(oldConversation);
            oldConversation.removeParticipant(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllConversationReçues() {
      if (conversationReçues != null)
      {
         Conversation oldConversation;
         for (java.util.Iterator iter = getIteratorConversationReçues(); iter.hasNext();)
         {
            oldConversation = (Conversation)iter.next();
            iter.remove();
            oldConversation.removeParticipant(this);
         }
      }
   }

}