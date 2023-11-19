package Mosessco_Test;

import Mosessco_Test.TestBase.Constants;
import Mosessco_Test.TestBase.HomePage_TestBase;
import Mosessco_Test.TestBase.MasterPage_TestBase;
import Mosessco_Test.TestBase.Setups;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;





public class TestRunner {


/*---SET UPS---*/

    public static Setups setups;
    public static MasterPage_TestBase testBase;
    public static HomePage_TestBase testBaseHomePage;




    @BeforeAll
    public static void setUp(){
        setups = new Setups();
        setups.setUp();
        testBase = new MasterPage_TestBase(setups);
        testBaseHomePage = new HomePage_TestBase(setups);


    }

    @AfterAll
    public static void tearDown(){
    setups.tearDown();
    }





/*---TEST METHODS---*/


//--- Master Page Components -----------------------------------------------------------------------------------------



    //Open URL demo test
    @Test
    public void testOpenURL(){
        testBase.openUrl(Constants.homePageUrl);
    }


    // Test the Top Navigator components functionality
    @Test
    public void topNavTest() {
        testBase.openUrl(Constants.homePageUrl);
       testBase.topNav();

    }

    // Test the Menu Bar components functionality  [The Menu bar is a part of the Top Navigator section]
    @Test
    public void menuTest() {
        testBase.openUrl(Constants.homePageUrl);
   testBase.menu();
    }

    // Test the Bottom Navigator components functionality
    @Test
    public void bottomNavTest() {
        testBase.openUrl(Constants.homePageUrl);
        testBase.bottomNav();
    }


    // Test the "Get In Touch" form components functionality
    @Test
    public void getInTouchSignUpFormTest() {
        testBase.openUrl(Constants.homePageUrl);
        testBase.getInTouchForm();
    }





//--- Home Page Components -----------------------------------------------------------------------------------------



    //Test the buttons functionality
    @Test
    public void buttonsHomePage() {
        testBaseHomePage.clickButtons();
    }



    //Assert the bottom text - "How We Do It? ONE STOP SHOP"
    @Test
    public void assertTextHomePage() {
        testBaseHomePage.clickButtons();
    }



}
