package model;

import java.util.Objects;

public class MerchantDTO {

    private int merchantId;
    private String companyName;
    private String contactName;
    private String email;
    private String phoneNumber;
    private String address;
    private double creditLimit;
    private String accountStatus;

    public MerchantDTO() {
    }

    public MerchantDTO(
            int merchantId,
            String companyName,
            String contactName,
            String email,
            String phoneNumber,
            String address,
            double creditLimit,
            String accountStatus
    ) {
        this.merchantId = merchantId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.creditLimit = creditLimit;
        this.accountStatus = accountStatus;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "MerchantDTO{" +
                "merchantId=" + merchantId +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", creditLimit=" + creditLimit +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MerchantDTO)) return false;
        MerchantDTO that = (MerchantDTO) o;
        return merchantId == that.merchantId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchantId);
    }
}
