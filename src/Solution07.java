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
//        alpha.beta
    }
}
