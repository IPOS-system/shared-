package model;

import java.util.Objects;

public class ProductDTO {

    private int productId;
    private String description;
    private String packageType;
    private int unitsInPack;
    private double packageCost;
    private int availability;
    private int stockLimit;

    public ProductDTO() {
    }

    public ProductDTO(
            int productId,
            String description,
            String packageType,
            int unitsInPack,
            double packageCost,
            int availability,
            int stockLimit
    ) {
        this.productId = productId;
        this.description = description;
        this.packageType = packageType;
        this.unitsInPack = unitsInPack;
        this.packageCost = packageCost;
        this.availability = availability;
        this.stockLimit = stockLimit;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getUnitsInPack() {
        return unitsInPack;
    }

    public void setUnitsInPack(int unitsInPack) {
        this.unitsInPack = unitsInPack;
    }

    public double getPackageCost() {
        return packageCost;
    }

    public void setPackageCost(double packageCost) {
        this.packageCost = packageCost;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(int stockLimit) {
        this.stockLimit = stockLimit;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId=" + productId +
                ", description='" + description + '\'' +
                ", packageType='" + packageType + '\'' +
                ", unitsInPack=" + unitsInPack +
                ", packageCost=" + packageCost +
                ", availability=" + availability +
                ", stockLimit=" + stockLimit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductDTO)) return false;
        ProductDTO that = (ProductDTO) o;
        return productId == that.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
