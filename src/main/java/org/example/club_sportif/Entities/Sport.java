package org.example.club_sportif.Entities;

import jakarta.persistence.*;

@Entity
public class Sport {
    @Id
    @GeneratedValue
    private int idSport;
    private String category;
    @OneToOne
    private Endroit endroit;
    private String nomSprot;

    @ManyToOne()
    @JoinColumn(name = "id_Admin")
    private Admin admin;

    public Sport(String category, Endroit endroit, String nomSprot) {
        this.category = category;
        this.endroit = endroit;
        this.nomSprot = nomSprot;
    }

    public Sport() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Endroit getEndroit() {
        return endroit;
    }

    public void setEndroit(Endroit endroit) {
        this.endroit = endroit;
    }

    public String getNomSprot() {
        return nomSprot;
    }

    public void setNomSprot(String nomSprot) {
        this.nomSprot = nomSprot;
    }
}
