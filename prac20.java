public class prac20 {
    
    public static void main(String[] args) {
        degree d = new degree();
        undergraduated u = new undergraduated();
        postgraduated p = new postgraduated();

        d.getDegree();
        u.print();
        p.print();
        
    }
}

class degree {

    void getDegree() {
        System.out.println("I got a degree");
    }

}

class undergraduated extends degree {

    void print(){
        System.out.println("I am an undergraduated");
    }
}

class postgraduated extends  degree{

    void print(){
        System.out.println("I am a postgraduated");
    }
}


