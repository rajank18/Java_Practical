public class prac16 {
    public static void main(String[] args) {
        System.out.println("23DIT024-RAJAN KANZARIYA");
        parent p1= new parent();
        child c1= new child();
        p1.xyz();
        c1.xyzz();
        c1.xyz();
    }
}

class parent{
    void xyz(){
        System.out.println("This is a parent class.");
    }
    
}

class child extends parent{
    void xyzz(){
        System.out.println("This is a child class.");
    }
}
