package hw.ch04.license;

import hw.ch04.framework.Product;

public class LicenseCard extends Product {
    String holder;
    int licenseNumber;
    String issuedDate;
    String expiryDate;

    public LicenseCard(String holder, int licenseNumber, String issuedDate, String expiryDate) {
        this.holder = holder;
        this.licenseNumber = licenseNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[LicenseCard:" + holder + "(" + licenseNumber + ")] - 유효기간: "
                + issuedDate + " ~ " + expiryDate;
    }

    public String getHolder()        { return holder; }
    public int    getLicenseNumber() { return licenseNumber; }
    public String getIssuedDate()    { return issuedDate; }
    public String getExpiryDate()    { return expiryDate; }
}