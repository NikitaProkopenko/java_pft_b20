package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserModificationTests extends TestBase {

    @Test
    public void testUserModification() throws Exception {
        if (!app.getUserHelper().isThereAUser()) {
            app.getUserHelper().createUser(new UserData("firstName", "lastName"));
        }
        app.getNavigationHelper().goToEditUserPage();
        app.getUserHelper().fillUserForm(new UserData("firstName1", "lastName1"));
        app.getUserHelper().updateUserForm();
        app.getUserHelper().returnToHomePage();
        app.getSessionHelper().logout();
    }
}
