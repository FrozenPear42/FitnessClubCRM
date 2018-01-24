package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Instructor", schema = "fitnessclub", catalog = "")
@IdClass(InstructorEntityPK.class)
public class InstructorEntity {
    private Integer mIdInstructor;
    private String mCertification;
    private String mStaffSsn;

    @Id
    @Column(name = "idInstructor", nullable = false)
    public Integer getIdInstructor() {
        return mIdInstructor;
    }

    public void setIdInstructor(Integer idInstructor) {
        mIdInstructor = idInstructor;
    }

    @Basic
    @Column(name = "certification", nullable = true, length = 45)
    public String getCertification() {
        return mCertification;
    }

    public void setCertification(String certification) {
        mCertification = certification;
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

        InstructorEntity that = (InstructorEntity) o;

        if (mIdInstructor != null ? !mIdInstructor.equals(that.mIdInstructor) : that.mIdInstructor != null)
            return false;
        if (mCertification != null ? !mCertification.equals(that.mCertification) : that.mCertification != null)
            return false;
        if (mStaffSsn != null ? !mStaffSsn.equals(that.mStaffSsn) : that.mStaffSsn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdInstructor != null ? mIdInstructor.hashCode() : 0;
        result = 31 * result + (mCertification != null ? mCertification.hashCode() : 0);
        result = 31 * result + (mStaffSsn != null ? mStaffSsn.hashCode() : 0);
        return result;
    }
}
