package org.example.club_sportif.Entities;
import jakarta.persistence.*;
@Entity
@Table(name="endroit")
public class Endroit {
    @Id
    long id_terrain;
    @OneToOne
    Sport sport;
    String nom_terrain;
    Boolean disponibilité;
    String adresse;


    public Endroit(long id_terrain, String nom_terrain, Boolean disponibilité, String adresse) {
        this.id_terrain = id_terrain;
        this.nom_terrain = nom_terrain;
        this.disponibilité = disponibilité;
        this.adresse = adresse;
    }

    public Endroit() {
    }

    public long getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(long id_terrain) {
        this.id_terrain = id_terrain;
    }

    public String getNom_terrain() {
        return nom_terrain;
    }

    public void setNom_terrain(String nom_terrain) {
        this.nom_terrain = nom_terrain;
    }

    public Boolean getDisponibilité() {
        return disponibilité;
    }

    public void setDisponibilité(Boolean disponibilité) {
        this.disponibilité = disponibilité;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Endroit{" +
                "id_terrain=" + id_terrain +
                ", nom_terrain='" + nom_terrain + '\'' +
                ", disponibilité='" + disponibilité + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }


    public void afficher_disponibilite(){
        //System.out.println("Le terrain " + nom_terrain + " est disponible : " + disponibilite);
    }
    public void annuler_reservation(String disponibilite){
/*
        if ("Réservé".equals(disponibilite)) {
            disponibilite = "Disponible";
            System.out.println("Réservation annulée pour le terrain " + nom_terrain);
        } else {
            System.out.println("Aucune réservation à annuler pour le terrain " + nom_terrain);
        }*/
    }
    public void reserver_terrain(int id_terrain){
       /* ("Disponible".equals(disponibilite)) {
            disponibilite = "Réservé";
            System.out.println("Terrain " + nom_terrain + " réservé avec succès.");
        } else {
            System.out.println("Le terrain " + nom_terrain + " n'est pas disponible pour la réservation.");
        }*/
    }
}
