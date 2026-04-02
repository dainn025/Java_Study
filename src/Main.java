public class Main {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.generate();  // 랜덤 숫자 생성

        int[] newNum = randomNumber.getNumbers(); // 랜덤 숫자 return

        System.out.println(newNum[0]);
        System.out.println(newNum[1]);
        System.out.println(newNum[2]);

        GameFlowController gameFlowController = new GameFlowController();
        String decideGameStart = gameFlowController.decideGameStart();
        int playCount = gameFlowController.getPlayCount();

        if (decideGameStart.equals("Y")) {
            // 게임 실행
            System.out.println("게임을 시작합니다.");
            System.out.println("총 진행된 게임 횟수 : " + playCount);

        } else {
            // 게임 종료
            System.out.println("게임을 종료합니다.");
        }
    }

}