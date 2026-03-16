package model;

import java.util.Objects;

public class OrderItemDTO {

    private int productId;
    private String productDescription;
    private int quantity;
    private double unitCost;
    private double totalCost;

    public OrderItemDTO() {
    }

    public OrderItemDTO(
            int productId,
            String productDescription,
            int quantity,
            double unitCost,
            double totalCost
    ) {
        this.productId = productId;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.totalCost = totalCost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "OrderItemDTO{" +
                "productId=" + productId +
                ", productDescription='" + productDescription + '\'' +
                ", quantity=" + quantity +
                ", unitCost=" + unitCost +
                ", totalCost=" + totalCost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemDTO)) return false;
        OrderItemDTO that = (OrderItemDTO) o;
        return productId == that.productId &&
                quantity == that.quantity &&
                Double.compare(that.unitCost, unitCost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, quantity, unitCost);
    }
}
