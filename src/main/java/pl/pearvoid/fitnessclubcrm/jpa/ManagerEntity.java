package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Manager", schema = "fitnessclub", catalog = "")
@IdClass(ManagerEntityPK.class)
public class ManagerEntity {
    private int mIdManager;
    private String mStaffSsn;

    @Id
    @Column(name = "idManager")
    public int getIdManager() {
        return mIdManager;
    }

    public void setIdManager(int idManager) {
        mIdManager = idManager;
    }

    @Id
    @Column(name = "Staff_SSN")
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

        ManagerEntity that = (ManagerEntity) o;

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
