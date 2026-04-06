// 스트라이크, 볼 개수를 계산하는 class
public class BaseballJudge {

    public PitchResult judge(int[] newNum , String userNum) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < newNum.length; i++) {
            for (int j = 0; j < newNum.length; j++) {


                if ((userNum.charAt(i) - '0') == newNum[j] && i == j) {
                    strikeCount += 1;  // 스트라이크
                }

                if ((userNum.charAt(i) - '0') == newNum[j] && i != j) {
                    ballCount += 1; // 볼
                }
            }
        }
        return new PitchResult(strikeCount, ballCount);
    }
}
