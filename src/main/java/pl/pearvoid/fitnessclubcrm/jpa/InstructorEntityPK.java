package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class InstructorEntityPK implements Serializable {
    private int mIdInstructor;
    private String mStaffSsn;

    @Column(name = "idInstructor")
    @Id
    public int getIdInstructor() {
        return mIdInstructor;
    }

    public void setIdInstructor(int idInstructor) {
        mIdInstructor = idInstructor;
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

        InstructorEntityPK that = (InstructorEntityPK) o;

        if (mIdInstructor != that.mIdInstructor) return false;
        if (mStaffSsn != null ? !mStaffSsn.equals(that.mStaffSsn) : that.mStaffSsn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdInstructor;
        result = 31 * result + (mStaffSsn != null ? mStaffSsn.hashCode() : 0);
        return result;
    }
}
