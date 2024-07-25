import java.util.*;

public class prac8 {

    public static void main(String[] args) {

        String ip;

        Scanner obj = new Scanner(System.in);
        System.out.println("23DIT024-RAJAN KANZARIYA");
        System.out.println("Enter the word: ");
        ip = obj.nextLine();
        transform(ip);

    }

    public static void transform(String ip){

        String a=ip,x="";

        for(int i=0;i<a.length();i++){
            x= x + a.charAt(i) + a.charAt(i);

        }
        System.err.println(x);
  
        

    }
    
}