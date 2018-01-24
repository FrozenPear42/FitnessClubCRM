package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Instructor", schema = "fitnessclub", catalog = "")
@IdClass(InstructorEntityPK.class)
public class InstructorEntity {
    private int mIdInstructor;
    private String mCertification;
    private String mStaffSsn;

    @Id
    @Column(name = "idInstructor")
    public int getIdInstructor() {
        return mIdInstructor;
    }

    public void setIdInstructor(int idInstructor) {
        mIdInstructor = idInstructor;
    }

    @Basic
    @Column(name = "certification")
    public String getCertification() {
        return mCertification;
    }

    public void setCertification(String certification) {
        mCertification = certification;
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

        InstructorEntity that = (InstructorEntity) o;

        if (mIdInstructor != that.mIdInstructor) return false;
        if (mCertification != null ? !mCertification.equals(that.mCertification) : that.mCertification != null)
            return false;
        if (mStaffSsn != null ? !mStaffSsn.equals(that.mStaffSsn) : that.mStaffSsn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdInstructor;
        result = 31 * result + (mCertification != null ? mCertification.hashCode() : 0);
        result = 31 * result + (mStaffSsn != null ? mStaffSsn.hashCode() : 0);
        return result;
    }
}
