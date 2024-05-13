package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "address_status", schema = "gravity_books", catalog = "")
public class AddressStatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "status_id")
    private int statusId;
    @Basic
    @Column(name = "address_status")
    private String addressStatus;

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressStatus that = (AddressStatus) o;
        return statusId == that.statusId && Objects.equals(addressStatus, that.addressStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusId, addressStatus);
    }
}
