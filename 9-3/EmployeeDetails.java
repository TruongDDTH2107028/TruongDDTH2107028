package com.company;

import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        int employeeID;
        String employeeName;
        char gender;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Employee Indentification Code: ");
        employeeID = scan.nextInt();

        if (employeeID > 0) {
            System.out.println("Enter the Employee Name: ");
            Scanner s = new Scanner(System.in);
            employeeName = s.nextLine();

            if (employeeName.length() <40) {
                System.out.println("Enter the Gender: [M/F] ");
                gender = scan.next("\\D").charAt(0);

                if (gender == 'M' || gender == 'F'){
                    System.out.println("Employee Code: " + employeeID);
                    System.out.println("Employee Name: " + employeeName);
                    System.out.println("Employtee Gender: " + gender);
                } else {
                    System.out.println("Incorrect Entry for Gender.");
                }
            }
            else {
                System.out.println("Incorrect Entry for Employee Name.");
            }
        }
        else {
            System.out.println("Incorrect Entry for Employee Indentification Code.");
        }
    }
}