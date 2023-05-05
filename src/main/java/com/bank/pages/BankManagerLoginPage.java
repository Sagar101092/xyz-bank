package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    // click On "Open Account" Tab
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");

    // Search customer that created in first test
    By searchCustomer = By.xpath("//select[@id='userSelect']");
    // Select currency "Pound"
    By currency = By.xpath("//select[@id='currency']");
    // 	click on "process" button
    By process = By.xpath("//button[normalize-space()='Process']");






    // click On "Open Account" Tab
    public void clickOnOpenAccount() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(openAccount);
    }
    // Search customer that created in first test
    public void clickAndSelectCustomerName() throws InterruptedException {
        Thread.sleep(1000);
       // clickOnElement(By.xpath("//select[@id='userSelect']"));
        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
    }
    //Select currency "Pound"
    public void selectCurrency() throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(currency,"Pound");
    }
    // 	click on "process" button
    public void clickOnProcessButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(process);
    }

    // Popup Displayed and verify Message
    public String verifyTextFromPopUp(){
        return getTextFromAlert();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }


}
