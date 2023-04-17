
package com.mycompany.oop_project3;
import java.util.*;
import services.School_services;

public class Hmi {
   static Scanner reedval =new Scanner (System.in);
   static School sch =Hmi.creatschool();
   static School_services ssv =new School_services(sch);
   
    //بدل الواجهه بتاع المستخدم ف بعمل هنا الي هيظهرله 
    public static void start (){
        
        //عملت كل داله لواحدها عشان الكود يفضل نضيف 
       
       

        System.out.println("welcome to "+"" +sch.getName()+" schoool ");
       int action =0;
        do {
             System.out.println("----school serveces----");
           System.out.println(" what do your want to do ?    ");
            System.out.println("1-addStudent");
            System.out.println("2-deleteStudnet");
            System.out.println("3-searchForStudent");
            System.out.println("4-printStudents_info");
            System.out.println("5-addTeacher");
            System.out.println("6-delete teacher");
            System.out.println("7-searche for teacher");
            System.out.println("8-print teachers info ");
            System.out.println("0-exit");
            action=reedval.nextInt();    
            
                switch (action )      {
                case 1:
                      addstudent();
                      break;
                case 2:
                       deletestudent();
                       break ;
                case 3:
                    searchS();
                    break;
                case  4:
                    for (Student s :sch.getStudentlist()){
                     s.getData();}
                    break;
                case 5:
                     addteacher();
                     break ;
                case 6:
                    deleteteacher();
                    break;
                    
                case 7 : 
                    searchT();
                    break;
                case 8 :
                    for (Teacher t :sch.getTeacherlist()){
                    t.getData();}
                    break;
                case 0:
                   System.exit(0);
                   break;

                
                }  

       }while (action !=0);

    }

    //اعمل كل داله لواحدها عشان اصغر الكود الي فوق ده 
    private static School creatschool(){
     School school = new School ();
    school.setName("elhoreia ");
    school.setAdress("aga nawasa");
    school.setPhone_number(302199329);
    return school ;
    }   
    public static void addstudent(){
               Student student =new Student() ;
               setPersonData(student);
              ssv.add_student(student);
    }
   public static void deletestudent(){
   System.out.println("enter studnet name ");
               String name =reedval.next();
               for (Student s :sch.getStudentlist())
               {
              if(s.getName().equals(name)){
              ssv.delete_student(s);
                System.out.println("omting  is done ");}
              else{
                System.out.println("student not foutn ");
               }}
   }
   public static void searchS(){//find studnet by name 
             System.out.println("enter student name ");
               String name =reedval.next();
           for(Student s:sch.getStudentlist()){
           if(s.getName().toUpperCase().equals(name.toUpperCase())){//بحول اااالاسم الي هو دخله ولاسم المتخزن عندي ل حروف كابيتال عشان الحاسيه يعني لو الاسم متسجل ب الاسمول وهو كتب ف البحث كابتل اذن كده مش هيطلعله حاجه ف انا عايزه يبحث عن الاسم اين مان هو متخزن ازاي
               System.out.println("name : "+s.getName()+" "+"Age :"+s.getAge());}
               else 
               System.out.println("this student is not found");
           }
   }
  public static void addteacher(){
        Teacher T1 =new Teacher();
        setPersonData(T1);
        ssv.add_teacher(T1);
  
  }
  public static void searchT(){//find teacher by name
             System.out.println("enter Teacher name ");
            String name =reedval.next();
           for(Teacher t:sch.getTeacherlist()){
           if(t.getName().toUpperCase().equals(name.toUpperCase())){//بحول اااالاسم الي هو دخله ولاسم المتخزن عندي ل حروف كابيتال عشان الحاسيه يعني لو الاسم متسجل ب الاسمول وهو كتب ف البحث كابتل اذن كده مش هيطلعله حاجه ف انا عايزه يبحث عن الاسم اين مان هو متخزن ازاي 
               System.out.println("name : "+t.getName()+" "+"age : "+t.getAge());}
           else
                   System.out.println("taecher not found ");
           }
  }
  public static void deleteteacher(){
   System.out.println("enter teacher name ");
               String name =reedval.next();
               for (Teacher t  :sch.getTeacherlist())
               {
              if(t.getName().equals(name)){
               ssv.delete_teacher(t);
                System.out.println("omting  is done ");}
              else{
                System.out.println("student not foutn ");
               }}}
  public static void setPersonData(Person p){
      //polymorphism
      //الاثنين مشتركين في دول سواء المعلم  و الطالب 
          System.out.println("enter name ");
      p.setName(reedval.next());
        System.out.println("enter  age ");
      p.setAge(reedval.nextInt());
      
       if (p instanceof Teacher){//عشان الي هعمله مش مشترك ف هحددله لومشتق من المعلم هعمل اي  
        System.out.println("enter teacher number ");
       ((Teacher)p).setPhone_number(reedval.nextInt());
//       الحركه الي فوق دي كاستينج بعرفه ان محنوي ال بي من النوع تيتشر
        System.out.println("enter Teacher salary ");
        ((Teacher)p).setsalary(reedval.nextDouble());}//
       
       else if (p instanceof Student){
             System.out.println("enter  parent phone number");
               ((Student)p).setParent_phone(reedval.nextInt());
       
       //      كاستينج     
       
       
       }
  
  
  
  }
  
  
  
  
}
