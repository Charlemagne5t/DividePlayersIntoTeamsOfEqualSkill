import java.util.HashMap;
import java.util.Map;

class Solution {
    public long dividePlayers(int[] skill) {
        long sum = 0;
        for(int x : skill) {
            sum += x;
        } 
        int k = skill.length / 2;
        if(sum % k != 0) {
            return -1L;
        }

        long target = sum / k;
        long res = 0L;
        Map<Long, Integer> map = new HashMap<>();
        for (int x : skill) {
            long toFind = target - x;
            if (map.containsKey(toFind)) {
                int c = map.remove(toFind);
                c--;
                res += x * toFind;
                if (c > 0) {
                    map.put(toFind, c);
                }
            } else {
                int c = map.getOrDefault(0L + x, 0);
                c++;
                map.put(0L + x, c);
            }

        }
        if(!map.isEmpty()) {
            return -1;
        }
        
        return res;
    }
}