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
}

// 아무 것도 안 붙으면 default
class Airplane {

}