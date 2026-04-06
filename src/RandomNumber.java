import java.util.Random;

// 랜덤 숫자 생성하는 class
public class RandomNumber {
    private int[] numbers; // 랜덤숫자를 저장하는 변수

    // 생성자 (배열 3칸만 생성되도록 초기화)
    RandomNumber() {
        this.numbers = new int[3];
    }

    // 랜덤숫자 생성하는 메소드
    public void generate() {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int num = 0;
            boolean b_overlap;

            do {
                b_overlap = false;
                num = random.nextInt(9) + 1;

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == num) {

                        // 숫자 중복 O
                        b_overlap = true;
                        break;
                    }
                }
            } while (b_overlap);

            numbers[i] = num;
        }
    }

    // 랜덤 숫자를 return 하는 메소드
    public int[] getNumbers() {
        return this.numbers;
    }
}