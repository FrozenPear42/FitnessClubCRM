package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lastMonthClasses", schema = "fitnessclub", catalog = "")
public class LastMonthClassesEntity {
    private Integer mIdClass;
    private Integer mCost;
    private Timestamp mDate;
    private String mType;
    private Integer mSize;
    private Integer mDuration;

    @Basic
    @Id
    @Column(name = "idClass", nullable = false)
    public Integer getIdClass() {
        return mIdClass;
    }

    public void setIdClass(Integer idClass) {
        mIdClass = idClass;
    }

    @Basic
    @Column(name = "cost", nullable = true)
    public Integer getCost() {
        return mCost;
    }

    public void setCost(Integer cost) {
        mCost = cost;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return mDate;
    }

    public void setDate(Timestamp date) {
        mDate = date;
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
    @Column(name = "size", nullable = true)
    public Integer getSize() {
        return mSize;
    }

    public void setSize(Integer size) {
        mSize = size;
    }

    @Basic
    @Column(name = "duration", nullable = true)
    public Integer getDuration() {
        return mDuration;
    }

    public void setDuration(Integer duration) {
        mDuration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LastMonthClassesEntity that = (LastMonthClassesEntity) o;

        if (mIdClass != null ? !mIdClass.equals(that.mIdClass) : that.mIdClass != null) return false;
        if (mCost != null ? !mCost.equals(that.mCost) : that.mCost != null) return false;
        if (mDate != null ? !mDate.equals(that.mDate) : that.mDate != null) return false;
        if (mType != null ? !mType.equals(that.mType) : that.mType != null) return false;
        if (mSize != null ? !mSize.equals(that.mSize) : that.mSize != null) return false;
        if (mDuration != null ? !mDuration.equals(that.mDuration) : that.mDuration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdClass != null ? mIdClass.hashCode() : 0;
        result = 31 * result + (mCost != null ? mCost.hashCode() : 0);
        result = 31 * result + (mDate != null ? mDate.hashCode() : 0);
        result = 31 * result + (mType != null ? mType.hashCode() : 0);
        result = 31 * result + (mSize != null ? mSize.hashCode() : 0);
        result = 31 * result + (mDuration != null ? mDuration.hashCode() : 0);
        return result;
    }
}
