package Exercise_6;
import java.util.Arrays;

public class Exercise_6 {
    public static int median(int[] arr){
        Arrays.sort(arr);
        int median1=arr[(arr.length-1)/2];
        return median1;
    }
    public static void main(String[] args){
        int[] arr={5,2,4,17,55,4,3,26,18,2,17};
        int[] arr1={42,37,1,97,1,2,7,42,3,25,89,15,10,29,27};
        System.out.println(median(arr));
        System.out.println(median(arr1));
    }
}
