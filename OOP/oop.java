class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println("name= "+this.name);
        System.out.println("age= "+this.age);
    }
}

class Pen{
    String color;

    public void printColor(){
        System.out.println("The color of the pen is "+ this.color);
    }
}

public class oop {
    public static void main(String[]args){
        //----STUDENT------
        Student s1 = new Student();
        s1.name="abhinab";
        s1.age=18;

        s1.getInfo();

        Student s2 = new Student();
        s2.name="aman";
        s2.age=19;

        s2.getInfo();

        //---PEN---
        Pen p1 = new Pen();
        p1.color="red";
        
        Pen p2 = new Pen();
        p2.color="black";

        Pen p3 = new Pen();
        p3.color="blue";

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
