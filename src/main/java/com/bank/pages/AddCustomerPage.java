package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    // * 	click On "Add Customer" Tab
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    // Enter FirstName
    By firstName = By.xpath("//input[@placeholder='First Name']");
    // Enter Last Name
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    // Enter PostCode
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    // Click on Add Button
    By addButton = By.xpath("//button[@type='submit']");



    // * 	click On "Add Customer" Tab
    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
    }

    // Enter First Name
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, value);
    }

    // Enter Last Name
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
    }
    // Enter PostCode
    public void enterPostCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(postCode, value);
    }
    // Click On Add Button
    public void clickOnAddButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addButton);
    }

    // Popup Display
    public String verifyTextFromPopUp(){
        return getTextFromAlert();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }


}



