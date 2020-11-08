package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class UserCreationTests extends TestBase {

    @Test
    public void testUserCreation() throws Exception {
        goToNewUserPage();
        fillUserForm(new UserData("firstName", "lastName", "8777-777-77-77", "test@test.com"));
        submitUserForm();
        returnToHomePage();
        logout();
    }

}
