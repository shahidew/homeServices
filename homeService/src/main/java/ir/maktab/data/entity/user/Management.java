package ir.maktab.data.entity.user;

import javax.persistence.Entity;
import java.sql.Blob;

@Entity
public class Management extends User{

    public Management() {
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public User setFullName(String fullName) {
        return super.setFullName(fullName);
    }

    @Override
    public String getEmailAddress() {
        return super.getEmailAddress();
    }

    @Override
    public User setEmailAddress(String emailAddress) {
        return super.setEmailAddress(emailAddress);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public User setPassword(String password) {
        return super.setPassword(password);
    }

    @Override
    public long getNationalCode() {
        return super.getNationalCode();
    }

    @Override
    public User setNationalCode(long nationalCode) {
        return super.setNationalCode(nationalCode);
    }

    @Override
    public Blob getImage() {
        return super.getImage();
    }

    @Override
    public User setImage(Blob image) {
        return super.setImage(image);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
