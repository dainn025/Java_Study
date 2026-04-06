// 입력값 검증하는 class
public class NumberValidator {
    public String validate(String userNumbers) {

        // 입력값이 3자리가 아닌 경우
        if (userNumbers.length() != 3) {
            return "입력 값이 3자리가 아닙니다.";
        }

        // 숫자가 아닌 값을 입력한 경우
        for (int i=0; i < userNumbers.length(); i++) {
            if (!Character.isDigit(userNumbers.charAt(i))) {
                return "숫자가 아닌 값입니다";
            }
        }

        // 중복된 값을 입력한 경우
        for (int i = 0; i < userNumbers.length(); i++) {
            char c = userNumbers.charAt(i);  // 한 글자씩 가져오기

            for (int j = i + 1; j < userNumbers.length(); j++) {
                char n = userNumbers.charAt(j);
                if (c == n) {
                    return "중복된 값입니다.";
                }
            }
        }

        // 숫자 범위가 1~9가 아닌 경우
        for (int i = 0; i < userNumbers.length(); i++) {
            int num = userNumbers.charAt(i) - '0'; // char를 int로 변환

            if (num < 1 || num > 9) {
                return "1~9 사이값이 아닙니다.";
            }
        }

        return null;
    }
}