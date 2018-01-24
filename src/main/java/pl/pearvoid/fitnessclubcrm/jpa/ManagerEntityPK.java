package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ManagerEntityPK implements Serializable {
    private int mIdManager;
    private String mStaffSsn;

    @Column(name = "idManager")
    @Id
    public int getIdManager() {
        return mIdManager;
    }

    public void setIdManager(int idManager) {
        mIdManager = idManager;
    }

    @Column(name = "Staff_SSN")
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

        if (mIdManager != that.mIdManager) return false;
        if (mStaffSsn != null ? !mStaffSsn.equals(that.mStaffSsn) : that.mStaffSsn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdManager;
        result = 31 * result + (mStaffSsn != null ? mStaffSsn.hashCode() : 0);
        return result;
    }
}
