import java.util.Scanner;

// 게임 진행 class
public class GameFlowController {
    private Scanner sc = new Scanner(System.in);;
    private int playCount;  // 게임진행 횟수

    // 사용자에게 게임 진행 질문 후 입력값 수집
    private String askUser() {

        if (playCount == 0) {
            System.out.println("게임을 시작하시겠습니까? (Y or N)");
        } else {
            System.out.println("게임을 계속 진행하시겠습니까? (Y or N)");
        }

        return sc.next();
    }

    // 사용자 입력값 검증
    private String validateAnswer(String answer) {
        answer = answer.toUpperCase();

        // 사용자가 정상적인 값을 입력할 때까지 반복
        while (!answer.equals("Y") && !answer.equals("N")) {
            System.out.println("Y 또는 N을 입력해주세요!");
            answer = sc.next().toUpperCase();
        }
        return answer;
    }

    public String decideGameStart(){
        String answer = askUser();
        answer = validateAnswer(answer);

        if (answer.equals("Y")) {
            playCount += 1;   // 입력 값이 Y 인 경우 게임진행 횟수 증가
        }
        return answer;
    }

    // 게임 진행 횟수 return
    public int getPlayCount() {
        return playCount;
    }
}
