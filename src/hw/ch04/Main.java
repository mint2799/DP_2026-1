package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // [3-1] ㅕ
        Factory factory = new IDCardFactory("2026-03-20");
        Product card1 = factory.create("Kim Youngjin");
        Product card2 = factory.create("Son Heungmin");

        card1.use();
        card2.use();

    }
}
