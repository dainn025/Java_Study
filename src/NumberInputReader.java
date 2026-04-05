import java.util.Scanner;

// 숫자 입력 받는 class
public class NumberInputReader {
    Scanner sc = new Scanner(System.in);
    private String userNumbers;


    // 사용자에게 숫자 입력 요청
    public void readInput() {
        System.out.print("숫자 3자리를 입력하세요: ");
        userNumbers = sc.nextLine();
    }

    // 입력값 return
    public String getUserNumbers() {
        return this.userNumbers;
    }
}