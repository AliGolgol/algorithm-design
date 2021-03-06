package leetcode.jul2021;

import java.util.Arrays;

public class ThreeEqualParts {
    public int[] accept(int[] arr) {
        int[] IMP = new int[]{-1, -1};
        int N = arr.length;

        int S = 0;
        for (int x : arr) S += x;
        if (S % 3 != 0) return IMP;
        int T = S / 3;
        if (T == 0)
            return new int[]{0, N - 1};

        int i1 = -1, j1 = -1, i2 = -1, j2 = -1, i3 = -1, j3 = -1;
        int su = 0;
        for (int i = 0; i < N; ++i) {
            if (arr[i] == 1) {
                su += 1;
                if (su == 1) i1 = i;
                if (su == T) j1 = i;
                if (su == T + 1) i2 = i;
                if (su == 2 * T) j2 = i;
                if (su == 2 * T + 1) i3 = i;
                if (su == 3 * T) j3 = i;
            }
        }

        int[] part1 = Arrays.copyOfRange(arr, i1, j1 + 1);
        int[] part2 = Arrays.copyOfRange(arr, i2, j2 + 1);
        int[] part3 = Arrays.copyOfRange(arr, i3, j3 + 1);

        if (!Arrays.equals(part1, part2)) return IMP;
        if (!Arrays.equals(part1, part3)) return IMP;

        int x = i2 - j1 - 1;
        int y = i3 - j2 - 1;
        int z = arr.length - j3 - 1;

        if (x < z || y < z) return IMP;
        return new int[]{j1 + z, j2 + z + 1};
    }
}
