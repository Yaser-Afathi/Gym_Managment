package org.example.club_sportif.Entities;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="membre")
public class Membre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id_Membre;

    String nom_Membre;

    @Temporal(TemporalType.DATE)
    Date date_de_naissance;

    String prenom;
    String adresse;
    String num_telephone;

    @OneToOne
    @JoinColumn(name = "id_Cotisation")
    Cotisation cotisation;

    @ManyToOne
    Groupe groupe;

    public Membre() {
        super();
    }

    public Membre(String nom_Membre, Date date_de_naissance, String prenom, String adresse, String num_telephone, Cotisation cotisation) {
        super();
        this.nom_Membre = nom_Membre;
        this.date_de_naissance = date_de_naissance;
        this.prenom = prenom;
        this.adresse = adresse;
        this.num_telephone = num_telephone;
        this.cotisation = cotisation;
    }

    public Integer getId_Membre() {
        return id_Membre;
    }

    public void setId_Membre(Integer id_Membre) {
        this.id_Membre = id_Membre;
    }

    public String getNom_Membre() {
        return nom_Membre;
    }

    public void setNom_Membre(String nom_Membre) {
        this.nom_Membre = nom_Membre;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNum_telephone() {
        return num_telephone;
    }

    public void setNum_telephone(String num_telephone) {
        this.num_telephone = num_telephone;
    }

    public Cotisation getCotisation() {
        return cotisation;
    }

    public void setCotisation(Cotisation cotisation) {
        this.cotisation = cotisation;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "id_Membre=" + id_Membre +
                ", nom_Membre='" + nom_Membre + '\'' +
                ", date_de_naissance=" + date_de_naissance +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", num_telephone='" + num_telephone + '\'' +
                ", cotisation=" + cotisation +
           '}';
}
}