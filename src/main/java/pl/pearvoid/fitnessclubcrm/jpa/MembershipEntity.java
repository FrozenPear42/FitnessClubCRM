package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Membership", schema = "fitnessclub", catalog = "")
public class MembershipEntity {
    private int mIdMembership;
    private Timestamp mCreationDate;
    private Timestamp mExpireDate;
    private String mLevel;

    @Id
    @Column(name = "idMembership")
    public int getIdMembership() {
        return mIdMembership;
    }

    public void setIdMembership(int idMembership) {
        mIdMembership = idMembership;
    }

    @Basic
    @Column(name = "creationDate")
    public Timestamp getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        mCreationDate = creationDate;
    }

    @Basic
    @Column(name = "expireDate")
    public Timestamp getExpireDate() {
        return mExpireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        mExpireDate = expireDate;
    }

    @Basic
    @Column(name = "level")
    public String getLevel() {
        return mLevel;
    }

    public void setLevel(String level) {
        mLevel = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembershipEntity that = (MembershipEntity) o;

        if (mIdMembership != that.mIdMembership) return false;
        if (mCreationDate != null ? !mCreationDate.equals(that.mCreationDate) : that.mCreationDate != null)
            return false;
        if (mExpireDate != null ? !mExpireDate.equals(that.mExpireDate) : that.mExpireDate != null) return false;
        if (mLevel != null ? !mLevel.equals(that.mLevel) : that.mLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdMembership;
        result = 31 * result + (mCreationDate != null ? mCreationDate.hashCode() : 0);
        result = 31 * result + (mExpireDate != null ? mExpireDate.hashCode() : 0);
        result = 31 * result + (mLevel != null ? mLevel.hashCode() : 0);
        return result;
    }
}
