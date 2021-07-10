package leetcode.jul2021;

public class DecodeWaysII {
    public int numDecodings(String s) {
        long mod = (long) Math.pow(10, 9) + 7;
        long endingAny = 1, ending1 = 0, ending2 = 0;
        for (char c : s.toCharArray()) {
            long curEndingAny = 0;
            if (c == '*') {
                curEndingAny = 9 * endingAny + 9 * ending1 + 6 * ending2;
                ending1 = endingAny;
                ending2 = endingAny;
            } else {
                curEndingAny = (c == '0' ? 0 : endingAny) + ending1 + (c <= '6' ? ending2 : 0);
                ending1 = (c == '1' ? endingAny : 0);
                ending2 = (c == '2' ? endingAny : 0);
            }
            endingAny = curEndingAny % mod;
        }
        return (int) endingAny;
    }
}
