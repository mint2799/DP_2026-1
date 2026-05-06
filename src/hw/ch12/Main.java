package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20230776 이름: 김성희");
        System.out.println();

        MultiStringDisplay md = new MultiStringDisplay();

        md.add("Hi!");
        md.add("Good morning.");
        md.add("Good night!");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
