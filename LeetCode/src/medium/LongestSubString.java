package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
            if(s == null || s.equals("")){
                return 0;
            }
            int maxLength = 1;
            for(int i = 0;i<s.length()-1;i++){
                int[] record = new int[127];
                record[s.charAt(i)] = i+1;
                int k =1;
                for(int j = i+1;j<s.length();j++)
                {
                    int num = s.charAt(j);
                    if(record[num] != 0){
                        maxLength = maxLength<k?k:maxLength;
                        break;
                    }
                    record[num] = j+1;
                    k++;
                }
                maxLength = maxLength<k?k:maxLength;
            }
            return maxLength;
        }

    public static void main(String[] args){
        int s = lengthOfLongestSubstring(new String(""));
        System.out.println(s);
    }
}
