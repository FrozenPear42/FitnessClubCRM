package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Staff", schema = "fitnessclub", catalog = "")
public class StaffEntity {
    private String mSsn;
    private String mName;
    private Date mBirthdate;
    private Integer mAge;
    private Integer mManagerIdManager;
    private String mManagerStaffSsn;

    @Id
    @Column(name = "SSN", nullable = false, length = 45)
    public String getSsn() {
        return mSsn;
    }

    public void setSsn(String ssn) {
        mSsn = ssn;
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
    @Column(name = "birthdate", nullable = true)
    public Date getBirthdate() {
        return mBirthdate;
    }

    public void setBirthdate(Date birthdate) {
        mBirthdate = birthdate;
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
    @Column(name = "Manager_idManager", nullable = false)
    public Integer getManagerIdManager() {
        return mManagerIdManager;
    }

    public void setManagerIdManager(Integer managerIdManager) {
        mManagerIdManager = managerIdManager;
    }

    @Basic
    @Column(name = "Manager_Staff_SSN", nullable = false, length = 45)
    public String getManagerStaffSsn() {
        return mManagerStaffSsn;
    }

    public void setManagerStaffSsn(String managerStaffSsn) {
        mManagerStaffSsn = managerStaffSsn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffEntity that = (StaffEntity) o;

        if (mSsn != null ? !mSsn.equals(that.mSsn) : that.mSsn != null) return false;
        if (mName != null ? !mName.equals(that.mName) : that.mName != null) return false;
        if (mBirthdate != null ? !mBirthdate.equals(that.mBirthdate) : that.mBirthdate != null) return false;
        if (mAge != null ? !mAge.equals(that.mAge) : that.mAge != null) return false;
        if (mManagerIdManager != null ? !mManagerIdManager.equals(that.mManagerIdManager) : that.mManagerIdManager != null)
            return false;
        if (mManagerStaffSsn != null ? !mManagerStaffSsn.equals(that.mManagerStaffSsn) : that.mManagerStaffSsn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mSsn != null ? mSsn.hashCode() : 0;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mBirthdate != null ? mBirthdate.hashCode() : 0);
        result = 31 * result + (mAge != null ? mAge.hashCode() : 0);
        result = 31 * result + (mManagerIdManager != null ? mManagerIdManager.hashCode() : 0);
        result = 31 * result + (mManagerStaffSsn != null ? mManagerStaffSsn.hashCode() : 0);
        return result;
    }
}
