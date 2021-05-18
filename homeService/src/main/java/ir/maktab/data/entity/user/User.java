package ir.maktab.data.entity.user;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@MappedSuperclass
public class User {

    private String fullName;

    private String emailAddress;

    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nationalCode;

    @Enumerated(value = EnumType.STRING)
    private UserState state;

    @Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    @Enumerated(value = EnumType.STRING)
    private UserRole userRole;

    @Lob
    @Column(name = "context", nullable = true, columnDefinition = "mediumblob")
    private Blob image;


    public User() {
    }

    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public User setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public long getNationalCode() {
        return nationalCode;
    }

    public User setNationalCode(long nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public UserState getState() {
        return state;
    }

    public User setState(UserState state) {
        this.state = state;
        return this;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public User setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public User setUserRole(UserRole userRole) {
        this.userRole = userRole;
        return this;
    }

    public Blob getImage() {
        return image;
    }

    public User setImage(Blob image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                ", dateTime=" + dateTime +
                ", userRole=" + userRole +
                '}';
    }
}
