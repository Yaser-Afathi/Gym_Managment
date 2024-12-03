package org.example.club_sportif.Servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ctrl")
public class ControllerServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session = req.getSession();
//        boolean categoriesAdded = session.getAttribute("categoriesAdded") != null;
//        String action = req.getParameter("action");
//        if (!categoriesAdded) {
//
//            Categorie categorie1 = new Categorie();
//            categorie1.setType("SCI_FI");
//            Categorie categorie2 = new Categorie();
//            categorie2.setType("History");
//            repository.save(categorie1);
//            repository.save(categorie2);
//
//            session.setAttribute("categoriesAdded", true);
//        }
//
//        if (action.equalsIgnoreCase("ajouter")) {
//            List<Categorie> categories = repository.findAll();
//            req.setAttribute("categories", categories);
//            req.getRequestDispatcher("AjouterLivre.jsp").forward(req, resp);
//        }
//        if (action.equalsIgnoreCase("afficher")){
//            List<Livre> livres=livreRepository.findAll();
//            req.setAttribute("livres",livres);
//            req.getRequestDispatcher("Affichage.jsp").forward(req,resp);
//        }
//        if(action.equalsIgnoreCase("supprimer")){
//            req.getRequestDispatcher("SupprimerLivre.jsp").forward(req,resp);
//        }
//        if(action.equalsIgnoreCase("modifier")){
//            List<Categorie> categories = repository.findAll();
//            req.setAttribute("categories",categories);
//            req.getRequestDispatcher("ModifierLivre.jsp").forward(req,resp);
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}



