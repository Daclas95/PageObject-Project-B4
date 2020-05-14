package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class AdminPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AdminPage.class));

    // Admin Page
    private static By AdminTab=By.id("menu_admin_viewAdminModule");
    private static By OrgTab=By.id("menu_admin_Organization");
    private static By Org_Gen_Tab=By.id("menu_admin_viewOrganizationGeneralInformation");
    private static By Org_Gen_Edit=By.xpath("//input[@id='btnSaveGenInfo']");

    // Organization General Information

    private static By Gen_Info_OrgName=By.xpath("//input[@id='organization_name']");
    // private static By Gen_Info_NumOfEmp=By.xpath("//span[@id='numOfEmployees']");
    private static By Gen_Info_Phone=By.xpath("//input[@id='organization_phone']");
    private static By Gen_Info_Email=By.xpath("//input[@id='organization_email']");
    private static By Gen_Info_AddressS1=By.xpath("//input[@id='organization_street1']");
    private static By Gen_Info_City=By.xpath("//input[@id='organization_city']");
    private static By Gen_Info_ZIP=By.xpath("//input[@id='organization_zipCode']");
    private static By Gen_Info_Note=By.xpath("//textarea[@id='organization_note']");
    private static By Gen_Info_TaxId=By.xpath("//input[@id='organization_taxId']");
    private static By Gen_Info_RegNo=By.xpath("//input[@id='organization_registraionNumber']");
    private static By Gen_Info_Fax=By.xpath("//input[@id='organization_fax']");
    private static By Gen_Info_AddressS2=By.xpath("//input[@id='organization_street2']");
    private static By Gen_Info_State=By.xpath("//input[@id='organization_province']");
    private static By Gen_Info_Country=By.xpath("//select[@id='organization_country']");
    private static By Gen_Info_SaveBtn=By.xpath("//input[@id='btnSaveGenInfo']");

    // Organization Location
    private static By Org_Loc_Tab=By.id("menu_admin_viewLocations");

    // Location Search,Add,Delete
    private static By Org_Loc_LocName=By.id("searchLocation_name");
    private static By Org_Loc_City=By.id("searchLocation_city");
    private static By Org_Loc_Country=By.xpath("//select[@id='searchLocation_country']");


    // Dashboard Display Check
    // private static By Dashboard_Display=By.id("welcome");

    // Location Search button Clk Check
    private static By Loc_Search_Btn=By.xpath("//input[@id='btnSearch']");

    // Location Reset button Clk Check
    private static By Loc_Reset_Btn=By.xpath("//input[@id='btnReset']");

    // Location Add button Clk Check
    private static By Loc_Add_Btn=By.xpath("//input[@id='btnAdd']");

    // Add Location Display Check
    private static By Add_Loc_Display=By.xpath("//h1[@id='locationHeading']");

    // Add Location Info
    private static By Location_Name=By.xpath("//input[@id='location_name']");
    private static By Location_Country=By.xpath("//select[@id='location_country']");
    private static By Location_Sta_Pro=By.xpath("//select[@id='location_state']");
    private static By Location_Sta_Pro1=By.xpath("//input[@id='location_province']");
    private static By Location_City=By.xpath("//input[@id='location_city']");
    private static By Location_Address=By.xpath("//textarea[@id='location_address']");
    private static By Location_ZIP=By.xpath("//input[@id='location_zipCode']");
    private static By Location_Phone=By.xpath("//input[@id='location_phone']");
    private static By Location_Fax=By.xpath("//input[@id='location_fax']");
    private static By Location_Note=By.xpath("//textarea[@id='location_notes']");


    private static By Loc_Save_Btn=By.xpath("//input[@id='btnSave']");
    private static By Loc_Cancel_Btn=By.xpath("//input[@id='btnCancel']");

    //Location Before Delete Del Item Selection Check
    private static By Loc_Sel_Del_Item=By.xpath("//input[@id='ohrmList_chkSelectRecord_2']");

    // Location Delete button Clk Check
    private static By Loc_Del_Btn=By.xpath("//input[@id='btnDelete']");

    // Location Ok Button Clk Check
    private static By Del_Con_Btn=By.xpath("//input[@id='dialogDeleteBtn']");

    // Location Cancel Button Clk Check
    private static By Can_Con_Btn=By.xpath("//input[@value='Cancel']");

    // Location Expand Show  Option Chk
    private static By Loc_Exp_SBtn=By.xpath("//div[@class='head']");

    // Location Expand Hide  Option Chk
    // private static By Loc_Exp_HBtn=By.xpath("//a[@class='toggle tiptip activated']");









    /*

      public static boolean isAdminPageHeaderDisplayed() throws InterruptedException
    {
        return getDriver().findElement(AdminPageHeader).isDisplayed();
    }

     */

    public static void AdminClk ()  {
        getDriver().findElement(AdminTab).click();
        LOGGER.info("Admin Tab Clicked");

    }

    public static void OrganizationClk () {
        getDriver().findElement(OrgTab).click();
        LOGGER.info("Organization Tab Clicked");

    }

    public static void Org_Gen_Info_Clk ()  {
        getDriver().findElement(Org_Gen_Tab).click();
        LOGGER.info("Organization Gen Tab Clicked");

    }

    public static void Org_Gen_Edit_Clk ()  {
        getDriver().findElement(Org_Gen_Edit).click();
        LOGGER.info("Organization Gen Edit Btn Clicked");

    }

    public   static void Fill_Org_Gen_Info () {

        getDriver().findElement(Gen_Info_OrgName).clear();
        getDriver().findElement(Gen_Info_OrgName).sendKeys("John_Shajanthan (Pvt) Ltd");
        LOGGER.info("Organization Name Ok");


        getDriver().findElement(Gen_Info_Phone).clear();
        getDriver().findElement(Gen_Info_Phone).sendKeys("+94761514888");
        LOGGER.info("Organization Phone Ok");


        getDriver().findElement(Gen_Info_Email).clear();
        getDriver().findElement(Gen_Info_Email).sendKeys("johnshajanthan@gmail.com");
        LOGGER.info("Organization Email Ok");


        getDriver().findElement(Gen_Info_AddressS1).clear();
        getDriver().findElement(Gen_Info_AddressS1).sendKeys("No:31,Madathady Lane,Kondavil");
        LOGGER.info("Organization Address Street 1 Ok");


        getDriver().findElement(Gen_Info_City).clear();
        getDriver().findElement(Gen_Info_City).sendKeys("Jaffna");
        LOGGER.info("Organization City Ok");


        getDriver().findElement(Gen_Info_ZIP).clear();
        getDriver().findElement(Gen_Info_ZIP).sendKeys("40000");
        LOGGER.info("Organization ZIP Code Ok");


        getDriver().findElement(Gen_Info_Note).clear();
        getDriver().findElement(Gen_Info_Note).sendKeys("QA");
        LOGGER.info("Organization Note Ok");


        getDriver().findElement(Gen_Info_TaxId).clear();
        getDriver().findElement(Gen_Info_TaxId).sendKeys("82281463");
        LOGGER.info("Organization TAX Ok");


        getDriver().findElement(Gen_Info_RegNo).clear();
        getDriver().findElement(Gen_Info_RegNo).sendKeys("A12345678");
        LOGGER.info("Organization Reg_No Ok");


        getDriver().findElement(Gen_Info_Fax).clear();
        getDriver().findElement(Gen_Info_Fax).sendKeys("+94212214565");
        LOGGER.info("Organization FAX Ok");


        getDriver().findElement(Gen_Info_AddressS2).clear();
        getDriver().findElement(Gen_Info_AddressS2).sendKeys("No:11,John Lane,Kokuvil");
        LOGGER.info("Organization AddressS2 Ok");


        getDriver().findElement(Gen_Info_State).clear();
        getDriver().findElement(Gen_Info_State).sendKeys("Northern");
        LOGGER.info("Organization State Ok");


        getDriver().findElement(Gen_Info_Country).sendKeys("Sri Lanka");
        LOGGER.info("Organization Country Ok");


        getDriver().findElement(Gen_Info_SaveBtn).click();
        LOGGER.info("Successfully Modified General Info");

    }

    public static void Org_Location_Clk ()  {
        getDriver().findElement(Org_Loc_Tab).click();
        LOGGER.info("Organization Loc Tab Clicked");

    }

    public static void Set_Org_Location (String LocationName)  {
        getDriver().findElement(Org_Loc_LocName).sendKeys(LocationName);
        LOGGER.info("Set Loc Name");

    }

    public static void Set_Org_City (String City) {
        getDriver().findElement(Org_Loc_City).sendKeys(City);
        LOGGER.info("Set City");

    }

    public static  void Set_Org_Country (String Country) {
        getDriver().findElement(Org_Loc_Country).sendKeys(Country);
        LOGGER.info("Set Country");

    }

    public static void Loc_Sea_Btn_Clk (){
        getDriver().findElement(Loc_Search_Btn).click();
        LOGGER.info("Location Search button Clicked Successfully");

    }

    /*
     public static void Loc_Res_Btn_Clk () throws InterruptedException {
        getDriver().findElement(Loc_Reset_Btn).click();
        LOGGER.info("Location Reset button Clicked Successfully");
        Thread.sleep(3000);
    }
     */

    public static  void Loc_Add_Btn_Clk ()  {
        getDriver().findElement(Loc_Add_Btn).click();
        LOGGER.info("Location Add button Clicked Successfully");

    }


    public static void Set_Loc_Name (String Name){
        getDriver().findElement(Location_Name).sendKeys(Name);
        LOGGER.info("Set Location Name");

    }

    public static void Set_Loc_Country (String Country) {

//        if(Country.equals("United States"))
//        {
//            getDriver().findElement(Location_Country).sendKeys(Country);
//            LOGGER.info("Set Location Country");
//            Thread.sleep(3000);
//            Set_Loc_Sta("Texas");
//        }
//
//        else
//        {
//            getDriver().findElement(Location_Country).sendKeys(Country);
//            LOGGER.info("Set Location Country");
//            Thread.sleep(3000);
//            Set_Loc_Sta1("KastaMasta");
//
//        }

    }


    public static void Set_Loc_Sta (String State) throws InterruptedException {

        getDriver().findElement(Location_Sta_Pro).sendKeys(State);
        LOGGER.info("Set Location State");
        Thread.sleep(3000);
    }

    public static void Set_Loc_Sta1 (String State1) throws InterruptedException {

        getDriver().findElement(Location_Sta_Pro1).sendKeys(State1);
        LOGGER.info("Set Location State1");
        Thread.sleep(3000);
    }



    public static void Set_Loc_City (String City)  {
        getDriver().findElement(Location_City).sendKeys(City);
        LOGGER.info("Set Location City");

    }

    public static void Set_Loc_Address (String Address) {
        getDriver().findElement(Location_Address).sendKeys(Address);
        LOGGER.info("Set Location Address");

    }

    public static  void Set_Loc_ZIP (String ZIP)  {
        getDriver().findElement(Location_ZIP).sendKeys(ZIP);
        LOGGER.info("Set Location ZIP Code");

    }

    public static void Set_Loc_Phone (String Phone)  {
        getDriver().findElement(Location_Phone).sendKeys(Phone);
        LOGGER.info("Set Location Phone");

    }

    public static void Set_Loc_Fax (String Fax){
        getDriver().findElement(Location_Fax).sendKeys(Fax);
        LOGGER.info("Set Location Fax");

    }

    public static void Set_Loc_Note (String Note)  {
        getDriver().findElement(Location_Note).sendKeys(Note);
        LOGGER.info("Set Location Fax");

    }

    public static void Loc_Save_Btn_Clk ()  {
        getDriver().findElement(Loc_Save_Btn).click();
        LOGGER.info("Location Save button Clicked Successfully");

    }

    public static void Loc_Cancel_Btn_Clk ()  {
        getDriver().findElement(Loc_Cancel_Btn).click();
        LOGGER.info("Location Cancel button Clicked Successfully");

    }

    public static void Loc_Delete_Btn_Clk () {
        getDriver().findElement(Loc_Sel_Del_Item).click();

        LOGGER.info("Location Checkbox Clicked Successfully");

        getDriver().findElement(Loc_Del_Btn).click();

        LOGGER.info("Delete Button Clicked Successfully");

    }

    public static void Loc_Delete_Ok_Btn_Clk (){
        getDriver().findElement(Del_Con_Btn).click();

        LOGGER.info("Ok Button Clicked Successfully");

    }

    public static void Loc_Delete_Cancel_Btn_Clk () throws InterruptedException {
        getDriver().findElement(Can_Con_Btn).click();
        Thread.sleep(2000);
        LOGGER.info("Cancel Button Clicked Successfully");
        Thread.sleep(3000);
    }

    /*

    public static void Loc_Exp_Btn_Clk () throws InterruptedException
    {
        if (getDriver().findElement(Loc_Search_Btn).isDisplayed())
        {
            getDriver().findElement(Loc_Exp_SBtn).click();
            Thread.sleep(2000);
            LOGGER.info("Hide Successfully ");
            Thread.sleep(3000);
        }
        else
            {
            getDriver().findElement(Loc_Exp_SBtn).click();
            Thread.sleep(2000);
            LOGGER.info("Show Successfully ");
            Thread.sleep(3000);
            }
    }

     */


}
