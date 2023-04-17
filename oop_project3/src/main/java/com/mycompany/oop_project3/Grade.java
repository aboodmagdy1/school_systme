
package com.mycompany.oop_project3;
import java.util.*;

public class Grade {
    String  code ;
    String name ; 
    Teacher teacher; //just one teacher for one grade 
    ArrayList<Student>studentlist=new ArrayList ();

    public Grade(String  code, String name) {
        this.code = code;
        this.name = name;
       //مش لازم او مش ضروري اعرف المدرس ف الاول 
    }

    public String  getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }
//    مينفعش اعنلها سيتر عشان مش هعرف اضيف مجموعه ف نفس الوقت 

  
   public void add_student (Student s){
   
  this.studentlist.add(s);
  //اضافة طالب ل صف دراسي ما 
   
   }
    
       public void delete_student (Student s){
   
  this.studentlist.remove(s);
  //حذف  طالب من  صف دراسي ما 
   
   }
    
    
}
