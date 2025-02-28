package org.example.club_sportif.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.club_sportif.Entities.Admin;
import org.example.club_sportif.Repository.AdminRepository;

import java.io.IOException;
import java.util.Date;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {
    AdminRepository adminRepository=new AdminRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date=new Date();
        Admin admin1=new Admin("Bouhlal","Nazih","Admin","Admin","nazihbouhal@gmail.com",date,"0611333333");
        adminRepository.save(admin1);

       Admin admin=adminRepository.findById(1);
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        try {
            if(admin.authentifier(username,password)) req.getRequestDispatcher("index.jsp").forward(req,resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
