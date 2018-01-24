package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Manager", schema = "fitnessclub", catalog = "")
@IdClass(ManagerEntityPK.class)
public class ManagerEntity {
    private Integer mIdManager;
    private String mStaffSsn;

    @Id
    @Column(name = "idManager", nullable = false)
    public Integer getIdManager() {
        return mIdManager;
    }

    public void setIdManager(Integer idManager) {
        mIdManager = idManager;
    }

    @Id
    @Column(name = "Staff_SSN", nullable = false, length = 45)
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
