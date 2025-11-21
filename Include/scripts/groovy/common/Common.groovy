package common
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



class Common {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open the browser")
	def I_open_the_browser() {
		WebUI.openBrowser('http://localhost:5173/')
		println "Given->I have the browser open"
	}

	@And("I enter as an annonymous user")
	def I_enter_as_an_anonymous_user() {
		WebUI.click(findTestObject('Object Repository/LoginPage/AnonymousButton'))
		println "And->I enter as an annonymous user"
	}

	@And("I start a practice game")
	def I_start_a_practice_game() {
		WebUI.click(findTestObject('Object Repository/HomePage/practiceMatchButton'))
		println "And->I start a practice game"
	}

	@When("I navigate to the URL (.*)")
	def I_navigate_to_the_URL(String name) {
		//WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		WebUI.navigateToUrl(name)

		println "When->I navigate to the URL" + name
	}

	@And("I close the browser")
	def I_close_the_browser() {
		WebUI.closeBrowser()
		println "And -> I close the browser"
	}


	@Then("I click on the (.*) button to login")
	def I_click_on_the_button_to_login(String string) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/' + string))
	}
}