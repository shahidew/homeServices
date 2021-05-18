package ir.maktab.data.entity.user;

import javax.persistence.Entity;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
public class Expert extends User{

    public Expert() {
        super();
        setUserRole(UserRole.Expert);
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
    public UserState getState() {
        return super.getState();
    }

    @Override
    public User setState(UserState state) {
        return super.setState(state);
    }

    @Override
    public LocalDateTime getDateTime() {
        return super.getDateTime();
    }

    @Override
    public User setDateTime(LocalDateTime dateTime) {
        return super.setDateTime(dateTime);
    }

    @Override
    public UserRole getUserRole() {
        return super.getUserRole();
    }

    @Override
    public User setUserRole(UserRole userRole) {
        return super.setUserRole(userRole);
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

