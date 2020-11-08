package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void submitUserForm() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillUserForm(UserData userData) {
        type(By.name("firstname"), userData.getFirstName());
        type(By.name("lastname"), userData.getLastName());
        type(By.name("home"), userData.getHomePhone());
        type(By.name("email"), userData.getEmail());
    }

    public void updateUserForm() {
        click(By.xpath("(//input[@name='update'])[2]"));
    }

    public void pressDeleteButtonFromForm() {
        click(By.xpath("(//input[@name='update'])[3]"));
    }

    public void selectUser() {
        click(By.name("selected[]"));
    }
}
