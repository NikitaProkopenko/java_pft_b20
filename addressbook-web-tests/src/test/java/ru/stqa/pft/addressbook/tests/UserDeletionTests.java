package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTests extends TestBase {

    @Test
    public void testUserDeletionFromForm() throws Exception {
        app.getNavigationHelper().goToEditUserPage();
        app.getUserHelper().pressDeleteButtonFromForm();
        app.getSessionHelper().logout();

    }

    @Test
    public void testUserDeletionFromHomePage() throws Exception {
        app.getUserHelper().selectUser();
        app.getHomePageHelper().pressDeleteButtonFromHome();
        app.acceptAlert();
    }
}
