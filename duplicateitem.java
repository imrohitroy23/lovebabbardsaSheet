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
//
public int findDuplicate(int[] nums) {
  int len = nums.length;
int[] cnt = new int[len + 1];
for (int i = 0; i < len; i++) {
    cnt[nums[i]]++;
    if (cnt[nums[i]] > 1) {
        return nums[i];
    }
}

return len;
}