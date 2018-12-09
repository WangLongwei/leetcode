package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum {
    public static void main(String[] args)
    {

    }

    public int[] twoSum(int[] nums,int target)
    {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i];
            if(numMap.containsKey(diff))
            {
                return new int[]{numMap.get(diff),i};
            }
            numMap.put(nums[i],i);
        }
        return null;
    }
}
