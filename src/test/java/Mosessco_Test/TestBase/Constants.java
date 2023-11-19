package Mosessco_Test.TestBase;

public class Constants {

//URLS
  public static final String homePageUrl = "https://www.mosessco.com/";


/*--- MAster Page Components -----------------------------------------------------------------------------------------*\



 */
/*--- Top Nav Components ---*\

  /*--- Mosessco Architecture button --- */
    public static final String btn_MosesscoAchitectureTeam_Css = "img[src=\"https://www.mosessco.com/wp-content/uploads/2020/06/logo-white1.png\"]";





    /*
    -Share button>>
       -Mail button
       -Facebook button
       -Whatsapp button
    */

    public static final String btn_Share_Css ="#page-header > div.l-subheader.at_middle > div > div.l-subheader-cell.at_right > div > div > div.w-dropdown-current > a";
    public static final String btn_Facebook_Css = "#page-header > div.l-subheader.at_middle > div > div.l-subheader-cell.at_right > div > div > div.w-dropdown-list > div > a:nth-child(1)";
    public static final String btn_Mail_Css = "#page-header > div.l-subheader.at_middle > div > div.l-subheader-cell.at_right > div > div > div.w-dropdown-list > div > a:nth-child(2)";
    public static final String btn_Whatsapp_Css = "i[class=\"fab fa-whatsapp\"]";


    // Contacts button
    public static final String btn_Contact_Css = "#page-header > div.l-subheader.at_middle > div > div.l-subheader-cell.at_right > div.w-text.hidden_for_tablets.hidden_for_mobiles.ush_text_3 > a > span";


    /*
    Change Language buttons>>
      -Hebrew
      -English
     */
    public static final String btn_SwitchToHebrew_Css = "#menu-item-1640-he > a";
    public static final String btn_SwitchToEnglish_Css = "#menu-item-1640-en > a";



    /*
    Menu button>>
     -Exist button
     -Mossessco button
     -About button
     -Projects button
     -MethodsVision button
     -Career button
     -Contact button
     -Hebrew / English toggle button
    */


    public static final String btn_Menu_Css = "#page-header > div.l-subheader.at_middle > div > div.l-subheader-cell.at_right > nav > a";
    public static final String btn_ExitMenu_Css = "#page-header > div.l-subheader.at_middle > div > div.l-subheader-cell.at_right > nav > ul > li.w-nav-close";
    public static final String btn_Mosessco_fromMenu_Css = "#menu-item-139 > a > span.w-nav-title";
    public static final String btn_About_fromMenu_Css = "#menu-item-198 > a > span.w-nav-title";
    public static final String btn_Projects_fromMenu_Css = "#menu-item-711 > a > span.w-nav-title";
    public static final String btn_MethodsVision_fromMenu_Css = "#menu-item-247 > a > span.w-nav-title";
    public static final String btn_Career_fromMenu_Css = "#menu-item-404 > a > span.w-nav-title";
    public static final String btn_Conatct_fromMenu_Css = "#menu-item-405 > a > span.w-nav-title";
    public static final String btn_HebrewSwitch_fromMenu_Css = "#menu-item-1399-he > a > span.w-nav-title";
    public static final String btn_EnglishSwitch_fromMenu_Css = "#menu-item-1398-en > a > span.w-nav-title";

    // Array of all the menu buttons
    public static final String [] menu_buttons_Array = {
            btn_ExitMenu_Css,
            btn_Mosessco_fromMenu_Css,
            btn_About_fromMenu_Css,
            btn_Projects_fromMenu_Css,
            btn_MethodsVision_fromMenu_Css,
            btn_Career_fromMenu_Css,
            btn_Conatct_fromMenu_Css,
            btn_HebrewSwitch_fromMenu_Css,
            btn_EnglishSwitch_fromMenu_Css
    };





/*
Bottom Nav Components

     Social Media>>
      -Facebook button
      -Instagram button
      -Whatsapp button

      -About button
      -Methods & Vision button
      -Projects button
      -Career button
      -Contact button
*/


  public static final String Facebook_btn_bottomNav_Css = "#page-footer > section.l-section.wpb_row.us_custom_e777ee55.height_small.has_text_color > div > div > div.vc_col-sm-3.wpb_column.vc_column_container > div > div > div > div > div.w-socials-item.facebook";
  public static final String Instagram_btn_bottomNav_Css = "#page-footer > section.l-section.wpb_row.us_custom_e777ee55.height_small.has_text_color > div > div > div.vc_col-sm-3.wpb_column.vc_column_container > div > div > div > div > div.w-socials-item.instagram";
  public static final String Whatsapp_btn_bottomNav_Css = "#page-footer > section.l-section.wpb_row.us_custom_e777ee55.height_small.has_text_color > div > div > div.vc_col-sm-3.wpb_column.vc_column_container > div > div > div > div > div.w-socials-item.whatsapp";

  // Social Media buttons Array - Bottom Navigator
  public static final String [] socialMedia_buttonsArray_bottomNav =
          {
                  Facebook_btn_bottomNav_Css,
                  Instagram_btn_bottomNav_Css,
                  Whatsapp_btn_bottomNav_Css
          };


  public static final String About_btn_bottomNav_Css = "#menu-item-558 > a";
  public static final String MethodsVision_btn_bottomNav_Css = "#menu-item-557 > a";
  public static final String Projects_btn_bottomNav_Css = "#menu-item-710 > a";
  public static final String Career_btn_bottomNav_Css = "#menu-item-554 > a";
  public static final String Contact_btn_bottomNav_Css = "#menu-item-555 > a";



  // Other buttons Array - Bottom Navigator
  public static final String [] bottomNav_buttonsArray =
          {
                  About_btn_bottomNav_Css,
                  MethodsVision_btn_bottomNav_Css,
                  Projects_btn_bottomNav_Css,
                  Career_btn_bottomNav_Css,
                  Contact_btn_bottomNav_Css
          };



  /*
  Get in touch Components

    -First Name text field
    -Last Name text field
    -Your E-Mail text field
    -Phone Number text field
    -Send button text field
  */

  public static final String FirstName_TextField_Css ="#input_5_1";
  public static final String LastName_TextField_Css ="#input_5_2";
  public static final String Email_TextField_Css ="#input_5_4";
  public static final String PhoneNumber_TextField_Css ="#input_5_4";
  public static final String Send_Button_Css ="#gform_submit_button_5";

  public static final String [] getInTouchSignUp_textArray =
          {
            FirstName_TextField_Css,
                  LastName_TextField_Css,
                  Email_TextField_Css,
                  PhoneNumber_TextField_Css,
                  Send_Button_Css
          };

  //Test String for Text Fields
  public static final String testText= "Test";







/*---Home Page Components---------------------------------------------------------------------------------------------*\


  /*
   read more button
   SEE ALL button
  */

  public static final String readMore_btn_linkText = "read more ->";
  public static final String seeAll_btn_linkText = "SEE ALL ->";



  /*
   Bottom Slider buttons - "WHAT WE DO?"
    -CAMPUSES
    -ALL
    -URBAN PLANNING
  */

  public static final String campuses_ID = "slider-6-slide-716-layer-2";
  public static final String all_ID = "slider-6-slide-1142-layer-4";
  public static final String urbanPlanning_ID = "slider-6-slide-728-layer-2";




    public static final String[][] buttonsArray = {
            {readMore_btn_linkText,seeAll_btn_linkText},
            {campuses_ID,all_ID,urbanPlanning_ID},
    };





    // Expected text - the bottom text - "How We Do It? ONE STOP SHOP"
    public static String expectedText ="We refer to any structure designed under our hands as a creation, from which the people who use it or\n" +
            "those who see it will benefit. The best creative minds in the office are involved in the design process,\n" +
            "which is characterized by different design approaches. They analyze the environment, the character\n" +
            "lines of the client and of the project and come up with diverse ideas for the design of the structure and\n" +
            "the client’s choice.";




    ///////

}
