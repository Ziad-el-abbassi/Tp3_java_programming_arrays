package Exercise_2;

public class Exercise_2 {
    public static void reverse(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int j=0;j<arr.length/2;j++){
            int tmp=arr[arr.length-j-1];
            arr[arr.length-j-1]=arr[j];
            arr[j]=tmp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}
