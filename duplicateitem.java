import java.util.HashSet;
import java.util.Set;

class duplicateitem {

  public int findDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      if (!set.add(nums[i])) {
        return nums[i];
      }
    }

    return len;
  }
}
