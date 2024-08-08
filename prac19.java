public class prac19 {

    public static void main(String[] args) {

        square s = new square();
        s.print1();
        s.print2();
        
        
    }
    
}

class shape {

    void print1(){
        System.out.println("This is Shape");
    }

}

class rectangle extends shape {

    void print2(){
        System.out.println("This is Rectangular shape");
    }

}

class circle extends shape {

    void print(){
        System.out.println("This is Circular shape");
    }

}

class square extends rectangle {
     void print(){
        System.out.println("Square is a Rectangle");
     }
}
