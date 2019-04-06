package my.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.Subject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import my.db.SubjectDB;
import my.db.UserDB;
import my.model.Subjects;
import my.model.Users;

/**
 *
 * @author praka
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
            HttpSession Oldsession = req.getSession();
            Oldsession.invalidate();
            
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
            
            Users u = getUser(user,pass);       
            
            if(u != null) {
                HttpSession session = req.getSession();
                session.setAttribute("Users", u);
                
                List<Subjects> subjectList = SubjectDB.getSubjects(); 
                session.setAttribute("Subjects", subjectList);
                
                RequestDispatcher dp = req.getRequestDispatcher("./subject_list.jsp");
                dp.forward(req, resp);
            } else {
                RequestDispatcher dp = req.getRequestDispatcher("./login_fail.jsp");
                dp.forward(req, resp);
            }
    }
    
    private Users getUser(String user, String password) {
        List<Users> users = UserDB.getUsers();
        for(Users u : users) {
            if(u.getUsername().equals(user) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

}
