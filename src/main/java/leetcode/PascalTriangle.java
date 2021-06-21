package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int line = 1; line <= numRows; line++){
            List<Integer> col = new ArrayList<>();
            int c =1;

            for(int i = 1; i <= line; i++){
                col.add(c);
                c = c * (line - i) / i;
            }
            ans.add(col);
        }

        return ans;
    }
}
