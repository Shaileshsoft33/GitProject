package StepDef;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageStepDef extends BaseClass
{
	@BeforeStep
	public void abc() throws InterruptedException
	{
		Thread.sleep(4000);
	}
	PIMPage pimpage;
	@When("user click on PIM Link")
	public void user_click_on_pim_link() 
	{
		pimpage= new PIMPage();
		pimpage.pimLink();
	    
	}
	@When("user click on AddEmplyeeButton")
	public void user_click_on_add_emplyee_button() {
	    pimpage.addEmployee();
	}
	@When("user enter FirstName and MiddelName and LastName")
	public void user_enter_first_name_and_middel_name_and_last_name() {
	    pimpage.addEmpFuncationality("Kajal", "Shankar", "Thorat");
	}
	@Then("click on Save Button")
	public void click_on_save_button() {
	   pimpage.SaveButton();
	}


}
