package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.UserData;

import java.util.ArrayList;
import java.util.List;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void goToNewUserPage() {
        click(By.linkText("add new"));
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

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void createUser(UserData user) {
        goToNewUserPage();
        fillUserForm(user);
        submitUserForm();
        returnToHomePage();
    }

    public boolean isThereAUser() {
        return isElementPresent(By.name("selected[]"));
    }

    public List<UserData> getUserList() {
        List<UserData> users = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.xpath("//form/table/tbody/tr[@name='entry']"));
        for (WebElement element : elements) {
            String firstName = element.findElement(By.xpath("td[3]")).getText();
            String lastName = element.findElement(By.xpath("td[2]")).getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
            UserData user = new UserData(firstName, lastName, null, null, id);
            users.add(user);
        }
        return users;
    }
}
