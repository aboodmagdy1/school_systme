
package com.mycompany.oop_project3;


public class Teacher extends Person  {
    int phone_number ;
    double salary ;

    public Teacher() {
        
    }

    public Teacher(int phone_number, int age, String name) {
        super(age, name);
        this.phone_number = phone_number;
        this.salary=0;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
    public void setsalary(double salary ){
    this.salary=salary ;

    }
     public double  getsalary() {
        return salary;
    }
     @Override
     public String getData(){
     
     return this.getName()+" "+this.getAge()+" "+this.getPhone_number()+" "+this.getsalary();
     
     }
    
}
