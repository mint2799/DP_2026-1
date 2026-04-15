package practice.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random; // null로 항상 초기화
    private boolean won = false;  // false를 생략해도 자동으로 초기화 됨
    private Hand prevHand;  // 이전에 낸 손

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
