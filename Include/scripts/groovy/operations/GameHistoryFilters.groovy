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
import com.kms.katalon.core.exception.StepErrorException

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



class GameHistoryFilters {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("I filter matches by wins")
	def I_filter_matches_by_wins() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/GameHistory/selectResult'), 'win', true)
	}
	
	@And("I filter matches by losses")
	def I_filter_matches_by_losses() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/GameHistory/selectResult'), 'loss', true)
	}

	@Then("I should be able to see my wins")
	def I_should_be_able_to_see_my_wins() {
		// Get class of element
		String classAttribute = WebUI.getAttribute(findTestObject('Object Repository/GameHistory/matchCards'), 'class')

		if (!classAttribute.contains('from-blue-400')) {
			WebUI.comment("First match isn't a win")
			throw new StepErrorException("Not filtered by wins")
		}
	}
	
	@Then("I should be able to see my losses")
	def I_should_be_able_to_see_my_losses() {
		// Get class of element
		String classAttribute = WebUI.getAttribute(findTestObject('Object Repository/GameHistory/matchCards'), 'class')

		if (!classAttribute.contains('from-red-400')) {
			WebUI.comment("First match isn't a loss")
			throw new StepErrorException("Not filtered by losses")
		}
	}
}