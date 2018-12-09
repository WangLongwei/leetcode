package Easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        boolean isLow = false;
        if(x<0){
            x = -x;
            isLow = true;
        }
        while(x % 10 != 0 || x / 10 != 0){
            result = result * 10 + x%10;
            x = x/10;
        }
        result = isLow?-result:result;
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }
}
