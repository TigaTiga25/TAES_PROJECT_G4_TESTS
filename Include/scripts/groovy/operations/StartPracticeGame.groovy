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



class StartPracticeGame {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("I click on the (.*) button to enter as a annonymous user")
	def I_click_on_the_button_to_enter_as_a_annonymous_user(String string) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/' + string))
	}

	@When("I click on the (.*) button to start a game")
	def I_click_on_the_button_to_start_a_game(String string) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/' + string))
	}

	@Then("I see the bot nine cards")
	def I_see_the_bot_nine_cards() {
		// If bot plays card first there will only be 8 cards on its hand
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card1'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card2'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card3'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card4'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card5'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card6'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card7'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsOpponent/card8'))
	}

	@And("I see my nine cards")
	def I_see_my_nine_cards() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card1'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card2'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card3'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card4'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card5'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card6'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card7'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card8'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/cardsPlayer/card9'))
	}
}