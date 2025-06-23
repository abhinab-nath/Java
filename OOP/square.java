class S{
    int side;

    public int area(){
        return side * side;
 
    }

    public int perimeter(){
        return 4 * side;
 
    }
}

public class square {
    public static void main(String [] args){
        S sq = new S();
        sq.side = 4;
        System.out.println("Area: "+ sq.area());
        System.out.println("Perimeter: "+ sq.perimeter());
    }
}
