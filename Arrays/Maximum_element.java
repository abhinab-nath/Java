
public class Maximum_element{
    public static void main(String[]args){
        int[] arr = {122, 50, 3, 95, 620};
        int max =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}