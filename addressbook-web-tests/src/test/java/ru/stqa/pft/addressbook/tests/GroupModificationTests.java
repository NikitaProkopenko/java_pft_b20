package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().groupPage();
        if(app.group().all().size() == 0) {
            app.group().createGroup(new GroupData().withName("test group"));
        }
    }

    @Test
    public void testGroupModification() {
        Set<GroupData> before = app.group().all();
        GroupData modifiedGroup = before.iterator().next();
        GroupData group = new GroupData().withName("test group")
                .withHeader("test group 2")
                .withFooter("test group 1")
                .withId(modifiedGroup.getId());

        app.group().modify(group);

        Set<GroupData> after = app.group().all();

        Assert.assertEquals(after.size(), before.size());

        before.remove(modifiedGroup);
        before.add(group);

        Assert.assertEquals(before, after);

        app.goTo().homePage();
    }
}
