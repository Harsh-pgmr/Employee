public class employee {
    public static void main(String arg[]){
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        // Constants
        int empWagePerHr=20;
        int is_Part_Time=2;
        int is_Full_Time=1;

        // Variable
        int empHrs=0;
        int empWage=0;
        // Employee check
        double employee = (int)(( Math.random() * 10 ) % 3);
        if ( employee == is_Part_Time ) {
            System.out.println("Part Time  ");
            empHrs = 4;
        }
        else if (employee == is_Full_Time ) {
            System.out.println("Full Time ");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is Absent ");
            empHrs = 0;
        }
            empWage=(empHrs*empWagePerHr);
            System.out.println("Employee Wage is "+empWage);
    }
}


