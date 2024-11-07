package learn.java.basic.hw10;

public class User {
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;
    private String emailAddress;

    //public User () {}
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
        this.age = age;
    }

    public User (String lastName, String firstName, String middleName, int ageParam, String emailAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = ageParam;
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
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void info() {
        if (this.age >= 40) {
            System.out.println("Name: " + this.lastName + " " + this.firstName + " " + this.middleName + "\nYear of Birth: " + this.age + "\nEmail Address: " + this.emailAddress);
            System.out.println();
        }
    }

}
