package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

import java.util.List;

public class UserDeletionTests extends TestBase {

    @Test
    public void testUserDeletionFromForm() throws Exception {
        if (!app.getUserHelper().isThereAUser()) {
            app.getUserHelper().createUser(new UserData("firstName", "lastName"));
        }
        List<UserData> before = app.getUserHelper().getUserList();
        app.getNavigationHelper().goToEditUserPage();
        app.getUserHelper().pressDeleteButtonFromForm();
        List<UserData> after = app.getUserHelper().getUserList();

        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }

    @Test
    public void testUserDeletionFromHomePage() throws Exception {
        if (!app.getUserHelper().isThereAUser()) {
            app.getUserHelper().createUser(new UserData("firstName", "lastName"));
        }
        List<UserData> before = app.getUserHelper().getUserList();
        app.getUserHelper().selectUser();
        app.getHomePageHelper().pressDeleteButtonFromHome();
        app.acceptAlert();
        List<UserData> after = app.getUserHelper().getUserList();

        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }
}
