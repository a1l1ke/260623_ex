// class -> public class. 1개. 파일명 일치
public class Solution01 {
    public static int count = 0;

    public static void main(String[] args) {
        Teacher teacher; // 스택 메모리에 지역변수를 만듦.
        teacher = null; // 힙과 연결이 안 된 상태. -> NullPointerException
        teacher = new Teacher(); // 힙 영역에 인스턴스 만듦
        System.out.println("teacher = " + teacher); // 힙에 존재
        // 대문자 -> 참조 타입, 객체 타입, 커스텀 타입... -> 힙 영역에서 연결되어야하는 객체의 자리.
        System.out.println("teacher.name = " + teacher.name); // 기본값이 주어짐 (따로 값이 없으면.)
        System.out.println("teacher.age = " + teacher.age); // 0
        System.out.println("teacher.eye = " + teacher.eye); // 0.0
        System.out.println("teacher.grade = " + teacher.grade); // (빈 문자) = int (0)
        System.out.println("teacher.hasDog = " + teacher.hasDog); // false
        count++;
        {
            count++;
            Teacher teacher2 = teacher;
            System.out.println("teacher2 = " + teacher2);
            teacher2.name = "윌리엄";
            teacher2.talk("빌리", 100);
        }
//        System.out.println("teacher2 = " + teacher2);
        System.out.println("teacher.name = " + teacher.name);
        System.out.println("count = " + count);
    }
}

// 메서드 영역.
class Teacher {
    int age; // 정수
    double eye; // 실수
    char grade; // 문자
    boolean hasDog; // 논리
    String name; // 멤버변수 -> 힙 영역
    // 필드(db), 속성(property)
//    static String name; // 경합
    static int count;

    void talk(String name, int count) {
        // 힙 영역 <-> 스택 영역.
        System.out.println("name = " + name); // 스택 영역에 있는 name.
        System.out.println("this.name = " + this.name); // this 인스턴스 영역
        // 스택 영역에 있는 count
        System.out.println("count = " + count);
        // 메서드 영역에 있는 count
        System.out.println("Teacher.count = " + Teacher.count);
        System.out.println("Solution01.count = " + Solution01.count);
        Solution01.count++;
    }
}


