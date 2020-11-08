package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test group", "test group 1", "test group 2"));
        submitGroupCreation();
        returnToGroupPage();
        logout();
    }

}
