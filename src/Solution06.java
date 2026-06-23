public class Solution06 {
    public static void main(String[] args) {
        Util.incrementCount();
        System.out.println("Util.count = " + Util.count); // 같은 경로라면 public 없어도 다른 클래스 쓸 수 있음
        // 접근제어자, 경로, 패키지 -> 고도화 되면, 'public' 제한으로 인해서 모듈화 접근이 어렵게 느껴짐
        Solution06.MyUtil.incrementCount();
    }

    // 특정한 클래스에 소속되어 있는 enum, record 들을 표현하기 위해서 nested 구조를 많이 쓴다
    public static record MyRecord(String name, int age) {

    }

    public static class MyUtil {
        static int count = 0;

        public static void incrementCount() {
            count++;
        }
    }
}
