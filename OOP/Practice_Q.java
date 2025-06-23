// Problem 1
class Employee{
    int salary;
    String  name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

// Problem 2
class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("Calling a friend....");
    }
}

// Problem 3


public class Practice_Q{
    public static void main(String [] args){

        //problem 1
        Employee Alice = new Employee();
        Alice.setName("Alice");
        System.out.println(Alice.getName());
        Alice.salary = 1000000;
        System.out.println(Alice.getSalary());

        //problem 2
        CellPhone phone = new CellPhone();
        phone.ring();
        phone.vibrate();
        phone.callFriend();

        //problem 3
    }
    
}
