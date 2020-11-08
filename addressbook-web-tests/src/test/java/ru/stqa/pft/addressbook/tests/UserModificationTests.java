package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserModificationTests extends TestBase {

    @Test
    public void testUserModification() throws Exception {
        app.getNavigationHelper().goToEditUserPage();
        app.getUserHelper().fillUserForm(new UserData("firstName1", "lastName1", "8999-999-99-99", "test@test.com"));
        app.getUserHelper().updateUserForm();
        app.getNavigationHelper().returnToHomePage();
        app.getSessionHelper().logout();
    }
}
