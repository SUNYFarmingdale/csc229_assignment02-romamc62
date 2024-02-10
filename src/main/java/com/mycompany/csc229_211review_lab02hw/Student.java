package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{
    //Student is now a child class
    private double GPA;
    //add field for GPA
    public Student(String name, short age) {
        super(name, age);
    }


    public String getAddress() {
        return null;
    }


    public void setAddress(String address) {

    }

//create setter and getter for GPA
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double GetGPA(){
        return GPA;
    }

    //added toString as expected from ToDo 7
    public String toString(){
        return "Student "+getName()+", age "+getAge()+", GPA "+GetGPA();
    }

}