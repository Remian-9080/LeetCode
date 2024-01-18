import java.util.HashMap;
import java.util.Map;

class two_sum {
    public int[] two_Sum(int[] nums, int target) 
    
    {
Map<Integer,Integer> HM=new HashMap<>();
    int looking;     
    for(int i=0;i<nums.length;i++)
    {
    looking=target-nums[i];
    if(HM.containsKey(looking))
    {
        return new int []{HM.get(looking),i};
    }
    HM.put(nums[i],i);
    }
    int arr[]=new int[2];
    return arr;
    }
     
    
   
}