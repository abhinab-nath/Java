import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;

    public void Record(int x, int y){
        length=x;
        breadth=y;
    }

    public void area(){
        System.out.println("area of rectangle= "+length*breadth);
    }
}
public class area_rectangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Rectangle r1 = new Rectangle();
        r1.Record(x,y);
        r1.area();

    }
}