package practice.ch06;

import practice.ch06.MessageBox;
// import prcatice.ch06.UnderlinePen;

public class Main {
    public static void main(String[] args){
        // 원본(prototype)이 일을 함
        MessageBox mbox1 = new MessageBox('*');
        mbox1.use("Hello, world.");

        // 복제된 객체가 일을 함
        mbox1.createCopy().use("Hello, world.");

        // 원본(prototype)이 일을 함
        UnderlinePen upen1 = new UnderlinePen('-');
        upen1.use("Hello, world.");

        // 복제된 객체가 일을 함
        upen1.createCopy().use("Hello, world.");

        // Manager manager = new Manager();
        // MessageVox mbox2 = new MessageBox('#');

        // Product p1 = manager.create
    }
}
