package learn.java.basic.hw10;

import static java.lang.System.*;

public class User {
    private final String lastName;
    private String firstName;
    private String middleName;
    private int yearOfBirth;
    private String emailAddress;

    /**
     * public User () {}
     */
    public User (String lastNameParam) {
        this.lastName = lastNameParam;
    }

    public User (String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public User (String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public User (String lastName, String firstName, String middleName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.yearOfBirth = age;
    }

    public User (String lastName, String firstName, String middleName, int ageParam, String emailAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.yearOfBirth = ageParam;
        this.emailAddress = emailAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return yearOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void info() {
        if (this.yearOfBirth >= 40) {
            out.println("Name: " + this.lastName + " " + this.firstName + " " + this.middleName + "\nYear of Birth: " + this.yearOfBirth + "\nEmail Address: " + this.emailAddress);
            out.println();
        }
    }

}
