package Mosessco_Test.TestBase;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MasterPage_TestBase {





/*---SET UPS---*/

    public Setups setups;              // Add an instance of the Setups class
    public MasterPage_TestBase(Setups setups) {
        this.setups = setups;        // Initialize the Setups class instance
    }





/*---TEST METHODS----*/

    //Open Url
    public void openUrl(String url) {
        setups.driver.get(url);
    }






/*---Top Nav Components---*/
    public void topNav() {



        //Click Mosessco Architecture button
        WebElement btn_MosesscoAchitectureTeam = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_MosesscoAchitectureTeam_Css)));
        btn_MosesscoAchitectureTeam.click();

        /*
        Share button and the menu buttons inside
        1.Click Share>>
            1.1 Click Mail
            1.2 Click Facebook
            1.3 Click Whatsapp
         */
        String parentWindowHandle = setups.driver.getWindowHandle();  //Parent window - stores the current active browser window

        WebElement btn_Share = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_Share_Css)));
        btn_Share.click();
        WebElement btn_Mail = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_Mail_Css)));
        btn_Mail.click();
        // Switch to the new window or tab (assuming you have only one new window)
        for (String handle : setups.driver.getWindowHandles()) {
            if (!handle.equals(parentWindowHandle)) {
                setups.driver.switchTo().window(handle);
                // Close the mail desktop application
                setups.driver.close();
            }
        }
        // Switch back to the parent window handle
        setups.driver.switchTo().window(parentWindowHandle);
        btn_Share.click();

        WebElement btn_Facebook = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_Facebook_Css)));
        btn_Facebook.click();
        // Switch to the new window or tab (assuming you have only one new window)
        for (String handle : setups.driver.getWindowHandles()) {
            if (!handle.equals(parentWindowHandle)) {
                setups.driver.switchTo().window(handle);
                // Close the facebook page
                setups.driver.close();
            }
        }
        // Switch back to the parent window handle
        setups.driver.switchTo().window(parentWindowHandle);
        btn_Share.click();

        WebElement btn_Whatsapp = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_Whatsapp_Css)));
        btn_Whatsapp.click();
        setups.driver.navigate().back();


        //Click Contacts button
        WebElement btn_Contact = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_Contact_Css)));
        btn_Contact.click();


        /*
        Change Language>>

        1.Click Hebrew
        2.Click English
        */
        WebElement btn_SwitchToHebrew = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_SwitchToHebrew_Css)));
        btn_SwitchToHebrew.click();
        WebElement btn_SwitchToEnglish = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Constants.btn_SwitchToEnglish_Css)));
        btn_SwitchToEnglish.click();

    }




/*
    Menu Bar button and click on the buttons inside

    Menu button>>
     -Click Exist
     -Click Mossessco
     -Click About
     -Click Projects
     -Click MethodsVision
     -Click Career
     -Click Contact
     -Hebrew / English toggle
 */

    public void menu() {

       // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) setups.driver;

        for (String menuOptionCss : Constants.menu_buttons_Array) {
            try {
                WebElement dynamicElement = setups.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constants.btn_Menu_Css)));
                // Click on the menu button
                js.executeScript("arguments[0].click();", dynamicElement);

                // Wait for the menu option to be present and click on it
                WebElement menuOption = setups.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(menuOptionCss)));
                js.executeScript("arguments[0].click();", menuOption);
            } catch (StaleElementReferenceException e) {
                // Handle the stale element exception (e.g., retry or log)
                System.out.println("Stale element reference: " + e.getMessage());
                continue;
            }
        }
    }




/*
Bottom Nav Components

     Social Media buttons [socialMedia_buttonsArray_bottomNav] (each social media page should open in a new tab)>>
      -Click Facebook
      -Click Instagram
      -Click Whatsapp

     [bottomNav_buttonsArray]
      -Click About
      -Click Methods & Vision
      -Click Projects
      -Click Career
      -Click Contact
*/



    public void bottomNav() {

        String parentWindowHandle = setups.driver.getWindowHandle();
        for (String socialMediaOptionCss : Constants.socialMedia_buttonsArray_bottomNav) {
            WebElement socialMedia_buttons_BottomNav = setups.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(String.valueOf(socialMediaOptionCss))));
            socialMedia_buttons_BottomNav.click();
            // Switch to the new window or tab (assuming you have only one new window)
            for (String handle : setups.driver.getWindowHandles()) {
                if (!handle.equals(parentWindowHandle)) {
                    setups.driver.switchTo().window(handle);
                    // Close the new tab or page
                    setups.driver.close();
                    // Switch back to the parent window handle
                    setups.driver.switchTo().window(parentWindowHandle);
                }
            }
        }

        for (String bottomNavOptionCss : Constants.bottomNav_buttonsArray) {
            WebElement bottomNavButtons = setups.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(bottomNavOptionCss)));
            bottomNavButtons.click();
        }

    }

  /*
  Get in touch Components

    Insert Text into>>
      -First Name text field
      -Last Name text field
      -Your E-Mail text field
      -Phone Number text field
      -Send button text field
  */

    public void getInTouchForm() {
        for (String signUpTextFields : Constants.getInTouchSignUp_textArray) {
            WebElement getInTouchSignUp = setups.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(signUpTextFields)));
            getInTouchSignUp.sendKeys(Constants.testText);
        }




    }




}







