public class Solution {
    public int solution(int A, int B){
        int count = 0;
        for (int i = A; i <= B ; i++) {
            double temp = Math.sqrt(i);
            if (temp%1==0)
                count++;
        }
        return count;
    }
}
