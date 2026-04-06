public class Main {
    public static void main(String[] args) {

        // 1. 게임 진행 설정
        boolean isGameOver = false;
        GameFlowController controller = new GameFlowController();

        while (!isGameOver) {
            String decideGameStart = controller.decideGameStart();

            // 랜덤숫자 생성
            RandomNumber randomNumber = new RandomNumber();
            randomNumber.generate();
            int[] newNum = randomNumber.getNumbers(); // 랜덤 숫자 생성 후 return

            System.out.println(newNum[0]);
            System.out.println(newNum[1]);
            System.out.println(newNum[2]);

            BaseballJudge judge = new BaseballJudge();
            NumberInputReader InputReader = new NumberInputReader();
            NumberValidator validator = new NumberValidator();

            while (decideGameStart.equals("Y")) {
                // 2. 게임 실행
                System.out.println("게임을 시작합니다.");
                System.out.println("총 진행된 게임 횟수 : " + controller.getPlayCount());

                // 4. 사용자에게 숫자 입력 요청
                InputReader.readInput();
                String userNum = InputReader.getUserNumbers(); // 사용자가 입력한 숫자 return
                System.out.println("입력한 숫자 : " + userNum);

                // 5. 사용자가 입력한 데이터 검증
                String validationResult = validator.validate(userNum);

                if (validationResult != null) {
                    // 데이터 검증 결과 - 실패
                    System.out.println("게임 진행 불가 : " + validationResult);
                    continue;
                }

                // 6. 스트라이크, 볼 개수를 계산
                PitchResult result = judge.judge(newNum, userNum);
                int strike = result.getStrike();
                int ball = result.getBall();

                if (strike == 3) {
                    System.out.println("3 스트라이크!!");
                    String restart = controller.decideGameStart();

                    if (restart.equals("N")) {
                        isGameOver = true; // 재시작 X → 게임 종료
                    }

                    controller.resetPlayCount(); // 게임진행 횟수 초기화
                    break;

                } else if (strike == 0 && ball == 0) {
                    System.out.println("아웃!");

                } else {
                    System.out.println(ball + " 볼 // " + strike + " 스트라이크!!");
                }
                controller.incrementPlayCount(); // 게임진행 횟수 증가
            }

            // 게임 종료
            if (isGameOver) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}