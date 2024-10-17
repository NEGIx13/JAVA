import GGS.*;

public class OOPS_concept {

    public static void main(String[] args){
        packing p = new packing();
        rectangle r = new rectangle();
        r.br = new point();
        r.tl = new point();
        r.br.x = 10;
        r.br.y = 20;
        r.tl.x = 30;
        r.tl.y = 40;

        System.out.println(r.br.x + r.br.y + r.tl.x + r.tl.y);
        p.print();
    }    
}

class point{
    int x;
    int y;
}

class rectangle{
    point tl;
    point br;
}








