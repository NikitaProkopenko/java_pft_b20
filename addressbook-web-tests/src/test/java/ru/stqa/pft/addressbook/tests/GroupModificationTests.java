package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().groupPage();
        if(app.group().list().size() == 0) {
            app.group().createGroup(new GroupData("test group", "test group 1", "test group 2"));
        }
    }

    @Test
    public void testGroupModification() {
        List<GroupData> before = app.group().list();

        int index = before.size() - 1;
        GroupData group = new GroupData("test group", "test group 2", "test group 1", before.get(index).getId());

        app.group().modify(index, group);

        List<GroupData> after = app.group().list();

        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(group);
        Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);

        app.goTo().homePage();
    }
}
