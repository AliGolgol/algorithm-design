package leetcode.jun2021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class OpenTheLock {
    public int accept(String[] deadends, String target) {
        HashSet<String> dead_set = new HashSet<>(Arrays.asList(deadends));
        if (dead_set.contains("0000")) return -1;
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String tmp = queue.remove();
                if (target.equals(tmp)) return count;
                char[] c = tmp.toCharArray();
                for (int j = 0; j < 4; j++) {
                    int i = c[j] - '0';
                    c[j] = (char) ('0' + (i + 9) % 10);
                    String s = new String(c);
                    if (!dead_set.contains(s)) {
                        queue.add(s);
                        dead_set.add(s);
                    }
                    c[j] = (char) ('0' + (i + 11) % 10);
                    s = new String(c);
                    if (!dead_set.contains(s)) {
                        queue.add(s);
                        dead_set.add(s);
                    }
                    c[j] = (char) ('0' + i);
                }
            }
            count++;
        }
        return -1;
    }
}
