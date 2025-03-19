public class kadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int start = 0, end = 0, tempStart = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
                start=tempStart; // update start index
                end=i; // update actual end index
            }
            if(curSum<0){
                curSum=0;
                tempStart=i+1 ; // update start index
            }

        }
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        return maxSum;
    }
}
