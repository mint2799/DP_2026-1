package hw.ch04.license;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;
    private Map<Integer, String> holders = new HashMap<>();
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String holder) {
        LocalDate issued = LocalDate.parse(baseDate);
        String expiry = issued.plusYears(5).toString();
        return new LicenseCard(holder, licenseCounter++, baseDate, expiry);
    }

    @Override
    protected void registerProduct(Product product) {
        LicenseCard card = (LicenseCard) product;
        holders.put(card.getLicenseNumber(), card.getHolder());  // licenseNumber를 키로, holder를 값을 저장
        System.out.println(product + "을 등록했습니다.");
    }

    public String getHolder(int licenseNumber) {
        return holders.get(licenseNumber);
    }
    
}
