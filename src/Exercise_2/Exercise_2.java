package Exercise_2;

import java.util.Arrays;

public class Exercise_2 {
    public static void reverse(int[] arr){
        System.out.println("Array= "+ Arrays.toString(arr));
        for(int j=0;j<arr.length/2;j++){
            int tmp=arr[arr.length-j-1];
            arr[arr.length-j-1]=arr[j];
            arr[j]=tmp;
        }
        System.out.println("Reversed array= "+Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}
