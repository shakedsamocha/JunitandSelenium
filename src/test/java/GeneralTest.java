import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class GeneralTest {



    @Test
    public void GeneralTest() throws InterruptedException {

        DOMselenium selenium = new DOMselenium();
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String CustomerLogin = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button";
        String NameSelector = "#userSelect";
        String ChooseHarry = "#userSelect > option:nth-child(3)";
        String LoginButton = "body > div > div > div.ng-scope > div > form > button";
        String DepositSelector = "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)";
        String AmountInput = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String DepositAmount = "1000";
        String DepositInput = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String WithdrawlButton = "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)";
        String WithdrawlInput = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String WithdrawlAmount = "250";
        String WithdrawlActionButton = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String Expected = "Account Number : 1004 , Balance : 750 , Currency : Dollar";

        //All HTMLS

        selenium.driver.get(url);
        Thread.sleep(3000);
        selenium.GetElement(CustomerLogin).click();
        Thread.sleep(1000);
        selenium.GetElement(NameSelector).click();
        Thread.sleep(1500);
        selenium.GetElement(ChooseHarry).click();
        selenium.GetElement(LoginButton).click();


        //Deposit
        Thread.sleep(1000);
        selenium.GetElement(DepositSelector).click();
        Thread.sleep(1000);
        selenium.GetElement(AmountInput).sendKeys(DepositAmount);
        selenium.GetElement(DepositInput).click();
        Thread.sleep(3000);


        //Withdrawl
        selenium.GetElement(WithdrawlButton).click();
        Thread.sleep(1000);
        selenium.GetElement(WithdrawlInput).sendKeys(WithdrawlAmount);
        Thread.sleep(1000);
        selenium.GetElement(WithdrawlActionButton).click();
        Thread.sleep(1000);

        //Verify Amount
        String ActualValue = selenium.GetElement("body > div > div > div.ng-scope > div > div:nth-child(3)").getText();
        Assert.assertEquals(Expected,ActualValue);


    }




    @Test
    public void Q2() throws InterruptedException{

        DOMselenium selenium = new DOMselenium();
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String ManagerLogIn = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button";
        String AddCustomerButton = "body > div > div > div.ng-scope > div > div.center > button:nth-child(1)";
        String FirstNameBox = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input";
        String LastNameBox = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(2) > input";
        String PostCodeBox = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(3) > input";
        String Firstname = "Amadeo";
        String Lastname = "Modigliani";
        String PostCode = "42810";
        String CustomerFormButton = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > button";
        String CustomerChart = "body > div > div > div.ng-scope > div > div.center > button:nth-child(3)";
        String SearchCustomer = "body > div > div > div.ng-scope > div > div.ng-scope > div > form > div > div > input";
        String Outcome = "<td class=\"ng-binding\">amadeo</td>";
        String Expected = "Amadeo";
        String OpenAccount = "body > div > div > div.ng-scope > div > div.center > button.btn.btn-lg.tab.btn-primary";


        //All the elements used


        //open website

        selenium.driver.get(url);
        Thread.sleep(2000);

        //Log In

        selenium.GetElement(ManagerLogIn).click();
        Thread.sleep(1000);

        //Add Customer

        selenium.GetElement(AddCustomerButton).click();
        Thread.sleep(1000);

        //Insert Full name & Postal code

        selenium.GetElement(FirstNameBox).sendKeys(Firstname);
        Thread.sleep(1000);
        selenium.GetElement(LastNameBox).sendKeys(Lastname);
        Thread.sleep(1000);
        selenium.GetElement(PostCodeBox).sendKeys(PostCode);
        Thread.sleep(2000);

        //Insert Form

        selenium.GetElement(CustomerFormButton).click();
        Thread.sleep(2000);

        //Click on pop up

        selenium.driver.switchTo().alert().accept();
        Thread.sleep(1000);

        //Enter Chart and validate customer is in Chart

        selenium.GetElement(CustomerChart).click();
        Thread.sleep(1000);
        selenium.GetElement(SearchCustomer).sendKeys(Firstname);
        Thread.sleep(1000);
        String ActualValue = selenium.GetElement("body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr > td:nth-child(1)").getText();
        Assert.assertEquals(Expected,ActualValue);



    }

}



