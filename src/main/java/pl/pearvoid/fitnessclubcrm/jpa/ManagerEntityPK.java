package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ManagerEntityPK implements Serializable {
    private Integer mIdManager;
    private String mStaffSsn;

    @Column(name = "idManager", nullable = false)
    @Id
    public Integer getIdManager() {
        return mIdManager;
    }

    public void setIdManager(Integer idManager) {
        mIdManager = idManager;
    }

    @Column(name = "Staff_SSN", nullable = false, length = 45)
    @Id
    public String getStaffSsn() {
        return mStaffSsn;
    }

    public void setStaffSsn(String staffSsn) {
        mStaffSsn = staffSsn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManagerEntityPK that = (ManagerEntityPK) o;

        if (mIdManager != null ? !mIdManager.equals(that.mIdManager) : that.mIdManager != null) return false;
        if (mStaffSsn != null ? !mStaffSsn.equals(that.mStaffSsn) : that.mStaffSsn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdManager != null ? mIdManager.hashCode() : 0;
        result = 31 * result + (mStaffSsn != null ? mStaffSsn.hashCode() : 0);
        return result;
    }
}
