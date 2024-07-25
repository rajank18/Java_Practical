import java.util.*;

public class datetest{
    public static void main(String[] args) {
        System.out.println("23DIT024-RAJAN KANZARIYA");
        date d1 = new date();
        d1.sety();
        d1.setm();
        d1.setd();
        d1.gety();
        d1.getm();
        d1.getd();
        d1.display();
    }
}

class date{
    int month,day,year;
    Scanner obj= new Scanner(System.in);
    date(){
        month=0;
        day=0;
        year=0;
    }

    void sety(){
        System.out.println("Enter Year: ");
        year= obj.nextInt();
    }

    void setm(){
        System.out.println("Enter Month: ");
        month= obj.nextInt();
        if(month>12){
            System.out.println("***INVALID***");
            System.out.println("Enter valid Month: ");
            month= obj.nextInt();
        }
    }

    void setd(){
        System.out.println("Enter Day: ");
        day= obj.nextInt();
        if(day>31){
            System.out.println("INVALID!!!");
            System.out.println("ENTER VALID DAY: ");
            month= obj.nextInt();
        }
    }

    void gety(){
        System.out.println("Entered year is: " + year);
    }
    void getm(){
        System.out.println("Entered month is: " + month);
    }
    void getd(){
        System.out.println("Entered day is: " + day);
    }
    void display(){
        System.out.println("Date is : " + day + "/" + month + "/" + year);
    }
}
