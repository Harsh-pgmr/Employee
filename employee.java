#CREATING CLASS EMPLOYEE

public class employee {
    public static final int empWagePerHr=20;
    public static final int is_Part_Time=2;
    public static final int is_Full_Time=1;

    public static void main(String arg[]){

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");

        int empHrs=0;
        int empWage=0;

        int employee=(int)(( Math.random()*10)%3);
        
#SOLVING SWITCH STATEMENTS

        switch(employee){
            case is_Part_Time:
                System.out.println("Part Time  ");
                empHrs = 4;
                break;
            case is_Full_Time:
                System.out.println("Full Time ");
                empHrs = 8;
                break;
            default:
                System.out.println("Employee is Absent ");
                empHrs = 0;
        }
            empWage=(empHrs*empWagePerHr);
            System.out.println("Employee Wage is "+empWage);
    }
}
