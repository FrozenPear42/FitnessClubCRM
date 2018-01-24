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

    @Id
    @Column(name = "SSN")
    public String getSsn() {
        return mSsn;
    }

    public void setSsn(String ssn) {
        mSsn = ssn;
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
    @Column(name = "birthdate")
    public Date getBirthdate() {
        return mBirthdate;
    }

    public void setBirthdate(Date birthdate) {
        mBirthdate = birthdate;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return mAge;
    }

    public void setAge(Integer age) {
        mAge = age;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = mSsn != null ? mSsn.hashCode() : 0;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mBirthdate != null ? mBirthdate.hashCode() : 0);
        result = 31 * result + (mAge != null ? mAge.hashCode() : 0);
        return result;
    }
}
