package ru.stqa.pft.addressbook.model;

public class UserData {
    private final String firstName;
    private final String lastName;
    private final String homePhone;
    private final String email;
    private int id;

    public UserData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = "777-77-77";
        this.email = "test@test.com";
        this.id = Integer.MAX_VALUE;
    }

    public UserData(String firstName, String lastName, String homePhone, String email, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.email = email;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserData userData = (UserData) o;

        if (firstName != null ? !firstName.equals(userData.firstName) : userData.firstName != null) return false;
        return lastName != null ? lastName.equals(userData.lastName) : userData.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
