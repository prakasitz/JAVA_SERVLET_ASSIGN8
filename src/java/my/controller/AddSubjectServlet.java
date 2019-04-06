package my.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
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
public class AddSubjectServlet extends HttpServlet {
    private int maxRegisterCredit;
    public void init() throws ServletException { // ให้ทำครั้งแรกครั้งเดียว เพราะการอ่านจำนวนจำกัดหน่วยกิตควรอานครั้งเดียวพอ
        super.init();
        maxRegisterCredit = Integer.parseInt(getServletContext().getInitParameter("maxRegisterCredit"));
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String subjectId = req.getParameter("subjectId");
        HttpSession  session = req.getSession();
        Subjects registerSubject = SubjectDB.getSubjectById(subjectId); // นำไอดีที่ได้รับจากการกด regis ไปเรียก obj ของ subj นั้นออกมา
        
        ArrayList<Subjects> registerSubjects = (ArrayList<Subjects>) session.getAttribute("registerSubjects"); //รอบแรกจะไม่มี
        
        if(registerSubjects == null) {
            registerSubjects = new ArrayList<>();
        }
        
        if(getTotalRegisterCredit(registerSubjects) + registerSubject.getCredit() > maxRegisterCredit) { // (จำนวน หน่วยกิตจาก session บวกกัน และ + ของใหม่ มากกว่า 9 
            req.setAttribute("message", "maximun register credit 9 credit!");
        } else {
            
            if(checkRegisterSubject(registerSubjects, registerSubject)) { //false แสดงว่าซ้ำ
                
                registerSubjects.add(registerSubject); //Array List of Register Subjec use Add()
                session.setAttribute("registerSubjects", registerSubjects); // พร้อมกับ set session แบบใหม่หมด

                String message = "Subject: " + registerSubject.getId() + "/" + registerSubject.getSubjName()+ " added";
                req.setAttribute("message", message); 
            } else {
                String message = "Subject: " + registerSubject.getId() + "/" + registerSubject.getSubjName()+ " มีอยู่แล้ว ไม่สามารถเลือกซ้ำได้";
                req.setAttribute("message", message); 
            }
        }
            RequestDispatcher dp = req.getRequestDispatcher("./subject_list.jsp");
            dp.forward(req, resp);
       
    }
    
    private int getTotalRegisterCredit(ArrayList<Subjects> registerSubjects){
        if(registerSubjects == null){
            return 0;
        }
        int sum = 0;
        
        for(Subjects s : registerSubjects){
            sum += s.getCredit();
        }
        return sum;
    }
    
    private boolean checkRegisterSubject(ArrayList<Subjects> registerSubjects, Subjects registerSubjectCurrent){ //สำหรับเช็กว่า ซ้ำหรือไม่
        if(registerSubjects == null){
            return true;
        }
        
        for(Subjects rgsSub : registerSubjects){
            if(rgsSub.getId().equals(registerSubjectCurrent.getId())) {
                return false;                
            }
        }
        return true; // สามารถ add ค่าเพิ้มได้ เพราะไม่ซ้ำ
    }

}
