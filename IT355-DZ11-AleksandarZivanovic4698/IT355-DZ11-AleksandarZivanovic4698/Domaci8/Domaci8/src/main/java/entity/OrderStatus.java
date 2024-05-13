package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "order_status", schema = "gravity_books", catalog = "")
public class OrderStatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "status_id")
    private int statusId;
    @Basic
    @Column(name = "status_value")
    private String statusValue;

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderStatus that = (OrderStatus) o;
        return statusId == that.statusId && Objects.equals(statusValue, that.statusValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusId, statusValue);
    }
}
