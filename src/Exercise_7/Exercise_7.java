package Exercise_7;
import java.lang.Math;
public class Exercise_7 {
    public static double stdev(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double average=(double) sum/arr.length;
        double val=0;
        for(int j=0;j<arr.length;j++){
            val+=Math.pow(arr[j]-average,2);
        }
        double std=val/(arr.length-1);
        std=Math.sqrt(std);
        return std;
    }
    public static void main(String[] args){
        int[] arr={1,-2,4,-4,9,-6,16,-8,25,-10};
        System.out.println(stdev(arr));
    }
}
