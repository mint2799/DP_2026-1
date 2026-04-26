package hw.ch10;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20230776 이름: 김성희");
        System.out.println();

        System.out.println("===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));

        System.out.println("\n===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());
        
        // CyclicStrategy 테스트: 순환 확인
        System.out.println("CyclicStrategy 의 손가락 순환:");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i+1) + "번째: " + hand);
            cyclic.study(false); // study 호출해도 영향 없음
        }
        
        // 게임 진행 코드...
        // player1 과 player 2 를 10 번 게임을 진행시킴
    }
}
