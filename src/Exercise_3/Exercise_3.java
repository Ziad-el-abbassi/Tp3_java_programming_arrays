package Exercise_3;

public class Exercise_3 {
    public static void main(String[] args){
        int[][] arr=new int[5][];
        int k=1;
        for(int i=1;i<=5;i++){
            arr[i-1]=new int[i];
            for(int j=1;j<=i;j++){
                arr[i-1][j-1]=k++;
                System.out.print(arr[i-1][j-1]+",");
            }
            System.out.println("");
        }
    }
}
