package com.example;

public class Alpha {
    // 기본 생성자는 public
//    Alpha() {
    public Alpha() {
//        Airplane airplane = new Airplane(); // default 접근제어
//        Beta beta = new Beta(); // 같은 패키지 내부라서 (public 안 붙어도)
    }

    // airplace 패키지 외부 접근
    public Airplane airplane = new Airplane();
    Beta beta = new Beta(); // X

    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        System.out.println(alpha.airplane);
        System.out.println(alpha.beta); // 나는 베타도 노출하고 싶지 않아요 내가 혼자만 쓰고 싶어요

//        System.out.println(alpha.airplane.wing); // private
        System.out.println(alpha.airplane.wing2); // default - 같은 경로면 접근 가능
        System.out.println(alpha.airplane.wing3); // public - 모두 접근가능
    }
}

// 아무 것도 안 붙으면 default
class Airplane {
    private String wing;
    String wing2;
    public String wing3;
}