package Mosessco_Test.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage_TestBase {



/*---SET UPS---*/

   public Setups setups; // Add an instance of the Setups class
   public HomePage_TestBase(Setups setups) {
        this.setups = setups; // Initialize the Setups class instance
    }




/*---TEST METHODS---*/




    /*---
    click read more button
    click see more button
    click slider's buttons - "WHAT WE DO?"
    ---*/

    public void clickButtons() {
        setups.driver.get(Constants.homePageUrl);
        for (int i = 0; i < Constants.buttonsArray.length; i++) {
            for (int j = 0; j < Constants.buttonsArray[i].length; j++) {
                if (i == 0) {
                    // Find element by link text and click

                    WebElement readMoreElement = setups.wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Constants.buttonsArray[i][j])));
                    readMoreElement.click();



                }
                else if (i == 1) {
                    // Find element by ID and click

                    WebElement readMoreElement2 = setups.wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.buttonsArray[i][j])));
                    readMoreElement2.click();
                }
                setups.driver.navigate().back();
            }

        }
    }





    /*---
    Assert the bottom text - "How We Do It? ONE STOP SHOP"

    ---*/



    public void assertingText() {

        setups.driver.get(Constants.homePageUrl);


        WebElement element = setups.driver.findElement(By.cssSelector("#page-content > section.l-section.wpb_row.us_custom_2b7a87d4.height_large > div > div > div.vc_col-sm-8.wpb_column.vc_column_container > div > div > div > div > p"));

        // Print a debug statement to check if the element is found
        System.out.println("Element found: " + element);


        // Get the text of the element
        String actualText = element.getText();
        System.out.println(actualText);

        // Assert that the actual text matches the expected text
        assert actualText.equals(Constants.expectedText) : "Text element does not contain the expected phrase.";

        // If the assertion passes, the program will continue executing
        System.out.println("Assertion passed. The text element is as expected.");

    }


/////////////

}




