public class sum_of_elements{
    public static void main(String[]args){
        float [] num = {50.6f, 45.9f, 67.3f, 49.3f, 99.3f};
        float sum=0;
        for(float i: num){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}