package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HelperBase {

    public HomePageHelper(WebDriver wd) {
        super(wd);
    }

    public void pressDeleteButtonFromHome() {
        click(By.xpath("//input[@value='Delete']"));
    }
}
