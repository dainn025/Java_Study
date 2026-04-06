// 결과값 저장하는 class
public class PitchResult {
    private int strike;
    private int ball;

    public PitchResult(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    // 스트라이크, 볼 갯수 return
    public int getStrike() { return strike; }
    public int getBall() { return ball; }
}