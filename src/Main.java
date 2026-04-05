public class Main {
    public static void main(String[] args) {

        // 1. 게임 진행 설정
        GameFlowController gameFlowController = new GameFlowController();
        String decideGameStart = gameFlowController.decideGameStart();
        int playCount = gameFlowController.getPlayCount();

        if (decideGameStart.equals("Y")) {
            // 2. 게임 실행
            System.out.println("게임을 시작합니다.");
            System.out.println("총 진행된 게임 횟수 : " + playCount);

            // 3. 랜덤 숫자 생성
            RandomNumber randomNumber = new RandomNumber();
            randomNumber.generate();
            int[] newNum = randomNumber.getNumbers(); // 랜덤 숫자 생성 후 return

            // 4. 사용자에게 숫자 입력 요청
            NumberInputReader InputReader = new NumberInputReader();
            InputReader.readInput();
            String userNum = InputReader.getUserNumbers();  // 사용자가 입력한 숫자 return

            // 5. 사용자가 입력한 데이터 검증
            NumberValidator validator = new NumberValidator();
            String validationResult = validator.validate(userNum);

            if (!validationResult.equals("OK")) {
                // 실패 사유 출력
                System.out.println(validationResult);
            }

            // 6. 정답 비교

            //


        } else {
            // 게임 종료
            System.out.println("게임을 종료합니다.");
        }
    }
}