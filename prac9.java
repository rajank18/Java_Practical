import java.util.Arrays;
import java.util.Scanner;
public class prac9 {

    public static void main(String[] args) {
        
            System.out.println("23DIT024-RAJAN KANZARIYA");
            Scanner sc = new Scanner(System.in);
            String s;

            System.out.println("Enter string");
            s = sc.nextLine();
            int size=s.length();

         
            System.out.println("Lower case with built in: ");
            System.out.println(s.toLowerCase());
     
            System.out.println("Lower case without built-in method: ");
            String lowerCase = "";
            for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            lowerCase += ch;
            }
            System.out.println(lowerCase);

       
            System.out.println("Upper case with built in method: ");
            System.out.println(s.toUpperCase());

            System.out.println("Upper case without built-in method: ");
            String upperCase = "";
            for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            upperCase += ch;
            }
            System.out.println(upperCase);

           
            System.out.println("length with built in method: ");
            System.out.println(s.length());

     
            System.out.println("Length without built-in method");
            int a = 0;
            try {
            while (s.charAt(a) != '\0') {
                a++;
            }
            } catch (StringIndexOutOfBoundsException e) {
            }
            System.out.println(a);

        
            String reversedStr = new StringBuilder(s).reverse().toString();
            System.out.println("Reversed string with built-in method: " + reversedStr);

        
            String str="";
            for(int i=size-1;i>=0;i--)
            {
           
            str=str+s.charAt(i);
        
            }
            System.out.println("Reversed string without built in method :"+str);

           char ch[]=new char[size];
           for(int i=0;i<size;i++)
           {
            ch[i]=s.charAt(i);
           }
          
       
           for(int i=0;i<size;i++)
           {
               for(int j=i+1;j<size;j++)
               {
                   if(ch[i]>ch[j])
                   {
                       char temp=ch[i];
                       ch[i]=ch[j];
                       ch[j]=temp;
                   }
               }
           } 
           System.out.println("Sorted string without built in method: "+ch);

 
           Arrays.sort(ch);
           String sort=new String(ch);
           System.out.println("Sorted string with built in method: "+sort);
        }
    }

