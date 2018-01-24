package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Facility", schema = "fitnessclub", catalog = "")
public class FacilityEntity {
    private Integer mIdFacility;
    private String mName;
    private String mType;
    private String mCapacity;

    @Id
    @Column(name = "idFacility", nullable = false)
    public Integer getIdFacility() {
        return mIdFacility;
    }

    public void setIdFacility(Integer idFacility) {
        mIdFacility = idFacility;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 45)
    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Basic
    @Column(name = "capacity", nullable = true, length = 45)
    public String getCapacity() {
        return mCapacity;
    }

    public void setCapacity(String capacity) {
        mCapacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacilityEntity that = (FacilityEntity) o;

        if (mIdFacility != null ? !mIdFacility.equals(that.mIdFacility) : that.mIdFacility != null) return false;
        if (mName != null ? !mName.equals(that.mName) : that.mName != null) return false;
        if (mType != null ? !mType.equals(that.mType) : that.mType != null) return false;
        if (mCapacity != null ? !mCapacity.equals(that.mCapacity) : that.mCapacity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdFacility != null ? mIdFacility.hashCode() : 0;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mType != null ? mType.hashCode() : 0);
        result = 31 * result + (mCapacity != null ? mCapacity.hashCode() : 0);
        return result;
    }
}
