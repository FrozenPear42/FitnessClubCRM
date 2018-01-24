package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CustomerHasClassEntityPK implements Serializable {
    private Integer mCustomerIdCustomer;
    private Integer mClassIdClass;

    @Column(name = "Customer_idCustomer", nullable = false)
    @Id
    public Integer getCustomerIdCustomer() {
        return mCustomerIdCustomer;
    }

    public void setCustomerIdCustomer(Integer customerIdCustomer) {
        mCustomerIdCustomer = customerIdCustomer;
    }

    @Column(name = "Class_idClass", nullable = false)
    @Id
    public Integer getClassIdClass() {
        return mClassIdClass;
    }

    public void setClassIdClass(Integer classIdClass) {
        mClassIdClass = classIdClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerHasClassEntityPK that = (CustomerHasClassEntityPK) o;

        if (mCustomerIdCustomer != null ? !mCustomerIdCustomer.equals(that.mCustomerIdCustomer) : that.mCustomerIdCustomer != null)
            return false;
        if (mClassIdClass != null ? !mClassIdClass.equals(that.mClassIdClass) : that.mClassIdClass != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mCustomerIdCustomer != null ? mCustomerIdCustomer.hashCode() : 0;
        result = 31 * result + (mClassIdClass != null ? mClassIdClass.hashCode() : 0);
        return result;
    }
}
