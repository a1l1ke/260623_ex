// 생성자
public class Solution04 {
    public static void main(String[] args) {
        Member m1 = new Member();
//        Member m1 = new Member("");
        Member m2 = new Member("원이", 20);
        System.out.println(m1.name + ", " + m1.age);
        System.out.println(m2.name + ", " + m2.age);
    }
}

class Member {
    String name = "기본값"; // 메서드 영역 (static) 힙 영역 (일반 멤버변수) 는 경합
    int age = 100;

    // new
    Member() {
    } // 컴파일할 때 없으면 알아서 만들어줌

    //    private Member() {}
    // 오버로딩
    Member(String name, int age) {
        // 우선순위가 스택 영역에 있는 매개변수가 먼저 우선권을 가져감
        this.name = name;
        this.age = age;
    }
//    Member(String name) {}
//    static Member factory() {
//        return new Member();
//    }
}
