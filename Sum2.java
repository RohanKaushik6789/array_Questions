import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 1, 2, 1, 4, 5, 3};
        List<List<Integer>> res = twoSum(arr, 0, arr.length - 1, 6);
         System.out.println(res);
         System.out.println("hello");

    }

    public static List<List<Integer>> twoSum(int arr[], int start, int end, int target) {
        int first = start;
        int last = end;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        while (first < last) {

            if (first != 0 && arr[first] == arr[first - 1]) {
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
            if (arr[first] + arr[last] < target) {
                first++;
            } else {
                last--;
            }

        }
        return res;
    }

}
