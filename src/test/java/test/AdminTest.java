package test;

import com.pages.AdminPage;
import org.testng.annotations.Test;
import utils.TestBase;

public class AdminTest extends TestBase {

    @Test

    public void AdminTst() {



        AdminPage.AdminClk();

        AdminPage.OrganizationClk();
        AdminPage.Org_Gen_Info_Clk();
        AdminPage.Org_Gen_Edit_Clk();
        AdminPage.Fill_Org_Gen_Info();

        AdminPage.OrganizationClk();
        AdminPage.Org_Location_Clk();

        AdminPage.Set_Org_Location("Texas R&D");
        AdminPage.Set_Org_City("");
        AdminPage.Set_Org_Country("United States");
        AdminPage.Loc_Sea_Btn_Clk();

        AdminPage.Loc_Add_Btn_Clk();


        AdminPage.Set_Loc_Name("QA Training Centre");
        AdminPage.Set_Loc_Country("United States");
        AdminPage.Set_Loc_City("Emeraland");
        AdminPage.Set_Loc_Address("No:123,Beach Road,Texas South");
        AdminPage.Set_Loc_ZIP("13579");
        AdminPage.Set_Loc_Phone("+1 123 456 1789");
        AdminPage.Set_Loc_Fax("+1 231 125 1567");
        AdminPage.Set_Loc_Note("Software Engineering");
        AdminPage.Loc_Save_Btn_Clk();

        AdminPage.Loc_Add_Btn_Clk();

        AdminPage.Set_Loc_Name("Software Training Centre");
        AdminPage.Set_Loc_Country("Taiwan");
        AdminPage.Set_Loc_City("Emeraland");
        AdminPage.Set_Loc_Address("No:123,Beach Road,Texas South");
        AdminPage.Set_Loc_ZIP("13579");
        AdminPage.Set_Loc_Phone("+1 123 456 1789");
        AdminPage.Set_Loc_Fax("+1 231 125 1567");
        AdminPage.Set_Loc_Note("Senior Software Engineering");
        AdminPage.Loc_Cancel_Btn_Clk();

        /*
        LoginPage.Loc_Delete_Btn_Clk();
        LoginPage.Loc_Delete_Cancel_Btn_Clk();
         */
        AdminPage.Loc_Delete_Btn_Clk();
        AdminPage.Loc_Delete_Ok_Btn_Clk();

    }
}
