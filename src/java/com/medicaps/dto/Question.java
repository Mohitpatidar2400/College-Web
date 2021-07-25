
package com.medicaps.dto;


public class Question {
    
    private int qid;
    private String qus;
    private String qdate;
    private int Student;
    private String studentname;
    private int student;

    public Question(int qid, String qus, String qdate, int Student, String studentname) {
        this.qid = qid;
        this.qus = qus;
        this.qdate = qdate;
        this.Student = Student;
        this.studentname = studentname;
    }

    public Question(int qid, String qus, String qdata) {
        this.qid = qid;
        this.qus = qus;
        this.qdate = qdate;
        
    }

    public Question(int qid, String qus, String qdate, int student) {
        this.qid = qid;
        this.qus = qus;
        this.qdate = qdate;
        this.student = student;
    }

    public Question(int qid, String qus, String qdate, String studentname) {
        this.qid = qid;
        this.qus = qus;
        this.qdate = qdate;
        this.studentname = studentname;
    }
    
    

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQus() {
        return qus;
    }

    public void setQus(String qus) {
        this.qus = qus;
    }

    public String getQdate() {
        return qdate;
    }

    public void setQdate(String qdate) {
        this.qdate = qdate;
    }

    public int getStudent() {
        return Student;
    }

    public void setStudent(int Student) {
        this.Student = Student;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    
    
    
}
