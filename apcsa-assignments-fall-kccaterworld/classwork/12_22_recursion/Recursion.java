// base cases: n = 0 or n = 1
// recursive case: return isEven(n - 2)

public class Recursion {
    public static boolean isEven(int n) {
        if (n == 0) return true;
        else if (n == 1) return false;
          else isEven(n - 2);
    }
    
    public static int sumArray(int[] nums, int index) {
        return (index == 0) ? nums[0] : nums[index] + sumArray(nums, index++);
    }
}
