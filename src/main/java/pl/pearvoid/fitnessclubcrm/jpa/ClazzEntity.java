package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Class", schema = "fitnessclub", catalog = "")
@IdClass(ClazzEntityPK.class)
public class ClazzEntity {
    private int mIdClass;
    private Integer mCost;
    private Timestamp mDate;
    private String mType;
    private Integer mSize;
    private Integer mDuration;
    private int mFacilityIdFacility;
    private int mInstructorIdInstructor;

    @Id
    @Column(name = "idClass")
    public int getIdClass() {
        return mIdClass;
    }

    public void setIdClass(int idClass) {
        mIdClass = idClass;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return mCost;
    }

    public void setCost(Integer cost) {
        mCost = cost;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return mDate;
    }

    public void setDate(Timestamp date) {
        mDate = date;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Basic
    @Column(name = "size")
    public Integer getSize() {
        return mSize;
    }

    public void setSize(Integer size) {
        mSize = size;
    }

    @Basic
    @Column(name = "duration")
    public Integer getDuration() {
        return mDuration;
    }

    public void setDuration(Integer duration) {
        mDuration = duration;
    }

    @Id
    @Column(name = "Facility_idFacility")
    public int getFacilityIdFacility() {
        return mFacilityIdFacility;
    }

    public void setFacilityIdFacility(int facilityIdFacility) {
        mFacilityIdFacility = facilityIdFacility;
    }

    @Id
    @Column(name = "Instructor_idInstructor")
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

        ClazzEntity that = (ClazzEntity) o;

        if (mIdClass != that.mIdClass) return false;
        if (mFacilityIdFacility != that.mFacilityIdFacility) return false;
        if (mInstructorIdInstructor != that.mInstructorIdInstructor) return false;
        if (mCost != null ? !mCost.equals(that.mCost) : that.mCost != null) return false;
        if (mDate != null ? !mDate.equals(that.mDate) : that.mDate != null) return false;
        if (mType != null ? !mType.equals(that.mType) : that.mType != null) return false;
        if (mSize != null ? !mSize.equals(that.mSize) : that.mSize != null) return false;
        if (mDuration != null ? !mDuration.equals(that.mDuration) : that.mDuration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdClass;
        result = 31 * result + (mCost != null ? mCost.hashCode() : 0);
        result = 31 * result + (mDate != null ? mDate.hashCode() : 0);
        result = 31 * result + (mType != null ? mType.hashCode() : 0);
        result = 31 * result + (mSize != null ? mSize.hashCode() : 0);
        result = 31 * result + (mDuration != null ? mDuration.hashCode() : 0);
        result = 31 * result + mFacilityIdFacility;
        result = 31 * result + mInstructorIdInstructor;
        return result;
    }
}
