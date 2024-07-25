import java.util.*;

class Area {

    
    int len,br;


    Area(int x, int y){
    len = x;
    br = y;
    }

    int returnArea(){

      
        return len*br;

    }

}


public class prac14 {

    

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        int x,y;
        System.out.println("23DIT024-RAJAN KANZARIYA");

        System.out.println("Enter the length of rectangle");
       
        x = obj1.nextInt();
        System.out.println("Enter the Bridth of rectangle");
       
        y = obj1.nextInt();

        Area a = new Area(x,y);
        System.out.println(a.returnArea());


        
    }
    
}
