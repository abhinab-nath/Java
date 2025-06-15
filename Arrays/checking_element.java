public class checking_element {
    public static void main(String[]args){
        float [] num = {50.6f, 45.9f, 67.3f, 49.3f, 99.3f};
        float n = 67.3f;
        boolean isInArray = false;

        for(float element:num){
            if(element == n){
                isInArray = true;
                break;
            }
        }
        if(isInArray==true){
            System.out.println("Element present in the array.");
        }
        else{
            System.out.println("Element is not present in the array.");
        }
    }
}
