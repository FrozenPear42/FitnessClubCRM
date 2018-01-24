package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ClazzEntityPK implements Serializable {
    private Integer mIdClass;
    private Integer mFacilityIdFacility;
    private Integer mInstructorIdInstructor;

    @Column(name = "idClass", nullable = false)
    @Id
    public Integer getIdClass() {
        return mIdClass;
    }

    public void setIdClass(Integer idClass) {
        mIdClass = idClass;
    }

    @Column(name = "Facility_idFacility", nullable = false)
    @Id
    public Integer getFacilityIdFacility() {
        return mFacilityIdFacility;
    }

    public void setFacilityIdFacility(Integer facilityIdFacility) {
        mFacilityIdFacility = facilityIdFacility;
    }

    @Column(name = "Instructor_idInstructor", nullable = false)
    @Id
    public Integer getInstructorIdInstructor() {
        return mInstructorIdInstructor;
    }

    public void setInstructorIdInstructor(Integer instructorIdInstructor) {
        mInstructorIdInstructor = instructorIdInstructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClazzEntityPK that = (ClazzEntityPK) o;

        if (mIdClass != null ? !mIdClass.equals(that.mIdClass) : that.mIdClass != null) return false;
        if (mFacilityIdFacility != null ? !mFacilityIdFacility.equals(that.mFacilityIdFacility) : that.mFacilityIdFacility != null)
            return false;
        if (mInstructorIdInstructor != null ? !mInstructorIdInstructor.equals(that.mInstructorIdInstructor) : that.mInstructorIdInstructor != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdClass != null ? mIdClass.hashCode() : 0;
        result = 31 * result + (mFacilityIdFacility != null ? mFacilityIdFacility.hashCode() : 0);
        result = 31 * result + (mInstructorIdInstructor != null ? mInstructorIdInstructor.hashCode() : 0);
        return result;
    }
}
