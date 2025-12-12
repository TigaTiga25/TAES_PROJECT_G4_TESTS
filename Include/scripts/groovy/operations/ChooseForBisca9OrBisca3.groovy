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



class ChooseForBisca9OrBisca3 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("I choose for a bisca3")
	def I_choose_for_a_bisca3() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vite App/select_Start a practice game_w-full px-4 py_2ecde0'),
				'3', true)

		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Start a practice game_px-5 py-2 bg-e_67c576'))
	}

	@Then("I see only three cards per player")
	def I_see_only_three_cards_per_player() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card4'), 0)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card4'), 0)
	}
}