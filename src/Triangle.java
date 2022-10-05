public class Triangle {
    int a;
    int b;
    int c;
     public void mArea(){
         double s = (double)(a+b+c)/2;
         double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.println("Area of triangle "+area);
     }


}
