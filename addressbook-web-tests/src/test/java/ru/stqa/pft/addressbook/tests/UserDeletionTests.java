package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserDeletionTests extends TestBase {

    @Test
    public void testUserDeletionFromForm() throws Exception {
        if (!app.getUserHelper().isThereAUser()) {
            app.getUserHelper().createUser(new UserData("firstName", "lastName", "8777-777-77-77", "test@test.com"));
        }
        app.getNavigationHelper().goToEditUserPage();
        app.getUserHelper().pressDeleteButtonFromForm();
        app.getSessionHelper().logout();

    }

    @Test
    public void testUserDeletionFromHomePage() throws Exception {
        if (!app.getUserHelper().isThereAUser()) {
            app.getUserHelper().createUser(new UserData("firstName", "lastName", "8777-777-77-77", "test@test.com"));
        }
        app.getUserHelper().selectUser();
        app.getHomePageHelper().pressDeleteButtonFromHome();
        app.acceptAlert();
    }
}
