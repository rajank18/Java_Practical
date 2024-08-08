import java.util.*;

public class prac17 {

    public static void main(String[] args) {
        Manager x = new Manager();
        x.getdata();
        x.input();
        x.printdata();
        x.printSalary();
        x.output();
    

        Employee y = new Employee();
        y.getdata();
        y.input();
        y.printdata();
        y.printSalary();
        y.output();

    }

}

class Members {

    String name;
    int age;
    String pnum;
    String add;
    int sal;

    Scanner obj = new Scanner(System.in);

    void printSalary() {
        System.out.println(sal);

    }

    void getdata() {

        System.out.println("Input the Data:");
        System.out.print("Name: ");
        name = obj.nextLine();
        System.out.print("Age: ");
        age = obj.nextInt();
        obj.nextLine();
        System.out.print("Phone Number: ");
        pnum = obj.nextLine();
        System.out.print("Address: ");
        add = obj.nextLine();
        System.out.print("Salary: ");
        sal = obj.nextInt();
        obj.nextLine();
        

    }

    void printdata() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(add);
        System.out.println(pnum);
        System.out.println(sal);

    }

}

class Manager extends Members {

    String special;

    void input() {
        System.out.println("Enter Specialization:");
        special = obj.nextLine();

    }

    void output() {
        System.out.println(special);

    }

}

class Employee extends Members {

    String dept;

    void input() {
        System.out.println("Enter Department:");
        dept = obj.nextLine();

    }

    void output() {
        System.out.println(dept);

    }

}
