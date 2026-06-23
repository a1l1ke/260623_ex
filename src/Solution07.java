//import com.example.Airplane;

import com.example.Alpha;
//import com.example.Beta;

public class Solution07 {
    public static void main(String[] args) {
        // 클래스 - 접근 제어자 차이
        Alpha alpha = new Alpha(); // public 접근제어
//        Airplane airplane = new Airplane(); // default 접근제어
//        Beta beta = new Beta();
        // 멤버변수 - 접근 제어자 차이
        System.out.println("alpha.airplane = " + alpha.airplane);
//        System.out.println(alpha.airplane.wing); // private
//        System.out.println(alpha.airplane.wing2); // default - 같은 경로면 접근 가능
//        System.out.println(alpha.airplane.wing3); // 멤버변수 자체는 public이지만 클래스가 public이 아니기 때문에 접근 불가능
//        alpha.beta
    }
}
