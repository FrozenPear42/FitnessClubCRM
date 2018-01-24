package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Customer", schema = "fitnessclub", catalog = "")
public class CustomerEntity {
    private Integer mIdCustomer;
    private String mName;
    private Integer mAge;
    private Timestamp mFirstVisitDate;
    private Integer mContactIdContact;
    private Integer mMembershipIdMembership;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCustomer", nullable = false, unique = true)
    public Integer getIdCustomer() {
        return mIdCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        mIdCustomer = idCustomer;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge() {
        return mAge;
    }

    public void setAge(Integer age) {
        mAge = age;
    }

    @Basic
    @Column(name = "firstVisitDate", nullable = true)
    public Timestamp getFirstVisitDate() {
        return mFirstVisitDate;
    }

    public void setFirstVisitDate(Timestamp firstVisitDate) {
        mFirstVisitDate = firstVisitDate;
    }

    @Basic
    @Column(name = "Contact_idContact", nullable = true)
    public Integer getContactIdContact() {
        return mContactIdContact;
    }

    public void setContactIdContact(Integer contactIdContact) {
        mContactIdContact = contactIdContact;
    }

    @Basic
    @Column(name = "Membership_idMembership", nullable = true)
    public Integer getMembershipIdMembership() {
        return mMembershipIdMembership;
    }

    public void setMembershipIdMembership(Integer membershipIdMembership) {
        mMembershipIdMembership = membershipIdMembership;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (mIdCustomer != null ? !mIdCustomer.equals(that.mIdCustomer) : that.mIdCustomer != null) return false;
        if (mName != null ? !mName.equals(that.mName) : that.mName != null) return false;
        if (mAge != null ? !mAge.equals(that.mAge) : that.mAge != null) return false;
        if (mFirstVisitDate != null ? !mFirstVisitDate.equals(that.mFirstVisitDate) : that.mFirstVisitDate != null)
            return false;
        if (mContactIdContact != null ? !mContactIdContact.equals(that.mContactIdContact) : that.mContactIdContact != null)
            return false;
        if (mMembershipIdMembership != null ? !mMembershipIdMembership.equals(that.mMembershipIdMembership) : that.mMembershipIdMembership != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdCustomer != null ? mIdCustomer.hashCode() : 0;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mAge != null ? mAge.hashCode() : 0);
        result = 31 * result + (mFirstVisitDate != null ? mFirstVisitDate.hashCode() : 0);
        result = 31 * result + (mContactIdContact != null ? mContactIdContact.hashCode() : 0);
        result = 31 * result + (mMembershipIdMembership != null ? mMembershipIdMembership.hashCode() : 0);
        return result;
    }
}
