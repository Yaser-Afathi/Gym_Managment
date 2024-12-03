package org.example.club_sportif.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.club_sportif.Entities.*;

import java.lang.reflect.Member;

public class AdminRepository extends Repository<Admin,Integer>{
    GroupeRepository repository=new GroupeRepository();
    MembreRepository membreRepository=new MembreRepository();
    private static EntityManagerFactory emf;
    private static EntityManager em;
    public AdminRepository() {
        super(Admin.class);
    }

    public void addMember(Membre member){
        try {
                em.getTransaction().begin();
                em.persist(member);
                em.getTransaction().commit();
            } catch (Exception e) {
                System.out.println(e);
                em.getTransaction().rollback();
            }
    }

    public void updateMember(Membre member){
        try {
            em.getTransaction().begin();
            em.merge(member);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        }
    }

    public void deleteMember(int idMember){
        Member target = em.find(Member.class, idMember);
        if(target!= null) {
            try {
                em.getTransaction().begin();
                em.remove(target);
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
            }
        }
    }

    public void addMemberToGroup(int groupeId,int memberId){
        try {
            Membre target = membreRepository.findById(memberId);
            Groupe tagetGroupe = repository.findById(groupeId);
            tagetGroupe.getListejoueur().add(target);
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void deleteMemberFromGroup(int groupeId,int memberId){
        try {
            Membre target = membreRepository.findById(memberId);
            Groupe tagetGroupe = repository.findById(groupeId);
            tagetGroupe.getListejoueur().remove(target);
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void addSport(Sport sport){
        try {
            em.getTransaction().begin();
            em.persist(sport);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        }
    }

    public void updateSport(Sport sport){
        try {
            em.getTransaction().begin();
            em.merge(sport);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        }
    }

    public void deleteSport(int sportId){
        Sport target = em.find(Sport.class, sportId);
        if(target != null) {
            try {
                em.getTransaction().begin();
                em.remove(target);
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
            }
        }
    }

    public void addEntraineur(Entraineur entaineur) {
        try {
            em.getTransaction().begin();
            em.persist(entaineur);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        }
    }

    public void updateEntraineur(Entraineur entraineur){
        try {
            em.getTransaction().begin();
            em.merge(entraineur);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        }
    }

    public void supprimerEntraineur(int idEntraineur){
        Entraineur target = em.find(Entraineur.class, idEntraineur);
        if(target!= null) {
            try {
                em.getTransaction().begin();
                em.remove(target);
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
            }
        }
    }

}
