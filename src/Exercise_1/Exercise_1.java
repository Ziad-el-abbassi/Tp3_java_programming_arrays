class Exercise_1{
    public static void printArray(int[] arr){
        for(int k=0;k<arr.length;k++){
            System.out.println("Element "+k+" contents "+arr[k]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] new_arr=new int[arr.length];
        for(int p=0;p<arr.length;p++){
            new_arr[p]=arr[p];
        }
        for(int j=0;j<arr.length-1;j++){
            int idx=j;
            for(int i=j+1;i<arr.length;i++){
                if(new_arr[idx]<new_arr[i]){
                    idx=i;
                }
            }
            int tmp=new_arr[j];
            new_arr[j]=new_arr[idx];
            new_arr[idx]=tmp;
        }
        return new_arr;
    }
    public static void main(String[] args){
        int[] arr={106,26,81,5,15};
        int[] sorted = sortIntegers(arr);
        printArray(sorted);
    }
}