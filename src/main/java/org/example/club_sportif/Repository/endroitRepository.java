package org.example.club_sportif.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.club_sportif.Entities.Endroit;

public class endroitRepository extends Repository<Endroit,Integer> {
    public endroitRepository() {
        super(Endroit.class);
    }
}
