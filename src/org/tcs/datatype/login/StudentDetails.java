package org.tcs.datatype.login;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[]args) {
	Scanner st=new Scanner(System.in);
	System.out.println("pls enter student id");
	int studId=st.nextInt();
	
	System.out.println("Enter student name");
	String studName=st.next();
	
	System.out.println("enter Mark1");
	int mar1=st.nextInt();
	
	System.out.println("Enter Mark2");
	int mar2=st.nextInt();
	
	System.out.println("Enter Mark3");
	int mar3=st.nextInt();
	
	System.out.println("Enter Mark4");
	int mar4=st.nextInt();
	
	System.out.println("Enter Mark5");
	int mar5=st.nextInt();
	
	System.out.println("Total Marks");
	System.out.println(mar1+mar2+mar3+mar4+mar5);
	
	System.out.println("Average of Marks");
	System.out.println((mar1+mar2+mar3+mar4+mar5)/5);
	}

}
