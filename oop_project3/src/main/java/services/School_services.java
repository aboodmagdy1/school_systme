
package services;
import com.mycompany.oop_project3.Grade;
import com.mycompany.oop_project3.Teacher;
import com.mycompany.oop_project3.School;
import com.mycompany.oop_project3.Student;

public class School_services {
    School mySchool;

    public School_services(School mySchool) {
        this.mySchool = mySchool;
    }

    public School_services() {
    }
    public School getschool(){
   return mySchool;
    
    
    }
    public void add_student(Student std){
    //هتضيف الطالب الي انا هعرفه وابعتهولها ك باراميتر
    this.mySchool.getStudentlist().add(std);
    
    }
    
     public void delete_student(Student std){
    
    this.mySchool.getStudentlist().remove(std);
    
    }
     public Student search_std(String name ){
         for ( Student s : mySchool.getStudentlist()){
             if (s.getName().equals(name)){
             
             return s; 
             }
         }
     return null;
     }
     
    
     public void add_teacher(Teacher t){
    //هتضيف المدرس  الي انا هعرفه وابعتهولها ك باراميتر
    this.mySchool.getTeacherlist().add(t);
    
    }
    
     
      public void delete_teacher(Teacher t){
    
    this.mySchool.getTeacherlist().remove(t);
    
    }
       public Teacher search_teacher(String name ){
         for ( Teacher t : mySchool.getTeacherlist()){
             if (t.getName().equals(name)){
             
             return t; 
             }
         }
     return null;
     }

        public void add_grade(Grade g){
    //هتضيف المدرس  الي انا هعرفه وابعتهولها ك باراميتر
    this.mySchool.getGradelist().add(g);
    
    }
    
     
      public void delete_Grade(Grade g){
    
    this.mySchool.getGradelist().remove(g);
    
    }
      //search for grade by code
       public Grade search_grade(String code ){
         for ( Grade g : mySchool.getGradelist()){
             if (g.getCode().equals(code)){
             
             return g; 
             }
         }
     return null;
     }
     
    
}
