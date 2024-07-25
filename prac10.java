import java.util.Scanner;

public class prac10 {
    public static void main(String[] args) {
        System.out.println("23DIT024-RAJAN KANZARIYA");
        String s = "CHARUSAT UNIVERSITY";
        System.out.println(s);

        System.out.println("Length of this string is: "+s.length());

        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        //METHOD 1 
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)== 'H'){
                s=s.replace(s.charAt(i), s1.charAt(0));
            }
        }
        System.out.println("After replacement by method 1: "+s);

        //METHOD 2
        char ch[] = s.toCharArray();
        char ch1[]=s1.toCharArray();
        ch[1] = ch1[0];
        String j = new String(ch);

        System.out.println("After replacement by method 2: "+j);
       
        System.out.println("Lowercase: "+j.toLowerCase());
    }
}
