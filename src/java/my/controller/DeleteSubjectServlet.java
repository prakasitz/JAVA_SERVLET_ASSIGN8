package my.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import my.db.SubjectDB;
import my.model.Subjects;

/**
 *
 * @author praka
 */
public class DeleteSubjectServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String subjectId = req.getParameter("subjectId"); 
        Subjects registedSubject = SubjectDB.getSubjectById(subjectId);
        
        HttpSession session = req.getSession();
        
        ArrayList<Subjects> registedSubjects = (ArrayList<Subjects>) session.getAttribute("registerSubjects");
        registedSubjects = deleteRegisterSubject(registedSubjects, registedSubject);
        
        session.setAttribute("registerSubjects", registedSubjects);
        
        RequestDispatcher dp = req.getRequestDispatcher("./summary.jsp");
        dp.forward(req, resp);
       
    }
    
    private ArrayList<Subjects> deleteRegisterSubject(ArrayList<Subjects> registedSubjects, Subjects registedSubjectCurrent){ //หา sub ที่ตองการลบ ใน list ของ session
        ArrayList<Subjects> updateRegistedSubjects;
        
        for(Subjects rgsSub : registedSubjects){
            
            if(rgsSub.getId().equals(registedSubjectCurrent.getId())) {
                registedSubjects.remove(rgsSub);
                updateRegistedSubjects = registedSubjects;
                return updateRegistedSubjects;
            }
        }
        
        return registedSubjects; // จริงๆ ใช้วิธี remove(obj ตัวนั้น) เลยก็ได้นะ ไม่ต้อง loop ตามก็ได้ , จากนั้นจะ setSession ใหม่ หรือไม่ set แบบเราก็ได้ เพราะมันมีค่าเทากัน
    }
    

}
