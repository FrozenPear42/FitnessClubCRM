package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Customer_has_Class", schema = "fitnessclub", catalog = "")
@IdClass(CustomerHasClassEntityPK.class)
public class CustomerHasClassEntity {
    private int mCustomerIdCustomer;
    private int mClassIdClass;

    @Id
    @Column(name = "Customer_idCustomer")
    public int getCustomerIdCustomer() {
        return mCustomerIdCustomer;
    }

    public void setCustomerIdCustomer(int customerIdCustomer) {
        mCustomerIdCustomer = customerIdCustomer;
    }

    @Id
    @Column(name = "Class_idClass")
    public int getClassIdClass() {
        return mClassIdClass;
    }

    public void setClassIdClass(int classIdClass) {
        mClassIdClass = classIdClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerHasClassEntity that = (CustomerHasClassEntity) o;

        if (mCustomerIdCustomer != that.mCustomerIdCustomer) return false;
        if (mClassIdClass != that.mClassIdClass) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mCustomerIdCustomer;
        result = 31 * result + mClassIdClass;
        return result;
    }
}
