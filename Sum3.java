import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(arr,0);
       System.out.println(res);
        
        
    }
    public static List<List<Integer>> threeSum(int arr [],int target)
    {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            if(i!=0&&arr[i]==arr[i-1]) {
                continue;
            }
            List<List<Integer>> sub=twoSum(arr,i+1,arr.length-1,target-arr[i]);
            for (List<Integer> l:sub) {
                l.add(arr[i]);
                res.add(l);
            }

        }
        return res;
    }
    public static List<List<Integer>> twoSum(int arr[], int start, int end, int target) {
        int first = start;
        int last = end;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        while (first < last) {

            if (first > start && arr[first] == arr[first - 1]) {
                first++;
                continue;
            }
            if (arr[first] + arr[last] == target) {
                List<Integer> l = new ArrayList<>();
                l.add(arr[first]);
                l.add(arr[last]);
                first++;
                last--;
                res.add(l);
            }
            else{
                if (arr[first] + arr[last] < target) {
                    first++;
                }
                else {
                    last--;
                }

            }

        }
        return res;
    }
}
