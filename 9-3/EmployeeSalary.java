import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        double salary = 0.0, bonus = 0.0, taxAmount, netSalary;
        String destination;
        int yearsServed;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Manager \n2. System Analyst \n3. Developer \n4. Accountant");
        System.out.println("Enter the Employee's designation");
        designation = input.nextLine();

        switch (destination) {
            case "Manager":
                salary = 21346.876;
                break;
            case "System Analyst":
                salary = 16729.564;
                break;
            case "Deveploper":
                salary = 14525.345;
                break;
        }
    }
}

