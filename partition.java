import java.io.*;
import java.util.*
public class Partition
{
    public static void main(string[]args)
    static boolean isSubsetSum (int arr[], int d, int sum)
    {
        if (sum == 0)
            return true;
        if (d == 0 && sum != 0)
            return false
            if (arr[d-1] > sum)
            return isSubsetSum (arr, d-1, sum);
 
       
        return isSubsetSum (arr, d-1, sum) ||
               isSubsetSum (arr, d-1, sum-arr[d-1]);
    }
 
  
    static boolean findPartition (int arr[], int d)
    {
      
        int sum = 0;
        for (int i = 0; i < d; i++)
            sum += arr[i];
 
   
        if (sum%2 != 0)
            return false;
 
        return isSubsetSum (arr, d, sum/2);
    }
 
    
    public static void main (String[] args)
    {
 
        int arr[] = {3, 1, 5, 9, 12};
        int d = arr.length;
        if (findPartition(arr, d) == true)
            System.out.println("Can be divided into two "+
                                "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                                "two subsets of equal sum");
    }
}
