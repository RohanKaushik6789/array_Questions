import java.util.ArrayList;
import java.util.List;

public class firstNegativeNumberInEveryWindow {
    public static void main(String[] args) {
        int arr[]= {1,1,-1,-2,-3,5,6,10,-1,-2,20,3,-1};
        int window=3;
        List<Integer> sum=firstNegative(arr,window);
        System.out.println(sum);
    }
    public static List<Integer> firstNegative(int [] arr, int window)
    {
        List <Integer> res=new ArrayList<>();
        List <Integer> temp=new ArrayList<>();
        int i=0;
        int j=0;

        while(j<arr.length)
        {
            if(arr[j]<0)
            {
                temp.add(arr[j]);
            }
            if(j-i+1<window)
            {
                j++;
            }
            else
            {
                if(!temp.isEmpty())
                    res.add(temp.get(0));
                else
                    res.add(0);
                if(!temp.isEmpty()) {
                    if (temp.get(0) == arr[i]) {
                        temp.remove(0);
                    }
                }
                j++;
                i++;
            }
        }
        return res;
    }

}
