package practice.ch03;

public class Main {
    public static void main(String[] args){
        // CharDisplay d1 = new CharDisplay('H');  // 'H': character, "H": 문자열
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display();
        // d1.open();
    
        // StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();

        // 추상 클래스는 인스턴스를 만들 수 없다.
        // AbstractDisplay d3 = new AbstractDisplay();
    }
}