package org.example.club_sportif.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Entraineur {
    @Id
    @GeneratedValue
    private int id_entraineur;
    private String adresse;
    private String nom;
    private String prenom;
    private String Numerotelephone;
    private Date dateNaissance;
    @OneToMany(mappedBy = "entraineur")
    private List<Groupe>groupes;

    public Entraineur(String adresse, String nom, String prenom, String numerotelephone, Date dateNaissance) {
        this.adresse = adresse;
        this.nom = nom;
        this.prenom = prenom;
        this.Numerotelephone = numerotelephone;
        this.dateNaissance = dateNaissance;
    }

    public Entraineur() {
    }

    public int getId_entraineur() {
        return this.id_entraineur;
    }

    public void setId_entraineur(int id_entraineur) {
        this.id_entraineur = id_entraineur;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumerotelephone() {
        return this.Numerotelephone;
    }

    public void setNumerotelephone(String numerotelephone) {
        this.Numerotelephone = numerotelephone;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
