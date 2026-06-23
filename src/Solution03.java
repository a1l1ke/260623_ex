// 메서드
public class Solution03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.print("Hello");
        int result = calculator.add(1, 2);
//        int result = calculator.add(1);
//        int result = calculator.add(1, 2, 3);
//        int result = calculator.add("1", "2"); // 컴파일을 막음
//        String result = calculator.add(1, 2);
        System.out.println("result = " + result);
        String result2 = calculator.add("1", "2");
        System.out.println("result2 = " + result2);
        int result3 = calculator.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("result3 = " + result3);
    }
}

class Calculator {
    // 타입 메서드명(매개변수 목록 <- 타입) { 메서드 바디 }
    void print(String message) {
        System.out.println("message = " + message);
//        return; // 흐름제어
    }

    int add(int a, int b) {
        // 타입 지정 시 해당 타입을 반환하는 return이 꼭 있어야함
//        int result = a + b;
//        return result;
        return a + b;
    }

    // 오버로딩 -> 같은 메서드 이름에 다른 매개변수 목록 (과적 -> 2개 이상이 들어가서)
    // 메서드 '타입'만 인정
    String add(String a, String b) {
        return a + b;
    }

    // 패러미터 이름만 다르고 갯수, 타입이 중복되므로 컴파일 과정에서는 같은 걸로 침 (overloading 불가)
//    int add(int c, int d) {
//        return c + d;
//    }

    int add(int a, int b, int c) {
        System.out.println(); // 줄 바꿈
        System.out.println(1); // 같은 이름을 써서 비슷한 작업한다는 것을 알려주면서 패러미터로 구분.
        System.out.println("1"); // 매개변수 조합에 따라 다른 이름을 쓰지 않고도 같은 메서드 이름으로 호출하여 사용할 수 있게
        // over'loading' - 과적
        return a + b + c;
    }

    // 가변인자를 쓸 수 있음 - 맨 뒤에 와야한다
    int add(int a, int... numbers) { // dto, vo, record.
        int c = numbers[0];
        int sum = 0;
        for (int number : numbers) {
            System.out.println("number = " + number);
            sum += number;
        }
        return sum;
    }

    // 자바는 구조분해할당 '없음'
    // 참고 : AST - 추상 구문 트리 (파이썬, 자바스크립트...)

    int add(DTO dto) { // POJO (Plain Old Java Object), VO, DTO
        return dto.a + dto.b;
    }
}

class DTO {
    int a;
    int b;
}