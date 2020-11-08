package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void goToNewUserPage() {
        click(By.linkText("add new"));
    }

    public void goToEditUserPage() {click(By.xpath("//img[@alt='Edit']"));}
}
