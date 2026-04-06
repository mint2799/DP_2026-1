package hw.ch04.idcard;

import java.util.HashMap;
import java.util.Map;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private Map<Integer, String> owners = new HashMap<>();
    private String baseDate;

    public IDCardFactory(String baseDate){
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        owners.put(card.getSerial(), card.getOwner());  // serial을 키로, owner를 값을 저장
        System.out.println(product + "을 등록했습니다.");
    }

    public String getOwner(int serial) {
        return owners.get(serial);
    }
}
