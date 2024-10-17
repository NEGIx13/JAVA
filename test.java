class price{
    int atm(){
        return 10000;
    }
}

class test{
    public static void main(String[] args){
        price p = new price();
        System.out.println(p.atm());
    }
}

