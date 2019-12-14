package org.tcs.datatype.login;

import java.util.Scanner;

public class ScanMethods {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
System.out.println("Pls enter id ");
int empId =sc.nextInt();
System.out.println("Enter ID is "+empId);

System.out.println("pls enter name ");
String empName = sc.nextLine();
System.out.println("Enter name is "+empName);

System.out.println("Pls enter sal");
double empsal=sc.nextDouble();

System.out.println("Enter Emp Gender");
String empGen=sc.next();
System.out.println("Emp Gender is "+empGen);
System.out.println("Enter sal for "+empName +" is "+empsal);

}


}
