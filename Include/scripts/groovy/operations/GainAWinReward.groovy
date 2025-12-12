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



class GainAWinReward {
	
	
	@Then("I see my new coins balance")
	def I_see_my_new_coins_balance() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/div_About_inline-flex items-center justify-_4ac8e6'))
	}
	
	@When("I win the match")
	def I_win_the_match() {
		WebUI.click(findTestObject('Object Repository/GameBoardPage/winMatchEasterEgg'))
	}
	
	@And("I verify that the game is over")
	def I_verify_that_the_game_is_over() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/p_YOU WIN_text-lg text-black-600'), 'Coins earned: 20')
	}
	
	@And("I return to home page")
	def I_return_to_home_page(){		
		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_GAME 1_btn bg-gray-500 hoverbg-gray-_b6f7c0'))
	}
}