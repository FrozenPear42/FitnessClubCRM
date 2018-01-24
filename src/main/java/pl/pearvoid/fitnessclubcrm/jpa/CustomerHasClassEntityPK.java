package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CustomerHasClassEntityPK implements Serializable {
    private int mCustomerIdCustomer;
    private int mClassIdClass;

    @Column(name = "Customer_idCustomer")
    @Id
    public int getCustomerIdCustomer() {
        return mCustomerIdCustomer;
    }

    public void setCustomerIdCustomer(int customerIdCustomer) {
        mCustomerIdCustomer = customerIdCustomer;
    }

    @Column(name = "Class_idClass")
    @Id
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

        CustomerHasClassEntityPK that = (CustomerHasClassEntityPK) o;

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
