/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.db;

/**
 *
 * @author praka
 */
import my.model.Subjects;
import java.util.ArrayList;

public class SubjectDB {
    private static ArrayList<Subjects> subjList;
    
    static {
        subjList = new ArrayList<>();
        subjList.add(new Subjects("S101","OOP", 3));
        subjList.add(new Subjects("S102","MATH", 3));
        subjList.add(new Subjects("S103","SCIENCE", 3));
        subjList.add(new Subjects("S104","SPORT", 3));
        subjList.add(new Subjects("S105","DANCE", 3));
    }
    
    public static ArrayList<Subjects> getSubjects(){
        return subjList;
    }
    
    public static Subjects getSubjectById(String id){
        for(Subjects s : subjList){
            if(s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }
}
