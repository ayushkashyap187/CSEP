package twoDimArray;

import java.sql.Array;

public class q_59 {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];

        int top=0;
        int right=n-1;
        int bottom=n-1;
        int left=0;
        int num=1;

        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++) {
                ans[top][i]=num++;
            }
            top++;
            for (int i = right+1; i <=bottom ; i++) {
                ans[i][right]=num++;
            }
            right--;
            for (int i = right; i >= bottom; i--) {
                ans[bottom][i]=num++;
            }
            bottom--;
            for (int i = bottom; i >=top ; i--) {
                ans[i][left]=num++;
            }
            left++;
        }
        return ans;
    }

}
