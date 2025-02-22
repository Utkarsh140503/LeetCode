import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int ans[] = new int[k];

        for (int x = 0; x < nums.length; x++) {
            h.put(nums[x], h.getOrDefault(nums[x], 0) + 1);
        }

        Map<Integer, Integer> sortedMap = h.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int count = 0;
        for (int key : sortedMap.keySet()) {
            if (count < k) {
                ans[count] = key;
                count++;
            } else {
                break;
            }
        }

        return ans;
    }
}
