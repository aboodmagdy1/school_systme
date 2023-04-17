
package com.mycompany.oop_project3;
import java.util.*;
public class School {
    String name ; 
    int phone_number ;
    String adress;
    ArrayList<Teacher>teacherlist=new ArrayList();
    ArrayList<Grade>gradelist=new ArrayList();
    ArrayList<Student>studentlist=new ArrayList();

    public School() {
    }

    public School(String name, int phone_number, String adress) {
        this.name = name;
        this.phone_number = phone_number;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Teacher> getTeacherlist() {
        return teacherlist;
    }

    public ArrayList<Grade> getGradelist() {
        return gradelist;
    }

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }
    
    
    
    public  void add_student (Student std ){
    
    studentlist.add(std);
    
    
    }
    
}
