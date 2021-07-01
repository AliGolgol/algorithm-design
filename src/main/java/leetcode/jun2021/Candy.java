package leetcode.jun2021;

public class Candy {
    public int accept(int[] ratings) {
        if(ratings == null || ratings.length == 0) return 0;

        int[] candies = new int[ratings.length];
        candies[0] = 1;
        //[1,0,2] -> 1,1,2
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i - 1]){
                candies[i] = candies[i - 1] + 1;
            }else{
                candies[i] = 1;
            }
        }

        int result = candies[candies.length - 1];
        for(int i = ratings.length - 2; i >= 0; i--){
            int cur = 1;
            if (ratings[i] > ratings[i + 1]) {
                cur = candies[i + 1] + 1;
            }

            result += Math.max(cur, candies[i]);
            candies[i] = cur;
        }

        return result;
    }
}
