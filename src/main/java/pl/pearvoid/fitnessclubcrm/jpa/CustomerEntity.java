package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Customer", schema = "fitnessclub", catalog = "")
public class CustomerEntity {
    private int mIdCustomer;
    private String mName;
    private Integer mAge;
    private Timestamp mFirstVisitDate;

    @Id
    @Column(name = "idCustomer")
    public int getIdCustomer() {
        return mIdCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        mIdCustomer = idCustomer;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return mAge;
    }

    public void setAge(Integer age) {
        mAge = age;
    }

    @Basic
    @Column(name = "firstVisitDate")
    public Timestamp getFirstVisitDate() {
        return mFirstVisitDate;
    }

    public void setFirstVisitDate(Timestamp firstVisitDate) {
        mFirstVisitDate = firstVisitDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (mIdCustomer != that.mIdCustomer) return false;
        if (mName != null ? !mName.equals(that.mName) : that.mName != null) return false;
        if (mAge != null ? !mAge.equals(that.mAge) : that.mAge != null) return false;
        if (mFirstVisitDate != null ? !mFirstVisitDate.equals(that.mFirstVisitDate) : that.mFirstVisitDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdCustomer;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mAge != null ? mAge.hashCode() : 0);
        result = 31 * result + (mFirstVisitDate != null ? mFirstVisitDate.hashCode() : 0);
        return result;
    }
}
