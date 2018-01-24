package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class InstructorEntityPK implements Serializable {
    private Integer mIdInstructor;
    private String mStaffSsn;

    @Column(name = "idInstructor", nullable = false)
    @Id
    public Integer getIdInstructor() {
        return mIdInstructor;
    }

    public void setIdInstructor(Integer idInstructor) {
        mIdInstructor = idInstructor;
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

        InstructorEntityPK that = (InstructorEntityPK) o;

        if (mIdInstructor != null ? !mIdInstructor.equals(that.mIdInstructor) : that.mIdInstructor != null)
            return false;
        if (mStaffSsn != null ? !mStaffSsn.equals(that.mStaffSsn) : that.mStaffSsn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdInstructor != null ? mIdInstructor.hashCode() : 0;
        result = 31 * result + (mStaffSsn != null ? mStaffSsn.hashCode() : 0);
        return result;
    }
}
