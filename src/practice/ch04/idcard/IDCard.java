package practice.ch04.idcard;

import practice.ch04.framework.Product; // Product가 다른 패키지에 있기 때문에 import 해주어야 함

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {   // 접근지정자를 생략하면 같은 패키지 내에서만 가시적임 -> main.java에서는 확인 불가, 직접 생성을 제한하기 위함
        // 부모의 인자 없는 생성자를 호출함
        // super(); // 생략 가능
        // super("x", "y");
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다."); // 객체 + 문자열인 경우 컴파일러가 this.toString()을 자동으로 호출
    }

    @Override
    // Object 클래스의 toString 메소드 오버라이드
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
