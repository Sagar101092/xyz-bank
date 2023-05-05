package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomerLoginPage extends Utility {
    // search customer that you created.
    By customer = By.xpath("//select[@id='userSelect']");
    // click on "Login" Button
    By login = By.xpath("//button[normalize-space()='Login']");
   //************** //verify "Logout" Tab displayed.
   By logout = By.xpath("//button[normalize-space()='Logout']");
    //click on "Logout"
    By clickLogout = By.xpath("//button[normalize-space()='Logout']");
    // verify "Your Name" text displayed.
    By verifyName = By.xpath("//label[contains(text(),'Your Name :')]");






    // search customer that you created.
    public void searchCustomer() throws InterruptedException {
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(customer,"Harry Potter");
    }
    //click on "Login" Button
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(login);
    }

    // verify "Logout" Tab displayed.


    public boolean isLogoutButtonPresence() throws InterruptedException {
        Thread.sleep(1000);
        WebElement logoutButton = driver.findElement(logout);
        return logoutButton.isDisplayed();
    }

// click on "Logout"
    public void clickOnLogoutTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickLogout);
    }
    // verify "Your Name" text displayed.
    public String verifyYourNameTextIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(verifyName);
    }




}
