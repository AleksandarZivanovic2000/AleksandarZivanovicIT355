package entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cust_order", schema = "gravity_books", catalog = "")
public class CustOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private int orderId;
    @Basic
    @Column(name = "order_date")
    private Timestamp orderDate;
    @Basic
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic
    @Column(name = "shipping_method_id")
    private Integer shippingMethodId;
    @Basic
    @Column(name = "dest_address_id")
    private Integer destAddressId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getShippingMethodId() {
        return shippingMethodId;
    }

    public void setShippingMethodId(Integer shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    public Integer getDestAddressId() {
        return destAddressId;
    }

    public void setDestAddressId(Integer destAddressId) {
        this.destAddressId = destAddressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustOrder custOrder = (CustOrder) o;
        return orderId == custOrder.orderId && Objects.equals(orderDate, custOrder.orderDate) && Objects.equals(customerId, custOrder.customerId) && Objects.equals(shippingMethodId, custOrder.shippingMethodId) && Objects.equals(destAddressId, custOrder.destAddressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderDate, customerId, shippingMethodId, destAddressId);
    }
}
