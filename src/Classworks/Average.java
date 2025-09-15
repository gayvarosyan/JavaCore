package Classworks;

public class Average {
    public static void main(String[] args) {
        double[] nums={10.2,11.3,14.5,16.7,19.4};
        double result= 0;
        for (int i = 0; i < nums.length; i++) {
            result = result +nums[i];
        }
        System.out.println("result = " + result);
        System.out.println(result/nums.length);
    }
}
