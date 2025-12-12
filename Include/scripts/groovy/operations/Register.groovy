package operations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@And("I try to register as a new user")
	def I_try_to_register_as_a_new_user() {
		WebUI.click(findTestObject('Object Repository/LoginPage/button_SignUp'))
	}
	
	@When("I place in brand new credentials")
	def I_place_in_brand_new_credentials() {
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Email'), "TestEmail_" + System.currentTimeMillis() + "@mail.pt")
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Nickname'), "TestUser_" + System.currentTimeMillis())
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Password'), System.currentTimeMillis().toString())
		WebUI.waitForPageLoad(5)
	}
	
	@When("I place in existing credentials")
	def I_place_in_existing_credentials() {
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Email'), GlobalVariable.defaultUser)
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Nickname'), "TestUser_" + System.currentTimeMillis())
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Password'), System.currentTimeMillis().toString())
		WebUI.waitForPageLoad(5)
	}

	@And("I press the register button")
	def I_press_the_register_button() {
		WebUI.click(findTestObject('Object Repository/RegisterPage/button_Criar_Conta'))
	}

	@Then("I should see that my account was successfully created")
	def I_should_see_that_my_account_was_successfully_created() {
		WebUI.waitForAlert(15)
	}
	
	@Then("I should see an email required error")
	def I_should_see_an_email_required_error() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterPage/error_email_required'))
	}
	
	@Then("I should see an email taken error")
	def I_should_see_an_email_taken_error() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/RegisterPage/error_email_taken'))
	}
}