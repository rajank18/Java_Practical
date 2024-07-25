import java.util.Scanner;
public class prac12 {
    public static void main(String[] args) {
        System.out.println("23DIT024-RAJAN KANZARIYA");
        employee e1 = new employee();
        employee e2 = new employee();
        System.out.println("For Employee 1: ");
        e1.get();
        System.out.println("For Employee 2: ");
        e2.get();

        System.out.println("First Employee 1: ");
        e1.set();
        e1.raise();
        System.out.println("Second Employee 2: ");
        e2.set();
        e2.raise();
    }
}
class employee{

    String fname;
    String lname;   
    double sal;
        employee(){
            fname="";
            lname="";
            sal=0;
        }
    void get(){
        System.out.println("Enter first name: ");
        Scanner obj= new Scanner(System.in);
        fname= obj.nextLine();

        System.out.println("Enter Last name: ");
        Scanner obj1= new Scanner(System.in);
        lname= obj1.nextLine();

        System.out.println("Enter yearly salary: ");
        Scanner obj2= new Scanner(System.in);
        sal= obj2.nextDouble();

        if(sal<0){
            sal=0;
        }
    }
    void set(){
        System.out.println("First name: "+fname);
        System.out.println("Last name: "+lname);
        System.out.println("Sal: "+sal);
    }
    void raise(){
        double a;
        a=0.1*sal+sal;
        sal=a;
        System.out.println("After increment in Sal: "+sal);
    }
}
