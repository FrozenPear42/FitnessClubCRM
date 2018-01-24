package pl.pearvoid.fitnessclubcrm.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Contact", schema = "fitnessclub", catalog = "")
public class ContactEntity {
    private int mIdContact;
    private String mAddress;
    private String mPhone;
    private String mEmail;

    @Id
    @Column(name = "idContact")
    public int getIdContact() {
        return mIdContact;
    }

    public void setIdContact(int idContact) {
        mIdContact = idContact;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactEntity that = (ContactEntity) o;

        if (mIdContact != that.mIdContact) return false;
        if (mAddress != null ? !mAddress.equals(that.mAddress) : that.mAddress != null) return false;
        if (mPhone != null ? !mPhone.equals(that.mPhone) : that.mPhone != null) return false;
        if (mEmail != null ? !mEmail.equals(that.mEmail) : that.mEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mIdContact;
        result = 31 * result + (mAddress != null ? mAddress.hashCode() : 0);
        result = 31 * result + (mPhone != null ? mPhone.hashCode() : 0);
        result = 31 * result + (mEmail != null ? mEmail.hashCode() : 0);
        return result;
    }
}
