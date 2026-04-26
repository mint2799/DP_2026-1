package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // 디렉터리 트리를 만든다
        //Directory root = new Directory("root");

        //업캐스팅은 자동으로 일어난다.
        Entry root = new Directory("root"); // 부모 타입으로 선언하면 자식 객체를 가리킬 수 있으므로 옳은 문장

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        // 다운캐스팅
        ((Directory)root).add(bin); // root가 Entry 타입이면 add 메소드가 없어서 오류 발생
        ((Directory)root).add(tmp); // . 연산자가 타입캐스팅 연산자보다 우선 순위가 높다
        ((Directory)root).add(usr);

        // 파일 생성 및 추가
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        // 디렉토리 리스트 출력
        root.printList();
    }
}
