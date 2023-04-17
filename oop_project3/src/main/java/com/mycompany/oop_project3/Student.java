
package com.mycompany.oop_project3;


public class Student extends Person {
    int parent_phone;

    public Student() {
    }

    public Student(int parent_phone,int age ,String name ) {
        super (age ,name   );
        this.parent_phone = parent_phone;
    }

    public int getParent_phone() {
        return parent_phone;
    }

    public void setParent_phone(int parent_phone) {
        this.parent_phone = parent_phone;
    }

 @Override
 public String getData(){
//     System.out.println("name: "+std.getName()+"  "+"age: "+std.getAge()+"  "+"parent phone: "+std.getParent_phone());
 
 return this.getName()+" "+this.getAge()+" "+this.getParent_phone();
 
 }
    
    
    
    
}
