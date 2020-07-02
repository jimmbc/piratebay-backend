package bo.edu.ucb.sis.piratebay.model;
import java.util.Date;
public class ProductOrderModel {
    private Integer detailId;
    private Double cost;
    private Integer quantity;
    private Integer quantityCommit;
    private Integer productProductId;
    private Integer requisitionRequisitionId;

    public ProductOrderModel(Integer detailId, Double cost, Integer quantity, Integer quantityCommit, Integer productProductId, Integer requisitionRequisitionId) {
        this.detailId = detailId;
        this.cost = cost;
        this.quantity = quantity;
        this.quantityCommit = quantityCommit;
        this.productProductId = productProductId;
        this.requisitionRequisitionId = requisitionRequisitionId;
    }

    @Override
    public String toString() {
        return "ProductOrderModel{" +
                "detailId=" + detailId +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", quantityCommit=" + quantityCommit +
                ", productProductId=" + productProductId +
                ", requisitionRequisitionId=" + requisitionRequisitionId +
                '}';
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantityCommit() {
        return quantityCommit;
    }

    public void setQuantityCommit(Integer quantityCommit) {
        this.quantityCommit = quantityCommit;
    }

    public Integer getProductProductId() {
        return productProductId;
    }

    public void setProductProductId(Integer productProductId) {
        this.productProductId = productProductId;
    }

    public Integer getRequisitionRequisitionId() {
        return requisitionRequisitionId;
    }

    public void setRequisitionRequisitionId(Integer requisitionRequisitionId) {
        this.requisitionRequisitionId = requisitionRequisitionId;
    }
}
