import java.util.*;

class Main {
    public static void findLeads(int[] arr)
    {
        List<Integer> results = new ArrayList<>();
        int rightIndex = arr[arr.length - 1];
        
        results.add(rightIndex);
        
        for(int i=arr.length-2; i>=0; i--)
        {
            if(arr[i]>rightIndex)
            {
                rightIndex = arr[i];
                results.add(rightIndex);
            }
        }
        
        Collections.reverse(results);
        System.out.println("Leaders are in the array :"+results);
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        findLeads(arr);
    }
}

//hey am there