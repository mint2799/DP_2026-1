package hw.ch02;

public class Main {
    public static void main(String[] args){
        System.out.println("학번: 20230776 이름: 김성희");
        System.out.println();
        
        KoreanOutlet outlet = new KoreanOutlet();

        Charger adapter = new KoreanOutletAdapter(outlet);

        Smartphone phone = new Smartphone(adapter);

        phone.charge();
    }
}
