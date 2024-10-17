class Q8{  
    int square(int n){  
     return n*n;  
    }      
    public static void main(String args[]){  
      Circle c=new Circle();  
      double result=c.area(5);  
      System.out.println(result);  
    }  
}

class Circle{  
    Q8 op;//aggregation  
    double pi=3.14;  
       
    double area(int radius){  
      op=new Q8();  
      int rsquare=op.square(radius);
      return pi*rsquare;  
    } 
}