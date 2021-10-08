/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.entities;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class participant {
    private String cin;
    private String nom;
    private String prenom;
    private String numtel;
    private String adress;
    private String mail;
    private String mdp;
    private String id_group;
    private String date_nai;
    private String username;

    public participant(String cin, String nom, String prenom, String numtel, String adress, String mail, String mdp, String date_nai, String username) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numtel = numtel;
        this.adress = adress;
        this.mail = mail;
        this.mdp = mdp;
        this.date_nai = date_nai;
        this.username = username;
    }
    
    public participant(){
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumtel() {
        return numtel;
    }

    public String getAdress() {
        return adress;
    }

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public String getId_group() {
        return id_group;
    }

    public String getDate_nai() {
        return date_nai;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setId_group(String id_group) {
        this.id_group = id_group;
    }

    public void setDate_nai(String date_nai) {
        this.date_nai = date_nai;
    }

    @Override
    public String toString() {
        return "participant{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", numtel=" + numtel + ", adress=" + adress + ", mail=" + mail + ", mdp=" + mdp + ", id_group=" + id_group + ", date_nai=" + date_nai + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final participant other = (participant) obj;
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }
    
    
    
}
