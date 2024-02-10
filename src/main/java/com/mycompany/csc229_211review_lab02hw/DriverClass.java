package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {

		Student std1= new Student("James", (short) 20);
		//fixed error

		//Set the GPA of the student using the scanner and user input
		Scanner scan = new Scanner(System.in);
		double GPA=scan.nextDouble();
		std1.setGPA(GPA);


		System.out.println(std1);
		//oops accidently committed to main gotta add a comment so it'll let me pull request
	}


}