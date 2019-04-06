/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

/**
 *
 * @author praka
 */
public class Subjects {
    private String Id;
    private String subjName;
    private int credit;
    
    public Subjects(String id, String subjName, int credit) {
        this.Id = id;
        this.credit = credit;
        this.subjName = subjName;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }
    
    

    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getSubjName() {
        return subjName;
    }

    public int getCredit() {
        return credit;
    }
    
}
