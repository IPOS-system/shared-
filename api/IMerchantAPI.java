package api;

import model.MerchantDTO;

public interface IMerchantAPI {

    MerchantDTO getMerchantById(int merchantId);

    MerchantDTO getMerchantByEmail(String email);

    boolean updateMerchantCreditLimit(int merchantId, double newCreditLimit);

    boolean updateMerchantStatus(int merchantId, String newStatus);
}
