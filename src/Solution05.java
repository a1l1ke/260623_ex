// static
public class Solution05 {
    public static void main(String[] args) {
        // static
        Util.incrementCount(); // new로 만든 게 어딘가 있어야 힙 영역에서 생성.
        System.out.println("Util.count = " + Util.count);
    }
}

class Util {
    final static int MAX = 10;
    static int count = 0;

    static void incrementCount() {
        count++;
//        this.instanceField = 10;
        // 힙을 모르고 굳이 외부에 쓰려면
        // static에 있는 다른 정적(static)멤버변수를 가져오거나
        // 패러미터로 가져와야함
    }

    static void incrementCount(int i) {
        count += i;
    }

    int instanceField;
}