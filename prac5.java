import java.util.*;

class prac5{
    public static void main(String[] args){
        System.out.println("23DIT024-RAJAN KANZARIYA");
        int n,x;

        Random r= new Random();
        x=r.nextInt(100);
       
        
        System.out.println("WELCOME TO THE GAME!!");
        do { 
            System.out.println("Guess the number: ");
            Scanner obj = new Scanner(System.in);
            n=obj.nextInt(  );
            if(n==x){
                System.out.println("Your guessed right number!!!!");
                break;
            }
            else if (n>x) {
                System.out.println("Number is smaller than this!!!");
            }
            else{
                System.out.println("Number is greater than this");
            }
        } while (true);
       

    }

}