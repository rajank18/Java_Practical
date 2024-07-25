import java.util.Scanner;

public class prac7 {
    public static void main(String[] args){
        System.out.println("23DIT024-RAJAN KANZARIYA");
            int count=0;
            System.out.println("Enter array size: ");
            Scanner obj = new Scanner(System.in);
            int x= obj.nextInt();
            Scanner obj2= new Scanner(System.in);

            int arr[]=new int[x];
            System.out.println("Enter array: ");
            for(int i=0;i<x;i++){
                arr[i]=obj2.nextInt();
            }

            for (int i = 0; i < x; i++) {
                if(arr[i]==9){
                    count++;
                }
            }

            System.out.println("9 appears "+count+" Times!!");
    }
}
