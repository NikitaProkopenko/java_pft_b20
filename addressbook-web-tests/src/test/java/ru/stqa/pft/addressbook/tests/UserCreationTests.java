package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserCreationTests extends TestBase {

    @Test
    public void testUserCreation() throws Exception {
        app.getNavigationHelper().goToNewUserPage();
        app.getUserHelper().fillUserForm(new UserData("firstName", "lastName", "8777-777-77-77", "test@test.com"));
        app.getUserHelper().submitUserForm();
        app.getNavigationHelper().returnToHomePage();
        app.getSessionHelper().logout();
    }

}
