public class maxSumSubarrayOfKSize{
    public static void main(String[] args) {
        int arr[]= {1,1,-1,-2,-3,5,6,10,-1,-2,20,3,-1};
        int window=1;
        int sum=maxSum(arr,window);
        System.out.println(sum);
    }
    public static int maxSum(int arr[],int window)
    {
        int max=0;
        int i=0;
        int j=0;
        int sum=0;
        while(j<arr.length)
        {
            sum=sum+arr[j];
            if(j-i+1<window)
            {
                j++;
            }
            else{
                if(max<sum)
                    max=sum;
                sum=sum-arr[i];
                j++;
                i++;
            }
        }
        return max;
    }
}
