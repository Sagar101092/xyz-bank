package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;


public class HomePage extends Utility {

    //     click On "Bank Manager Login" Tab
    By bankManager = By.xpath("//button[normalize-space()='Bank Manager Login']");

    // click on "Customer Login" Tab
    By customerLogin = By.xpath("//button[normalize-space()='Customer Login']");

    //     click On "Bank Manager Login" Tab
    public void clickOnBankMangerLogin(){
        clickOnElement(bankManager);
    }
    // click on "Customer Login" Tab
    public void clickOnCustomerLogin() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(customerLogin);
    }









}
