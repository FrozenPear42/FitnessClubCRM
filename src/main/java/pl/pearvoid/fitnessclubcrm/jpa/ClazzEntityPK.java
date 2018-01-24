package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ClazzEntityPK implements Serializable {
    private int mIdClass;
    private int mFacilityIdFacility;
    private int mInstructorIdInstructor;

    @Column(name = "idClass")
    @Id
    public int getIdClass() {
        return mIdClass;
    }

    public void setIdClass(int idClass) {
        mIdClass = idClass;
    }

    @Column(name = "Facility_idFacility")
    @Id
    public int getFacilityIdFacility() {
        return mFacilityIdFacility;
    }

    public void setFacilityIdFacility(int facilityIdFacility) {
        mFacilityIdFacility = facilityIdFacility;
    }

    @Column(name = "Instructor_idInstructor")
    @Id
    public int getInstructorIdInstructor() {
        return mInstructorIdInstructor;
    }

    public void setInstructorIdInstructor(int instructorIdInstructor) {
        mInstructorIdInstructor = instructorIdInstructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClazzEntityPK that = (ClazzEntityPK) o;

        if (mIdClass != that.mIdClass) return false;
        if (mFacilityIdFacility != that.mFacilityIdFacility) return false;
        if (mInstructorIdInstructor != that.mInstructorIdInstructor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdClass;
        result = 31 * result + mFacilityIdFacility;
        result = 31 * result + mInstructorIdInstructor;
        return result;
    }
}
