package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

import java.util.Comparator;
import java.util.List;

public class UserModificationTests extends TestBase {

    @Test
    public void testUserModification() throws Exception {
        if (!app.getUserHelper().isThereAUser()) {
            app.getUserHelper().createUser(new UserData("firstName", "lastName"));
        }
        List<UserData> before = app.getUserHelper().getUserList();
        app.getNavigationHelper().goToEditUserPage();
        UserData user = new UserData("firstName1", "lastName1", null, null, before.get(0).getId());
        app.getUserHelper().fillUserForm(user);
        app.getUserHelper().updateUserForm();
        app.getUserHelper().returnToHomePage();
        List<UserData> after = app.getUserHelper().getUserList();

        Assert.assertEquals(after.size(), before.size());

        before.remove(before.get(0));
        before.add(user);
        Comparator<? super UserData> byId = (u1, u2) -> Integer.compare(u1.getId(), u2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
