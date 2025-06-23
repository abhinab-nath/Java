class Triangle{
    
    double side1, side2, side3;

    Triangle(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public double calculateArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }
}

public class triangle_param {
    public static void main(String [] args){
        Triangle t = new Triangle(3,4,6);

        System.out.println("Area of triangle: "+ t.calculateArea());
    }
}

